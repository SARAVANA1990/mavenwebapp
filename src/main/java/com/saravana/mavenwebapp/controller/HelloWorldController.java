package com.saravana.mavenwebapp.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 
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
	
	/*@RequestMapping("/hello")
	public ModelAndView hello() {
	ModelAndView model = new ModelAndView("helloworld");
	model.addObject("msg", "hello world");

	return model;
	}
	
	
	
	
	/*@RequestMapping("/hello")
	public String hello(ModelMap model) {
	    
		model.addAttribute("msg", "Hello world buddy");
		
		return "helloworld";
	}
	
	
/*	@RequestMapping(value = "/hello.htm", method = RequestMethod.GET)
	private String Hello(Model model,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws IOException {
	System.out.println("enter in error 7 controller------");

	model.addAttribute("msg", "hello world");

	return "helloworld";
	}*/
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	private String Hello(Model model,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session) throws IOException {
		
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies !=null && cookies.length>0){
		for (Cookie cookie : cookies) {
			System.out.println("request.,,,,"+cookie.getValue());
		}
		}
		User user=new User();
		user.setMyMsg("hello world");
		//model.addAttribute("msg", "hello world");
	     model.addAttribute("user", new User());

	return "helloworld";
	}
	
	
 
}
