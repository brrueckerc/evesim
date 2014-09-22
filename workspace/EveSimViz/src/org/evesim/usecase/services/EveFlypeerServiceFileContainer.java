package org.evesim.usecase.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;


/**
 * One instance of the SBVR2GrailsResult can encapsulate one file. 
 * The file is stored internally as a byte array and is fully serializable 
 * in order to return one file over-the-air.
 * <br>
 * In the case of the SBVR service this class is used to return a zip
 * file with the generated source code to the service consumer.
 * 
 * @author reder
 *
 */
public class EveFlypeerServiceFileContainer implements Serializable {

	private static final long serialVersionUID = 1441228942064673553L;
	
	private boolean valid = false;
	private byte[] fileContent = null;
	private String fileName;
	
	
	/**
	 * The SBVR2GrailsResultException class is used to encapsulate the 
	 * Exceptions thrown in this tool-class. It should in any case be an 
	 * IOException. 
	 */
	public class EveFlypeerServiceFileContainerException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = -4272553851560910778L;

		public EveFlypeerServiceFileContainerException(String msg) {
			super (msg);
		}

		public EveFlypeerServiceFileContainerException(String msg, Throwable t) {
			super (msg,t);
		}
	}
	
	/**
	 * Transfers the file content into the internal byte array.
	 * @param file File to be encapsulated into this instance
	 */
	public void marshall(File file) {
		fileName = file.getName();
		try {
			fileContent = getBytesFromFile(file);
		} catch (IOException e) {
			new EveFlypeerServiceFileContainerException("Could not marshall file.",e);
		}
		valid = true;
	}
	
	/**
	 * Transfers the file content into the internal byte array. 
	 * This method deletes the encapsulated file after the transfer.
	 * @param file File to be encapsulated into this instance
	 */
	public void marshallAndDelete(File file) {
		marshall(file);
		file.delete();
	}
	
	/**
	 * Stores the file from the byte array to the defined output. 
	 * The original filename is used. 
	 * @param destinationPath The directory where the file should be stored
	 * @return Handler for the created file
	 */
	public File unmarshall(String destinationPath) {
		if (!isvalid() || fileContent == null) {
			throw new EveFlypeerServiceFileContainerException("SBVR2GrailsResult not set.");
		}
		File file = new File(destinationPath+"/"+fileName);
		try {
			FileOutputStream out = new FileOutputStream(file);
	        out.write(fileContent);
	        out.close();
	    } catch (IOException e) {
	    	throw new EveFlypeerServiceFileContainerException("Could not write content to "+file+".",e);
	    }
		return file;
	}
	
	
	/**
	 * Invalidates this instance so that the is not extractable any more.
	 */
	public void invalidate() {
		fileContent = null;
		valid = false;
	}
	
	/**
	 * Returns the validity status of the file instance.
	 * @return true if unmarshalling is possible. False if no file was attached or the invalidate method was invoked.
	 */
	public boolean isvalid() {
		return valid;
	}
	
	/**
	 * @return the size of the bytes in the internal buffer.
	 */
	public int getSize() {
		if (fileContent == null) return 0;
		
		return fileContent.length;
	}
	
	private static byte[] getBytesFromFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);
    
        // Get the size of the file 
        long length = file.length();
    
        // You cannot create an array using a long type.
        // It needs to be an int type.
        // Before converting to an int type, check
        // to ensure that file is not larger than Integer.MAX_VALUE.
        if (length > Integer.MAX_VALUE) {
            throw new IOException("Filesize exceeds INT max: "+length);
        }
    
        // Create the byte array to hold the data
        byte[] bytes = new byte[(int)length];
    
        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
               && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }
    
        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file "+file.getName());
        }
    
        // Close the input stream and return bytes
        is.close();
        return bytes;
    }	

}
