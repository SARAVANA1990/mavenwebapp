package com.saravana.mavenwebapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
	
	/*@RequestMapping("/hello")
	public ModelAndView hello() {
	    ModelAndView mav = new ModelAndView();
	    Map<String, String> message = new HashMap<String, String>();
	    message.put("msg1", "Hello World");
	    mav.setViewName("helloworld");
	    mav.addAllObjects(message);
	    return mav;
	}*/
	
	/*@RequestMapping("hello")
	public ModelAndView hello() {
	ModelAndView model = new ModelAndView("helloworld");
	model.addObject("msg", "hello world");

	return model;
	}*/
	
	
	@RequestMapping("/hello")
	public String hello(ModelMap model) {
	    
		model.addAttribute("msg", "Hello worle buddy");
		
		return "helloworld";
	}
	
 
}