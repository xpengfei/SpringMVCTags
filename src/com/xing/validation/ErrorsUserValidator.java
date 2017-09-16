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
		//��֤�Ƿ�Ϊ��
		ValidationUtils.rejectIfEmpty(errors, "username", null,"�û�������Ϊ��");
		ValidationUtils.rejectIfEmpty(errors, "sex", null,"�Ա���Ϊ��");
		ValidationUtils.rejectIfEmpty(errors, "age", null,"���䲻��Ϊ��");
	
	}

}
