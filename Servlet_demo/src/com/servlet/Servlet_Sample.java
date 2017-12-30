package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns = ("/Servlet_Sample"))
public class Servlet_Sample extends HttpServlet{	
	
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String emailaddress=req.getParameter("emailaddress");
		
//		res.setContentType("text/html");
//		PrintWriter printout = res.getWriter();
//		printout.write("<html><head>");
//		printout.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"1.css\">");
//		printout.write("<script src=\"1.js\"></script>"); 
//		printout.write("</head><body>"+"<div class=\"login-page\">" +  "<div class=\"form\">");
//		printout.write("<form class=\"login-form\">");
//		printout.write("hello  "+name);
//		printout.write("<br>password "+password);
//		printout.write("<br>emailaddress  "+emailaddress);
//		printout.write("<br></form>"+"</div>" + "</div>"+"</body></html>");
		
//		RequestDispatcher request = req.getRequestDispatcher("Servlet_Sample1");
//		request.forward(req, res);
//		
//		HttpSession session= req.getSession();
//		session.setAttribute("emailaddress",emailaddress);
//		
		
		Cookie cookies = new Cookie("emailaddress", emailaddress);
		
		res.addCookie(cookies);
		
		res.sendRedirect("Servlet_Sample1");
		
	}
}
