package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.message.EmptyMessageImpl;

@WebServlet(urlPatterns = ("/Servlet_Sample1"))
public class Servlet_Sample1 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req1, HttpServletResponse resp1) throws ServletException, IOException {
		
	 String  Name = req1.getParameter("name");
	 String  password = req1.getParameter("password");
	 
//	 HttpSession session= req1.getSession();
//	 
//	  String str = session.getAttribute("emailaddress").toString();
	 
	Cookie cookies[] = req1.getCookies();
	
	String str=null;
	
	for( Cookie c : cookies ){
		
		if(c.getName().equals("emailaddress")){
			str=c.getValue();
		}
	}
	 
	 resp1.setContentType("text/html");
	 PrintWriter printout = resp1.getWriter();
		
		printout.write("<html><head>");
		printout.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"1.css\">");
		printout.write("<script src=\"1.js\"></script>"); 
		printout.write("</head><body>"+"<div class=\"login-page\">" +  "<div class=\"form\">");
		printout.write("<form class=\"login-form\">");
		printout.write("hello "+ str);
		printout.write("</form>"+"</div>" + "</div>"+"</body></html>");
		
	}
}
