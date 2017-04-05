package com.saravana.mavenwebapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
	
	/*@RequestMapping("/hello")
	public ModelAndView helloWorld() {
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("helloworld");
	    mav.addObject("message", "Hello World!");
	    return mav;
	}*/
	
	
	@RequestMapping("/hello")
	public String helloWorld(Model model) {
	    model.addAttribute("name","test;;;;");
	    return "helloworld";
	}
	
	
 
}