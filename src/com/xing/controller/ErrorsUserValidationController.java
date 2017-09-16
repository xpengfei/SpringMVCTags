package com.xing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xing.domain.ErrorsUser;
import com.xing.validation.ErrorsUserValidator;

/**
 *@author xpengfei
 *@creat  4:22:37 PM   Sep 16, 2017
 */
@Controller
public class ErrorsUserValidationController {
	@RequestMapping(value="/registerhhh",method=RequestMethod.GET)
	public String registerError(Model model){
		ErrorsUser errorsUser=new ErrorsUser();
		model.addAttribute("errorsUser", errorsUser);
		return "testErrorValidation";
	}
	
	@InitBinder//使用该注解绑定验证对象
	public void initBinder(DataBinder binder){
		//设置验证的类为ErrorsUserValidator
		binder.setValidator(new ErrorsUserValidator());
	}
	
	@RequestMapping(value="/testErrorValidation",method=RequestMethod.POST)
	public String register(
			@Validated ErrorsUser user,
			Errors errors
			){
		//如果有错,则跳转到注册页面,否则正常提交
		if(errors.hasFieldErrors()){
			return "testErrorValidation";
		}
		return "submit";
	}
}
