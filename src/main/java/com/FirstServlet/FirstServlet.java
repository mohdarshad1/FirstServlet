package com.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet  extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		PrintWriter out=res.getWriter();
		out.println("<html><body>"+"<h1>Hello "+fname+" "+lname+"</h1>"+"</body></html>");
		out.flush();
		out.close();
	}
}
