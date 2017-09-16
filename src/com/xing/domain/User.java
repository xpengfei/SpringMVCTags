package com.xing.domain;

import java.io.Serializable;

/**
 *@author xpengfei
 *@creat  2:11:13 PM   Sep 16, 2017
 */
public class User implements Serializable{
	private String username;
	private String sex;
	private Integer age;
	private String password;
	private Integer id;
	private String message;
	public User(String username, String sex, Integer age,
			String password,Integer id,String message) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.password = password;
		this.id=id;
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
