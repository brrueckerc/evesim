package org.evesim.worldwind.views;

import gov.nasa.worldwind.Model;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;
import gov.nasa.worldwind.layers.AnnotationLayer;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.layers.Earth.MSVirtualEarthLayer;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionService;
import org.evesim.EveComponent;
import org.evesim.worldwind.WorldWindProvider;

public class WorldWindViewComposite extends Composite {
	// private static final Logger logger = Logger.getLogger(EarthView.class);

	public static final String ID = WorldWindViewComposite.class.getName();
	private WorldWindowGLCanvas world;

	private EveComponent rootComponent = null;
	private RenderableLayer renderableLayer = null;
	private AnnotationLayer annotationLayer = null;
	private ISelectionService selectionService = null;
	private WorldWindProvider provider = null;
	private ISelectionProvider selectionProvider;

	public WorldWindViewComposite(Composite parent, int style, ResourceSet res, ISelectionService s, ISelectionProvider selectionProvider) {
		super(parent, style);
		this.selectionProvider = selectionProvider;
		setSelectionService(s);

		if (res.getResources().get(0).getContents().get(0) instanceof EveComponent) {
			rootComponent = (EveComponent) res.getResources().get(0).getContents().get(0);
			// GEarthViewController.getInstance().registerTree(rootComponent);
		} else {
			throw new RuntimeException("Resource is not instance of EveComponent. View not accessible.");
		}		
		createPartControl(this);
	}
	
	public ISelectionProvider getSelectionProvider() {
		return selectionProvider;
	}

	public void createPartControl(Composite parent) {
		java.awt.Frame frame = SWT_AWT.new_Frame(parent);
		java.awt.Panel panel = new java.awt.Panel(new java.awt.BorderLayout());
		world = new WorldWindowGLCanvas();

		Model m = (Model) WorldWind.createConfigurationComponent(AVKey.MODEL_CLASS_NAME);

		m.getLayers().add(new MSVirtualEarthLayer());
		world.setModel(m);

		provider = new WorldWindProvider(this, world, rootComponent, selectionService);

		
		panel.add(world);
		frame.add(panel);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		if (provider != null) {
			provider.dispose();
			provider = null;
		}
	}

	/*
	 * Initialize WW model with default layers
	 */
	void initWorldWindLayerModel() {
		Model m = (Model) WorldWind.createConfigurationComponent(AVKey.MODEL_CLASS_NAME);
		world.setModel(m);
	}

	@Override
	public void redraw() {
		super.redraw();
		world.redraw();

	}

	protected void setSelectionService(ISelectionService s) {
		this.selectionService = s;
	}

}
