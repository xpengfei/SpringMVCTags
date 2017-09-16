package com.xing.domain;

import java.io.Serializable;
import java.util.List;

/**
 *@author xpengfei
 *@creat  3:07:21 PM   Sep 16, 2017
 */
public class CheckBoxUser implements Serializable{

	private boolean reader;
	private List<String> course;
	
	public CheckBoxUser() {
		super();
	}
	public CheckBoxUser(boolean reader, List<String> course) {
		super();
		this.reader = reader;
		this.course = course;
	}
	public boolean isReader() {
		return reader;
	}
	public void setReader(boolean reader) {
		this.reader = reader;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	
}
