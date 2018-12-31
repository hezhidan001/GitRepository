package com.icss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WasteController {
	@RequestMapping("waste/list")
	public ModelAndView list() {
		return new ModelAndView("wastList");
	}
}
