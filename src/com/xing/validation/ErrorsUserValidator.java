package com.xing.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.xing.domain.ErrorsUser;

/**
 *@author xpengfei
 *@creat  4:11:30 PM   Sep 16, 2017
 */
public class ErrorsUserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return ErrorsUser.class.equals(clazz);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		//验证是否为空
		ValidationUtils.rejectIfEmpty(errors, "username", null,"用户名不能为空");
		ValidationUtils.rejectIfEmpty(errors, "sex", null,"性别不能为空");
		ValidationUtils.rejectIfEmpty(errors, "age", null,"年龄不能为空");
	
	}

}
