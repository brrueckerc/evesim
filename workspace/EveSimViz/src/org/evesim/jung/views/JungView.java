package org.evesim.jung.views;

import java.awt.Frame;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.evesim.EveComponent;
import org.evesim.EvesimPackage;
import org.evesim.jung.EveToGraphConverter;

import edu.uci.ics.jung.graph.Graph;


public class JungView extends Composite {
	private ResourceSet res;
	private EveComponent root;
	private ShowLayouts layout;
	private Frame frame;
	private EveToGraphConverter converter;
	private Graph<String,String> g;
	private Composite parent;
	private int count = 0;

	public JungView(Composite parent, int style, ResourceSet res) {
		super(parent, style);

		this.frame = SWT_AWT.new_Frame(this);
		this.res = res;
		this.parent = parent;

		EveComponent rootComponent = null;
		if (res.getResources().get(0).getContents().get(0) instanceof EveComponent) {
			rootComponent = (EveComponent) res.getResources().get(0).getContents().get(0);
		}


		EContentAdapter adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				switch (notification.getFeatureID(EveComponent.class)) {
				case EvesimPackage.EVE_COMPONENT__ATTACHED_CONNECTIONS:
				case EvesimPackage.EVE_COMPONENT__CHILDREN:
					notifyChangedItem(notification);
					return;
				}
			}
		};

		rootComponent.getRootComponent().eAdapters().add(adapter);

		this.root = rootComponent;
		this.converter = new EveToGraphConverter();
		this.g = converter.convert(this.root);

		this.layout = new ShowLayouts();
		layout.setVisualizing_graph(g);
		layout.start();		
		frame.add(layout);

	}

	public void notifyChangedItem(Notification notification){
//		if(count > 100){
//			this.layout.stop();
//			EveComponent rootComponent = null;
//			if(notification.getNotifier() instanceof EveComponent){
//				EveComponent notif = (EveComponent)notification.getNotifier();
//				notif.getRootComponent();
//				rootComponent = notif.getRootComponent();
//			}
//
//			this.root = rootComponent;
//			this.g = converter.convert(this.root);
//
//			this.layout.setVisualizing_graph(g);
//			
//			this.layout.start();
//			this.layout(true);
//			this.parent.layout(true);
//
//
//			count = 0;
//		}
//		else{
//			count++;
//		}

	}

}

