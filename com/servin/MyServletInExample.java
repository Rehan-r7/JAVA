package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyServletInExample implements Servlet{
	
	ServletConfig config = null; //Inbuilt method 
	
	public void init(ServletConfig config) throws ServletException {
		
		this.config = config;
		System.out.println("sevlet in initialised ");
		
	}
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.print("<html><body>");
		out.print("<b>Servlet by implementing Servlet Interface </b>");
		out.print("</body></html>");
	}

	
	public void destroy() {
	System.out.println("sevlet is desytroyed");
		
	}


	public ServletConfig getServletConfig() {
	
		return config;
	}

	
	public String getServletInfo() {
		
		return "My Servlet 1.0";
	}

	
	

	
	

}
