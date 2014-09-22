package org.evesim.usecase.sna;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EveDocument {
	private final static Logger logger = Logger.getLogger(EveDocument.class.getName());
	private String name;
	private String creator;	
	private ArrayList<String> editors;
	private ArrayList<Long> times;
	private ArrayList<Long> trans_times;
	private String sessionID;

	private Long creation_time;
	private String content;
	private boolean deleted;

	public EveDocument(String session, String doc_creator, String doc_name, String doc_content, Long transtime){
		this.editors = new ArrayList<String>();
		this.times = new ArrayList<Long>();
		this.trans_times = new ArrayList<Long>();
		this.creator = doc_creator;
		this.name = doc_name;
		this.content = new String();
		addContent(doc_content, this.creator, transtime);
		this.creation_time = System.currentTimeMillis();
		this.deleted = false;
		this.sessionID = session;
	}

	public void addContent(String new_content,String editor, Long trans_time){
		if(deleted != true){
			this.editors.add(editor);
			this.content += editor +",";
			this.content += new_content + ",";
			this.trans_times.add(trans_time);
			this.content += trans_time + ",";
			this.content += new Date() + ",";
			Long temp_time = System.currentTimeMillis();
			this.content += temp_time;
			this.times.add(temp_time);
			this.content += "\n";
		}
		else{
			logger.log(Level.WARNING, "The document was already deleted and no content can be added");
		}

	}
	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean del_flag, String editor, Long trans_time) {
		if(this.deleted == false && del_flag == true){
			this.deleted = del_flag;
			this.editors.add(editor);
			this.content += editor +",";
			this.content += "DELETED,";
			this.trans_times.add(trans_time);
			this.content += trans_time + ",";
			this.content += new Date() + ",";
			Long temp_time = System.currentTimeMillis();
			this.times.add(temp_time);
			this.content += temp_time;
			this.content += "\n";
		}
		else{
			logger.log(Level.WARNING, "The document was already deleted and can not be undeleted");
		}
	}
	public void printDocument(){
		System.out.println(this.content);
	}
	public String getCreator() {
		return creator;
	}

	public ArrayList<String> getEditors() {
		return editors;
	}

	public Long getCreation_time() {
		return creation_time;
	}

	public String getContent() {
		return content;
	}
	
	public ArrayList<Long> getTimes() {
		return times;
	}
	public ArrayList<Long> getTransTimes() {
		return trans_times;
	}
	public String getName() {
		return name;
	}
	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public static void main(String[] args){
		EveDocument doc = new EveDocument("1234","Christoph", "test_doc","This is the inital content",new Long(123746123));
		doc.addContent("next content", "Andi",new Long(123746123));
		doc.addContent("Third line by Susan", "Susan",new Long(123746123));
		doc.setDeleted(true,"Christoph",new Long(123746123));
		doc.addContent("nach dem löschen", "Stefan",new Long(123746123));
		doc.setDeleted(false,"Christoph",new Long(123746123));
		System.out.println(doc.getContent());
	}

}
