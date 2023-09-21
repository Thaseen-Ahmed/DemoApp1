package com.thaseen1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * 
 * ServletConfig And ServletContext 
 * 
 */

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
//		ServletConfig
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.print(str);
		
		
		
//		ServletContext
//		ServletContext ctx = getServletContext();
//		String str1 = ctx.getInitParameter("Phone"); //it is used to give value of the specified attribute
//		out.print(str1);
		
		
		
	}
}

