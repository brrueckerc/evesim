/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.msg.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.EveSimUtil;
import org.evesim.impl.EveComponentImpl;
import org.evesim.msg.EveDataMessage;
import org.evesim.msg.EveFileMessageSink;
import org.evesim.msg.EveFileMessageSinkType;
import org.evesim.msg.EveMessage;
import org.evesim.msg.MsgPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Eve File Message Sink</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.msg.impl.EveFileMessageSinkImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveFileMessageSinkImpl#getFiletype <em>Filetype</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveFileMessageSinkImpl#isAppend <em>Append</em>}</li>
 *   <li>{@link org.evesim.msg.impl.EveFileMessageSinkImpl#getDelimeterField <em>Delimeter Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EveFileMessageSinkImpl extends EveComponentImpl implements EveFileMessageSink {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiletype() <em>Filetype</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFiletype()
	 * @generated
	 * @ordered
	 */
	protected static final EveFileMessageSinkType FILETYPE_EDEFAULT = EveFileMessageSinkType.TEXT;

	/**
	 * The cached value of the '{@link #getFiletype() <em>Filetype</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFiletype()
	 * @generated
	 * @ordered
	 */
	protected EveFileMessageSinkType filetype = FILETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAppend() <em>Append</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAppend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAppend() <em>Append</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAppend()
	 * @generated
	 * @ordered
	 */
	protected boolean append = APPEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimeterField() <em>Delimeter Field</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDelimeterField()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMETER_FIELD_EDEFAULT = ";";

	/**
	 * The cached value of the '{@link #getDelimeterField() <em>Delimeter Field</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDelimeterField()
	 * @generated
	 * @ordered
	 */
	protected String delimeterField = DELIMETER_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EveFileMessageSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgPackage.Literals.EVE_FILE_MESSAGE_SINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_FILE_MESSAGE_SINK__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EveFileMessageSinkType getFiletype() {
		return filetype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiletype(EveFileMessageSinkType newFiletype) {
		EveFileMessageSinkType oldFiletype = filetype;
		filetype = newFiletype == null ? FILETYPE_EDEFAULT : newFiletype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_FILE_MESSAGE_SINK__FILETYPE, oldFiletype, filetype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppend() {
		return append;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppend(boolean newAppend) {
		boolean oldAppend = append;
		append = newAppend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_FILE_MESSAGE_SINK__APPEND, oldAppend, append));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelimeterField() {
		return delimeterField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimeterField(String newDelimeterField) {
		String oldDelimeterField = delimeterField;
		delimeterField = newDelimeterField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsgPackage.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD, oldDelimeterField, delimeterField));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private Boolean initialized = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private Boolean error = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private PrintWriter writer = null;

	private Set<String> keys = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void submitMessage(EveMessage message) {
		logger.info("Recieved message: " + message);

		// If this is not a data message discard and do nothing.
		if (!(message instanceof EveDataMessage))
			return;

		EveDataMessage dm = (EveDataMessage) message;

		// If there is an error state. discard the message and do nothing.
		if (error)
			return;

		if (!initialized) {
			synchronized (initialized) {
				init();
				keys = dm.getHashtable().keySet();
				createHeaderText();
			}
		}

		processMessageText(dm);

	}

	private void processMessageText(EveDataMessage message) {
		StringBuffer line = new StringBuffer();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			line = line.append(message.getHashtable().get(iter.next()));
			if (iter.hasNext())
				line = line.append(getDelimeterField());
		}
		writeLine(line.toString());
	}

	private void createHeaderText() {
		StringBuffer line = new StringBuffer();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			line = line.append(iter.next());
			if (iter.hasNext())
				line = line.append(getDelimeterField());
		}
		writeLine(line.toString());
	}

	private void writeLine(String line) {
		writer.println(line);

	}

	private void init() {

		if (!initialized) {
			try {
				writer = new PrintWriter(new FileWriter(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "//"
						+ getProjectName() + "//" + getFilename(), false));
				try {
					ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);

				} catch (CoreException e) {
					e.printStackTrace();
				}
				logger.info("Created file: " + getFilename());
			} catch (IOException e) {
				logger.log(Level.SEVERE, "Error occured while opening file to write.", e);
				error = true;
			}
			initialized = true;

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					while (writer != null) {
						writer.flush();
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
						}
					}
				}
			});
			t.start();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILENAME:
				return getFilename();
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILETYPE:
				return getFiletype();
			case MsgPackage.EVE_FILE_MESSAGE_SINK__APPEND:
				return isAppend();
			case MsgPackage.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD:
				return getDelimeterField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILENAME:
				setFilename((String)newValue);
				return;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILETYPE:
				setFiletype((EveFileMessageSinkType)newValue);
				return;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__APPEND:
				setAppend((Boolean)newValue);
				return;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD:
				setDelimeterField((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILETYPE:
				setFiletype(FILETYPE_EDEFAULT);
				return;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__APPEND:
				setAppend(APPEND_EDEFAULT);
				return;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD:
				setDelimeterField(DELIMETER_FIELD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case MsgPackage.EVE_FILE_MESSAGE_SINK__FILETYPE:
				return filetype != FILETYPE_EDEFAULT;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__APPEND:
				return append != APPEND_EDEFAULT;
			case MsgPackage.EVE_FILE_MESSAGE_SINK__DELIMETER_FIELD:
				return DELIMETER_FIELD_EDEFAULT == null ? delimeterField != null : !DELIMETER_FIELD_EDEFAULT.equals(delimeterField);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filename: ");
		result.append(filename);
		result.append(", filetype: ");
		result.append(filetype);
		result.append(", append: ");
		result.append(append);
		result.append(", delimeterField: ");
		result.append(delimeterField);
		result.append(')');
		return result.toString();
	}

	public String getProjectName() {
		return EveSimUtil.getProjectNameFromResource(this);
	}

} // EveFileMessageSinkImpl
