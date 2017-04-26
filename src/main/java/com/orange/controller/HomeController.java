package com.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String hallo() {
//		return "hello";
//	}
	
	@RequestMapping("/")
	public ModelAndView hallo() {
		ModelAndView mav = new ModelAndView("hello");
		//mav.setViewName("hello2");
		mav.addObject("name", "Orange");
		return mav;
	}

}
