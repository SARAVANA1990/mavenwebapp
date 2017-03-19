package com.saravana.mavenwebapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
	    ModelAndView mav = new ModelAndView();
	    Map<String, String> message = new HashMap<String, String>();
	    message.put("message", "Hello World");
	    mav.setViewName("helloworld");
	    mav.addObject("message", message);
	    return mav;
	}
	
	
 
}