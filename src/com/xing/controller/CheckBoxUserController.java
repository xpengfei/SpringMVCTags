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
		//����Boolean����ֵΪtrue��ҳ���CheckBox��ѡ��ᱻѡ��
		checkBoxUser.setReader(true);
		//Ϊ�������ѡ�е���Ҫѡ�еĸ�ѡ��
		List<String>list=new ArrayList<>();
		
		list.add("java");
		list.add("spring");
		
		checkBoxUser.setCourse(list);
		//model���������checkBoxUser,ֵ��checkBoxUser
		model.addAttribute("checkBoxUser", checkBoxUser);
		return "checkBox";
	}
}
