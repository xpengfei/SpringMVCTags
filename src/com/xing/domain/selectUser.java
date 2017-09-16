package com.xing.domain;

import java.io.Serializable;

/**
 *@author xpengfei
 *@creat  3:47:41 PM   Sep 16, 2017
 */
public class selectUser implements Serializable{
	private Integer deptId;
	public selectUser(){}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	

}
