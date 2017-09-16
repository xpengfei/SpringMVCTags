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
		list.add(new Dept(1,"人力资源部"));
		list.add(new Dept(2,"研发部"));
		list.add(new Dept(3,"销售部"));
		list.add(new Dept(4,"市场部"));
		
		model.addAttribute("sUser", sUser);
		model.addAttribute("deptList", list);
		return "selectForm";
	}
}
