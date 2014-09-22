package org.evesim.worldwind;

import gov.nasa.worldwind.WorldWindow;
import gov.nasa.worldwind.event.SelectEvent;
import gov.nasa.worldwind.event.SelectListener;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.AnnotationLayer;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.PatternFactory;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.monitor.EveMonitorNode;
import org.evesim.worldwind.views.WorldWindViewComposite;

public class WorldWindProvider implements SelectListener, ISelectionListener {

	private Hashtable<EveComponent, ISelectable> reg = new Hashtable<EveComponent, ISelectable>();

	private EveAnnotationLayer annotationLayer;
	private RenderableLayer renderableLayer;
	private EveComponent rootComponent;
	private WorldWindow wwd;
	private WorldWindViewComposite composite;
	private ISelectionService selectionService;
	private Boolean selectionAllowed = true;

	public final static Logger logger = Logger.getLogger(WorldWindProvider.class.toString());

	private static BufferedImage image = PatternFactory.createPattern(PatternFactory.PATTERN_CIRCLE, .8f, Color.red);

	public static LatLon eveComponent2LatLon(EveComponent cmp) {
		return LatLon.fromDegrees(cmp.getLocLatitude(), cmp.getLocLongitude());
	}

	public static Position ec2Pos(EveComponent cmp) {
		return Position.fromDegrees(cmp.getLocLatitude(), cmp.getLocLongitude());
	}

	public WorldWindProvider(WorldWindViewComposite composite, WorldWindow wwd, EveComponent rootComponent, ISelectionService selectionService) {
		this.composite = composite;
		this.wwd = wwd;
		this.selectionService = selectionService;
		this.selectionService.addSelectionListener(this);
		annotationLayer = new EveAnnotationLayer();
		annotationLayer.setPickEnabled(true);
		wwd.addSelectListener(this);
		renderableLayer = new RenderableLayer();

		this.rootComponent = rootComponent;

		EContentAdapter adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				addChange(notification);
			}
		};
		initAllComponents(rootComponent);

		rootComponent.eAdapters().add(adapter);

		wwd.getModel().getLayers().add(renderableLayer);
		wwd.getModel().getLayers().add(annotationLayer);
	}

	public AnnotationLayer getLayer() {
		return annotationLayer;
	}

	protected void addComponent(EveComponent cmp) {
		//System.out.println(cmp.toString());
		EveSimGlobeAnnotation tmp = null;
		if (cmp instanceof EveMonitorNode) {
			tmp = new EveSimMonitorAnnotation((EveMonitorNode) cmp);
		} else {
			tmp = new EveSimGlobeAnnotation(cmp);
		}
		reg.put(cmp, tmp);
		annotationLayer.addAnnotation(tmp);

	}

	protected void addComponent(EveConnection cmp) {
		//System.out.println(cmp.toString());
		EveSimConnectionPolyline tmp = new EveSimConnectionPolyline(cmp);
		reg.put(cmp, tmp);
		renderableLayer.addRenderable(tmp);

	}

	protected void removeComponent(EveConnection cmp) {
		if (reg.containsKey(cmp)) {
			ISelectable selectable = reg.get(cmp);
			reg.remove(cmp);

			if (selectable instanceof EveSimConnectionPolyline)
				renderableLayer.removeRenderable((EveSimConnectionPolyline) selectable);
		}
	}

	protected void removeComponent(EveComponent cmp) {
		if (reg.containsKey(cmp)) {
			ISelectable selectable = reg.get(cmp);
			reg.remove(cmp);

			if (selectable instanceof EveSimGlobeAnnotation)
				annotationLayer.removeAnnotation((EveSimGlobeAnnotation) selectable);
		}
	}

	protected boolean containsComponent(EveComponent cmp) {
		return reg.containsKey(cmp);
	}

	protected void initComponent(EveComponent cmp) {
		if (cmp instanceof EveConnection) {
			addComponent((EveConnection) cmp);
		} else {
			addComponent(cmp);
		}
	}

	protected void initAllComponents(EveComponent cmp) {

		initComponent(cmp);
		for (EveComponent tmp : cmp.getChildren()) {
			initAllComponents(tmp);

		}
	}

	protected void addChange(Notification notification) {
		//logger.info(notification.toString());
		if (notification.getNotifier() instanceof EveComponent) {
			EveComponent cmp = (EveComponent) notification.getNotifier();
			if (notification.getEventType() == Notification.ADD) {
				// An add notification is sent by the parent of the created
				// component
				EveComponent objectToAdd = (EveComponent) notification.getNewValue();
				if (objectToAdd instanceof EveConnection) {
					addComponent((EveConnection) objectToAdd);
				} else {
					addComponent(objectToAdd);
				}
			} else if (notification.getEventType() == Notification.REMOVE) {
				// A remove notification is sent by the parent of the deleted
				// component
				EveComponent objectToRemove = (EveComponent) notification.getOldValue();
				// removeComponent(objectToRemove);

				if (objectToRemove instanceof EveConnection) {
					removeComponent((EveConnection) objectToRemove);
				} else {
					removeComponent(objectToRemove);
				}
			}
		}
	}

	private ISelectable currentSelection = null;

	/**
	 * This method takes care of selections within the World Wind Window
	 * (non-Javadoc)
	 * 
	 * @see gov.nasa.worldwind.event.SelectListener#selected(gov.nasa.worldwind.event.SelectEvent)
	 */
	@Override
	public void selected(SelectEvent e) {
		if (!selectionAllowed)
			return;
		if (e.getEventAction().equals(SelectEvent.LEFT_CLICK)) {
			Object o = e.getTopObject();

			if (e.getTopObject() instanceof ISelectable) {
				selectComponent((ISelectable) e.getTopObject());
			}
		}
	}

	/**
	 * This method propagates selections from the tree viewer to the world wind
	 * window (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (!selectionAllowed)
			return;
		// logger.info(selection.toString());
		if (selection instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection) selection;
			if (ts.getFirstElement() instanceof EveComponent) {
				selectComponent(reg.get((EveComponent) ts.getFirstElement()));
			}
		}
	}

	private void selectComponent(ISelectable newSelection) {
		ISelectable oldSelection = currentSelection;

		// Remove old selection if available
		if (currentSelection != null) {
			currentSelection.setSelected(false);
			currentSelection = null;
		}

		newSelection.setSelected(true);
		notify(newSelection.getComponent());
		currentSelection = newSelection;
	}

	private void notify(EveComponent newSelection) {
		final ISelection sel = new StructuredSelection(newSelection);
		getDisplay().syncExec(new Runnable() {

			public void run() {
				synchronized (selectionAllowed) {
					selectionAllowed = false;
					composite.getSelectionProvider().setSelection(sel);
					selectionAllowed = true;
				}
			}
		});
	}

	private static Display getDisplay() {
		Display display = Display.getCurrent();
		// may be null if outside the UI thread
		if (display == null)
			display = Display.getDefault();
		return display;
	}

	public void dispose() {
		selectionService.removeSelectionListener(this);
	}

}
