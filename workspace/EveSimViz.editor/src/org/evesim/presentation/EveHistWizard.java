/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.presentation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.apache.axis2.deployment.util.TempFileManager;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.evesim.EveComponent;
import org.evesim.EveConnection;
import org.evesim.EveNode;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.provider.EvesimEditPlugin;
import org.evesim.timer.EveHistoryTimer;
import org.evesim.timer.TimerFactory;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class EveHistWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(EvesimEditorPlugin.INSTANCE.getString("_UI_EvesimEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = EvesimEditorPlugin.INSTANCE.getString("_UI_EvesimEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvesimPackage evesimPackage = EvesimPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvesimFactory evesimFactory = evesimPackage.getEvesimFactory();

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected EvesimModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected EvesimModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	protected Button sourceButton;

	public Text timetext;

	public Text intervaltext;
	public Text sourceField;

	public Button calculate;

	private long time = 0;
	private long first_time = 0;
	private long interval = 0;

	public Text totalText;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New EvESim History Simulation");
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : evesimPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						if (eClass.getName().equals("EveSimulation"))
							initialObjectNames.add(eClass.getName());
					}
				}
			}

			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE
					.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)evesimPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = evesimFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();
						EveSimulation root = (EveSimulation) rootObject;
						EveNode node = EvesimFactory.eINSTANCE.createEveNode();
						root.addChild(node);
						EveHistoryAgent hist = SocialNetworkAnalysisFactory.eINSTANCE.createEveHistoryAgent();
						hist.setHistData(sourceField.getText());
						hist.setName("History Root Agent");
						hist.setSimInterval((int)interval);
						EveHistoryTimer tim = TimerFactory.eINSTANCE.createEveHistoryTimer();
						tim.setMaxRepeat(Integer.parseInt(timetext.getText()));
						tim.setSimInterval((int)interval);
						long sleep1 = Long.parseLong(totalText.getText()) * 1000L ;
						long sleep2 = Long.parseLong(timetext.getText());
						long sleep = sleep1 / sleep2;
						tim.setSleep(sleep);
						hist.addChild(tim);
						hist.setIsRoot(true);
						node.addChild(hist);

						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
						resource.save(options);
					}
					catch (Exception exception) {
						//EvesimEditorPlugin.INSTANCE.log(exception);
					}
					finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
				(new Runnable() {
					public void run() {
						((ISetSelectionTarget)activePart).selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
				(new FileEditorInput(modelFile),
						workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), EvesimEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			EvesimEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public class EvesimModelWizardNewFileCreationPage extends
	WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public EvesimModelWizardNewFileCreationPage(String pageId,
				IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(EvesimEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class EvesimModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public EvesimModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(EvesimEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);
			initialObjectField.addModifyListener(calc_listen);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(EvesimEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);
			encodingField.addModifyListener(calc_listen);

			Label sourceString = new Label(composite, SWT.LEFT);
			{
				sourceString.setText("Source File");

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				sourceString.setLayoutData(data);
			}




			sourceField = new Text(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				sourceField.setLayoutData(data);
			}
			sourceField.addModifyListener(validator);
			sourceField.addModifyListener(calc_listen);

			sourceButton = new Button(composite, SWT.ARROW_DOWN);
			{
				sourceButton.setText("Browse");

			}

			Listener listener = new Listener() {

				public void handleEvent(Event event) {
					if(event.widget == sourceButton){
						FileDialog dia = new FileDialog(sourceButton.getShell());
						dia.setFilterExtensions(new String[]{"*.evesim"});
						String str = dia.open();
						if(str != null){
							sourceField.setText(str);
						}
					}

				}
			};
			sourceButton.addListener(SWT.Selection, listener);

			Label totalString = new Label(composite, SWT.LEFT);
			{
				totalString.setText("Total Simulation Time (sek)");

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				totalString.setLayoutData(data);
			}

			totalText = new Text(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				totalText.setLayoutData(data);
			}
			totalText.addModifyListener(validator);
			totalText.addModifyListener(calc_listen);
			Label timeString = new Label(composite, SWT.LEFT);
			{
				timeString.setText("Simulation Cycles (steps)");

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				timeString.setLayoutData(data);
			}

			timetext = new Text(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				timetext.setLayoutData(data);
			}
			timetext.addModifyListener(validator);
			timetext.addModifyListener(calc_listen);
			Label intervalString = new Label(composite, SWT.LEFT);
			{
				intervalString.setText("Simulation Timer Interval (ms)");

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				intervalString.setLayoutData(data);
			}

			intervaltext = new Text(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				intervaltext.setLayoutData(data);
				intervaltext.setEnabled(false);
			}
			intervaltext.addModifyListener(validator);
			intervaltext.addModifyListener(calc_listen);



			calculate = new Button(composite, SWT.ARROW_DOWN);
			{
				calculate.setText("Calculate Timer Interval");
				calculate.setEnabled(false);
			}
			Listener cal_listener = new Listener() {

				public void handleEvent(Event event) {
					if(event.widget == calculate){


						calculateInterval();
//						System.out.println(time);
//						System.out.println(first_time);
						long simulationDuration = time - first_time;
//						System.out.println(simulationDuration);
						interval = (simulationDuration / (Long.decode(timetext.getText())));
//						System.out.println(interval);
						long sleep1 = Long.parseLong(totalText.getText()) * 1000L ;
						long sleep2 = Long.parseLong(timetext.getText());
						long sleep = sleep1 / sleep2;
						intervaltext.setText(String.valueOf(sleep)); 

					}


				}
			};


			calculate.addListener(SWT.Selection, cal_listener);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		protected ModifyListener calc_listen = new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				if(getInitialObjectName() != null && getEncodings().contains(encodingField.getText()) && isInteger(totalText.getText()) && isInteger(timetext.getText()) && !sourceField.getText().equals("")){
					calculate.setEnabled(true);
				}
				else{
					calculate.setEnabled(false);
				}

			}
		};
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText()) && isInteger(timetext.getText()) && isInteger(intervaltext.getText()) && !sourceField.getText().equals("");
		}

		public boolean isInteger( String input )  
		{  
			try  
			{  
				Integer.parseInt( input );  
				return true;  
			}  
			catch( Exception e)  
			{  
				return false;  
			}  
		} 

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return EvesimEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				EvesimEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(EvesimEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	private long calculateInterval(){
		try{
			String filepath;
			EveSimulation sim;
			ArrayList agent_list = new ArrayList();
			this.time = 0;

			if(this.sourceField.getText().startsWith("http")){
				File temp = TempFileManager.createTempFile("agropedia", ".evesim");
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				URL url = new URL(this.sourceField.getText());
				URLConnection urlc = url.openConnection();

				bis = new BufferedInputStream( urlc.getInputStream() );
				bos = new BufferedOutputStream( new FileOutputStream(temp) );

				int i;
				while ((i = bis.read()) != -1)
				{
					bos.write( i );
				}
				bis.close();
				bos.close();

				filepath = temp.getAbsolutePath().substring(2);
				// Initialize the model
				EvesimPackage.eINSTANCE.eClass();
				// Retrieve the default factory singleton

				// Register the XMI resource factory for the .website extension
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("evesim", new XMIResourceFactoryImpl());

				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();

				// Create a resource
				//System.out.println(temp.getAbsolutePath().substring(2));
				Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(filepath));
				resource.load(Collections.EMPTY_MAP);
				sim = (EveSimulation) resource.getContents().get(0);
			}
			else{
				filepath = this.sourceField.getText().substring(2);
				// Initialize the model
				EvesimPackage.eINSTANCE.eClass();
				// Retrieve the default factory singleton

				// Register the XMI resource factory for the .website extension
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("evesim", new XMIResourceFactoryImpl());

				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();

				// Create a resource
				//System.out.println(temp.getAbsolutePath().substring(2));
				Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(filepath));
				resource.load(Collections.EMPTY_MAP);
				sim = (EveSimulation) resource.getContents().get(0);
			}

			Iterator<EveComponent> iter = sim.getChildren().iterator();
			EveComponent type = (EveComponent) iter.next();
			Iterator<EveComponent> rator = type.getChildren().iterator();
			while(rator.hasNext()){
				EveComponent agent = (EveComponent) rator.next();
				if(agent instanceof EveHistoryAgent){
					if(agent.getLocLatitude() != 0.0 && agent.getLocLongitude() != 0.0) {
						agent_list.add((EveHistoryAgent)agent);								
					}
				}
			}
			try{
				for(int j = 0; j < agent_list.size(); j++){
					if(j == 0){
						EveHistoryAgent hist = (EveHistoryAgent) agent_list.get(j);
						this.time = hist.getTimeStamp();
						this.first_time = hist.getTimeStamp();
					}
					else{
						EveHistoryAgent hist = (EveHistoryAgent) agent_list.get(j);
						long time2 = hist.getTimeStamp();
						if(time2 > this.time){
							this.time = time2;
						}
					}


				}
			}catch(NullPointerException ex){
				ex.printStackTrace();
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return this.time;
	}

	/**
	 * The framework calls this to create the contents of the wizard. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new EvesimModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle("EvESim History Simulation");
		newFileCreationPage.setDescription("Create a new history simulation");
		newFileCreationPage.setFileName(EvesimEditorPlugin.INSTANCE.getString("_UI_EvesimEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = EvesimEditorPlugin.INSTANCE.getString("_UI_EvesimEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new EvesimModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle("EvESim History Simulation");
		initialObjectCreationPage.setDescription("Create a new history simulation");
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
