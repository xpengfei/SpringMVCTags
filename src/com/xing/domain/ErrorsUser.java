package com.xing.domain;

import java.io.Serializable;

/**
 *@author xpengfei
 *@creat  4:10:06 PM   Sep 16, 2017
 */
public class ErrorsUser implements Serializable{
	private String username;
	private String sex;
	private Integer age;
	public ErrorsUser() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
