package org.evesim.jung.views;
/*
 * Copyright (c) 2003, the JUNG Project and the Regents of the University of
 * California All rights reserved.
 * 
 * This software is open-source under the BSD license; see either "license.txt"
 * or http://jung.sourceforge.net/license.txt for a description.
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.evesim.jung.EveCalculateJungProperties;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout2;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout2;
import edu.uci.ics.jung.algorithms.layout.util.Relaxer;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.CrossoverScalingControl;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ScalingControl;
import edu.uci.ics.jung.visualization.decorators.PickableVertexPaintTransformer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.layout.LayoutTransition;
import edu.uci.ics.jung.visualization.util.Animator;


/**
 * Demonstrates several of the graph layout algorithms.
 * Allows the user to interactively select one of several graphs, and one of
 * several layouts, and visualizes the combination.
 * 
 * @author Danyel Fisher
 * @author Joshua O'Madadhain
 * adapted by Christoph Rücker
 */
@SuppressWarnings("serial")
public class ShowLayouts extends JApplet {
	private Graph<String,String> visualizing_graph = null;
	protected static Graph<? extends Object, ? extends Object>[] g_array;
	protected static int graph_index;

	/**
	 * 
	 * @author danyelf
	 */

	private final class LayoutChooser implements ActionListener
	{
		private final JComboBox jcb;
		private final VisualizationViewer<Integer,Number> vv;

		private LayoutChooser(JComboBox jcb, VisualizationViewer<Integer,Number> vv)
		{
			super();
			this.jcb = jcb;
			this.vv = vv;
		}

		public void actionPerformed(ActionEvent arg0)
		{
			Class<? extends Layout<Integer,Number>> layoutC = 
				(Class<? extends Layout<Integer,Number>>) jcb.getSelectedItem();
			//            Class lay = layoutC;
			try
			{
				Constructor<? extends Layout<Integer, Number>> constructor = layoutC
						.getConstructor(new Class[] {Graph.class});
				Object o = constructor.newInstance(visualizing_graph);
				Layout<Integer,Number> l = (Layout<Integer,Number>) o;
				l.setInitializer(vv.getGraphLayout());
				l.setSize(vv.getSize());

				LayoutTransition<Integer,Number> lt =
					new LayoutTransition<Integer,Number>(vv, vv.getGraphLayout(), l);
				Animator animator = new Animator(lt);
				animator.start();
				vv.getRenderContext().getMultiLayerTransformer().setToIdentity();
				vv.repaint();

			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	private JPanel getGraphPanel()
	{

		// initial graph
		final VisualizationViewer<Integer,Number> vv = 
			new VisualizationViewer<Integer,Number>(new FRLayout(this.visualizing_graph));

		vv.getRenderContext().setVertexFillPaintTransformer(new PickableVertexPaintTransformer<Integer>(vv.getPickedVertexState(), Color.red, Color.green));
		//vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
		vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		final DefaultModalGraphMouse<Integer,Number> graphMouse = new DefaultModalGraphMouse<Integer,Number>();
		vv.setGraphMouse(graphMouse);

		final ScalingControl scaler = new CrossoverScalingControl();

		JButton plus = new JButton("Zoom In");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scaler.scale(vv, 1.1f, vv.getCenter());
			}
		});
		JButton minus = new JButton("Zoom Out");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scaler.scale(vv, 1/1.1f, vv.getCenter());
			}
		});
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Layout<Integer,Number> layout = vv.getGraphLayout();
				layout.initialize();
				Relaxer relaxer = vv.getModel().getRelaxer();
				if(relaxer != null) {
					//				if(layout instanceof IterativeContext) {
					relaxer.stop();
					relaxer.prerelax();
					relaxer.relax();
				}
			}});

		JComboBox modeBox = graphMouse.getModeComboBox();
		modeBox.addItemListener(((DefaultModalGraphMouse<Integer,Number>)vv.getGraphMouse()).getModeListener());

		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		jp.setLayout(new BorderLayout());
		jp.add(vv, BorderLayout.CENTER);
		Class[] combos = getCombos();
		final JComboBox jcb = new JComboBox(combos);
		// use a renderer to shorten the layout name presentation
		jcb.setRenderer(new DefaultListCellRenderer() {
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
				String valueString = value.toString();
				valueString = valueString.substring(valueString.lastIndexOf('.')+1);
				return super.getListCellRendererComponent(list, valueString, index, isSelected,
						cellHasFocus);
			}
		});
		jcb.addActionListener(new LayoutChooser(jcb, vv));
		jcb.setSelectedItem(FRLayout.class);

		JPanel control_panel = new JPanel(new GridLayout(2,1));
		JPanel topControls = new JPanel();
		JPanel bottomControls = new JPanel();
		control_panel.add(topControls);
		control_panel.add(bottomControls);
		jp.add(control_panel, BorderLayout.NORTH);

		if(this.visualizing_graph.getVertexCount() > 0 && this.visualizing_graph.getVertexCount() < 200){
			JPanel table_panel = new JPanel();
			EveCalculateJungProperties calc = new EveCalculateJungProperties();
			ArrayList<Double> properties = calc.calculate(this.visualizing_graph);

			String columnNames[] = {"","Average Path Length","", "Clustering Coefficient (Transitivity)","", ""}; 
			String tabledata[][] = {{"Network",properties.get(0).toString(),"", properties.get(1).toString(), "",""},{"Generated Network",properties.get(2).toString(),"", properties.get(3).toString(), "",""},{"Ratio",properties.get(4).toString(),"",properties.get(5).toString(), "",""}};
			DefaultTableModel model = new DefaultTableModel(tabledata,columnNames);
			JTable table = new JTable(model){
				public Dimension getPreferredScrollableViewportSize() {
					return getPreferredSize();
				}
			};
			table.setEnabled(true);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table_panel.setLayout(new BorderLayout());

			JTableHeader header = table.getTableHeader();
			header.setEnabled(false);
			header.setBackground(Color.white);
			JScrollPane pane = new JScrollPane(table);
			table_panel.add(pane);


			jp.add(table_panel,BorderLayout.SOUTH);
		}
		topControls.add(jcb);		 
		bottomControls.add(plus);
		bottomControls.add(minus);
		bottomControls.add(modeBox);
		bottomControls.add(reset);
		return jp;
	}

	public void setVisualizing_graph(Graph visualizingGraph) {
		visualizing_graph = visualizingGraph;
	}

	public void start()
	{
		this.getContentPane().removeAll();
		this.getContentPane().add(getGraphPanel());
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static Class<? extends Layout>[] getCombos()
	{
		List<Class<? extends Layout>> layouts = new ArrayList<Class<? extends Layout>>();
		layouts.add(KKLayout.class);
		layouts.add(FRLayout.class);
		layouts.add(FRLayout2.class);
		layouts.add(CircleLayout.class);
		layouts.add(SpringLayout.class);
		layouts.add(SpringLayout2.class);
		layouts.add(ISOMLayout.class);

		/* * KKLayout - The Kamada-Kawai algorithm for node layout
		 * FRLayout - The Fruchterman-Rheingold algorithm
		 * SpringLayout - A simple force-directed spring-embedder
		 * ISOMLayout - Meyer's "Self-Organizing Map" layout.
		 * CircleLayout - A simple layout places vertices randomly on a circle */
		return layouts.toArray(new Class[0]);
	}

}
