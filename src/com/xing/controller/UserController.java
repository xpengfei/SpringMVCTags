package com.xing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xing.domain.User;

/**
 *@author xpengfei
 *@creat  2:12:54 PM   Sep 16, 2017
 */
@Controller
public class UserController {

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerForm(Model model){
		User user=new User("dsads","nan",88,"123456",6666,"���ڵ㿨�Ͽ��������ɸ�������ȥ�Ĵ�������҇�ǧ��� ��ɨ�ֵ��ϵ����ش���ɶ������");
		model.addAttribute("user", user);
		return "register";
	}
}
