package com.kalki;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Fauzi")

public class Spirit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr=resp.getWriter();
		pr.println("<html><body style ='padding:100px;'>");
		pr.println("<h1 style='color:black;'>HAI DARLINGS</h1>");
		pr.println("<h1 style='color:red;'>KHANSAR KA SALAAR</h1>");
		pr.println("</body></html>");
	
	
	}
	
	
	

}
