package com.saravana.mavenwebapp.config;



import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebApplnitializer extends
AbstractAnnotationConfigDispatcherServletInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
		 AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
	        appContext.register(ApplicationContextConfig.class);
	 
	        // Dispatcher Servlet
	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher",
	                new DispatcherServlet(appContext));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	         
	        dispatcher.setInitParameter("contextClass", appContext.getClass().getName());
	 
	        servletContext.addListener(new ContextLoaderListener(appContext));
	        getServletFilters();
	        
	        servletContext.addFilter("name", CustomFilter.class)
            .addMappingForUrlPatterns(null, false, "/*");
	       // servletContext.addFilter(getServletName(), "");
	        
	       /* EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.ERROR);

	        FilterRegistration.Dynamic monitoringFilter = servletContext.addFilter("monitoringFilter", (Class<? extends Filter>) MonitoringFilter.class);
	   
	        
	        monitoringFilter.addMappingForUrlPatterns(dispatcherTypes, false, "/");*/
	        
	       
	        
	}
	
	 @Override
 	protected Filter[] getServletFilters() {
 		System.out.println("inside filter");
 		return new Filter[]{new CustomFilter()};
 	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}