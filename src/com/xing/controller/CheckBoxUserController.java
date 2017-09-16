package com.xing.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xing.domain.CheckBoxUser;

/**
 *@author xpengfei
 *@creat  3:09:02 PM   Sep 16, 2017
 */
@Controller
public class CheckBoxUserController {
	@RequestMapping(value="/checkbox",method=RequestMethod.GET)
	public String checkBoxTest(Model model){
		CheckBoxUser checkBoxUser=new CheckBoxUser();
		//设置Boolean变量值为true则页面的CheckBox复选框会被选中
		checkBoxUser.setReader(true);
		//为集合添加选中的想要选中的复选框
		List<String>list=new ArrayList<>();
		
		list.add("java");
		list.add("spring");
		
		checkBoxUser.setCourse(list);
		//model中添加属性checkBoxUser,值是checkBoxUser
		model.addAttribute("checkBoxUser", checkBoxUser);
		return "checkBox";
	}
}
