package com.icss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icss.entity.Waste_type;
import com.icss.service.Waste_typeSerivce;

@Controller
@RequestMapping("/waste_type")
public class Waste_typeController {
	// 自动注入了业务逻辑层对象
	@Autowired
	Waste_typeSerivce waste_typeSerivce;
	@RequestMapping("/list")
	public ModelAndView list() {
		List<Waste_type> list = waste_typeSerivce.find();
		for (Waste_type waste_type : list) {
			System.out.println(waste_type);
		}
		return new ModelAndView("wasteTypeList", "wasteTypeList", list);
	}

	@RequestMapping("/add")
	public ModelAndView save(Waste_type type) {
		int result = waste_typeSerivce.add(type);
		if (result > 0)
			return new ModelAndView("redirect:list");
		else
			return new ModelAndView("waste_typeAdd");
	}

	@RequestMapping("/del")
	public ModelAndView delete(int id) {
		int result = waste_typeSerivce.delete(id);
		return new ModelAndView("redirect:list");
	}
	//这是编辑功能
	@RequestMapping("edit")
	public ModelAndView edit(int id) {
		Waste_type waste_type = waste_typeSerivce.findById(id);
		return new ModelAndView("wasterEdit");
	}
}
