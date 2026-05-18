package com.firsthello;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class WebApp extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr=resp.getWriter();
		pr.println("<html><body style ='padding:80px;'>");
		pr.println("<h1 style='color:pink;'>hello world!!!</h1>");
		pr.println("<h1>This is first servelet</h1>");
		pr.println("</body></html>");
	}

}
