package com.saravana.mavenwebapp.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;



public class CustomFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}



	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}



	public void doFilter(ServletRequest req, ServletResponse resp,  
		    FilterChain chain) throws IOException, ServletException {  
		          
		    PrintWriter out=resp.getWriter();  
		     
		    Cookie cookie = new Cookie("LoginCookie","token");
		    out.print("filter is invoked before--->"+cookie);
		    cookie.setMaxAge(-1);

		    HttpServletResponse response = (HttpServletResponse) resp;
		    response.addCookie(cookie);
		    System.out.println("filter is invoked before"+cookie);
		  
		    
		    
		        //  chain.getServletFilters();
		    chain.doFilter(req, resp);//sends request to next resource  
		    cookie.setMaxAge(0);
		          
		    out.print("filter is invoked after");  
		    System.out.println("filter is invoked after");
		    }  
	
}