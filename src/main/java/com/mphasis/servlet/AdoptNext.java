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
	      message = "AdopTNexT";
	      version = "101";
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
	      
	      out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Server Name = " + request.getServerName() + "</b></h3>");
	      //out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Local Addr = " + request.getLocalAddr() + "</b></h3>");
		  out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Server Port = " + request.getServerPort() + "</b></h3>");
		  //out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Context Path = " + request.getContextPath() + "</b></h3>");	
		  //out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Request URL = " + request.getRequestURL().toString() + "</b></h3>");	

	      //out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Remote Addr = " + request.getRemoteAddr() + "</b></h3>");
	      //out.println("<h3 style=\"text-align:center\" bgcolor=\"#5F9EA0\"><b>" + "Remote Host = " + request.getRemoteHost() + "</b></h3>");
	      

	      out.println("</body></html>");
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }


	  

}
 
