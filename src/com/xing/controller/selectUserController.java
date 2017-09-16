package com.xing.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xing.domain.Dept;
import com.xing.domain.selectUser;

/**
 *@author xpengfei
 *@creat  3:49:19 PM   Sep 16, 2017
 */
@Controller
public class selectUserController {
	@RequestMapping(value="/selectForm",method=RequestMethod.GET)
	public String selectFormTest(Model model){
		selectUser sUser=new selectUser();
		sUser.setDeptId(1);
		
		List<Dept>list=new ArrayList<>();
		list.add(new Dept(1,"������Դ��"));
		list.add(new Dept(2,"�з���"));
		list.add(new Dept(3,"���۲�"));
		list.add(new Dept(4,"�г���"));
		
		model.addAttribute("sUser", sUser);
		model.addAttribute("deptList", list);
		return "selectForm";
	}
}
