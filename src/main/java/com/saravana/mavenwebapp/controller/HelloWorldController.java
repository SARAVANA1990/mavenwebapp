package com.saravana.mavenwebapp.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	/*@RequestMapping("/hello")
	public ModelAndView hello() {
	ModelAndView model = new ModelAndView("helloworld");
	model.addObject("msg", "hello world");

	return model;
	}*/
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	private String Hello(Model model,
			HttpServletRequest request, HttpServletResponse response,
			HttpSession session) throws IOException {

	model.addAttribute("msg", "hello world");

	return "helloworld";
	}
	
	
	
	/*@RequestMapping("/hello")
	public String hello(ModelMap model) {
	    
		model.addAttribute("msg", "Hello world buddy");
		
		return "helloworld";
	}
	*/
 
}
class Test{
	private String myMsg;

	public String getMyMsg() {
		return myMsg;
	}

	public void setMyMsg(String myMsg) {
		this.myMsg = myMsg;
	}
	
}