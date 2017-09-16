package com.xing.domain;
/**
 *@author xpengfei
 *@creat  3:50:00 PM   Sep 16, 2017
 */
public class Dept {
	private Integer id;
	private String name;
	
	
	public Dept(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
