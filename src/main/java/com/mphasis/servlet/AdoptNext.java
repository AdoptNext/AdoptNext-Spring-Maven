package com.mphasis.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdoptNext extends HttpServlet {
	 
	  private String message;
	  private String version;
	  
	  public void init() throws ServletException
	  {
	      // Do required initialization
	      message = "ADOPT NEXT";
	      version = "104";
	  }

	  public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	  {
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<html><title>AdoptNext</title>");
	      out.println("<body bgcolor=\"#f0f0f0\">");
	      out.println("<br><br><br><br><br><br><br><br><br>");
	      out.println("<h1 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + message + "</b></h1>");
	      out.println("<h1 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + version + "</b></h1>");
	      
	      out.println("</body></html>");
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }

}
 
