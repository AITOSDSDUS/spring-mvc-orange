package com.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String hallo() {
		return "hello";
	}
	
	@RequestMapping("/model")
	public String helloByModel(Model model)
	{
		model.addAttribute("nazwa", "Orange");
		return "helloModel";
	}
	
	@RequestMapping("/modelAndView")
	public ModelAndView helloByModel()
	{
		ModelAndView mav = new ModelAndView("helloModel");
		mav.addObject("nazwa", "Orange z ModelAndView");
		return mav;
	}

}
