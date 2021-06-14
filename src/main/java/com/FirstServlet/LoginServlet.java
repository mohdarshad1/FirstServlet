package com.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Login Servlet Testing", urlPatterns = { "/LoginServlet" }, initParams = {
		@WebInitParam(name = "user", value = "Pallavi"), @WebInitParam(name = "password", value = "Srivastava") })
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String user=req.getParameter("user");
        String pwd=req.getParameter("pwd");
        String userID=getServletConfig().getInitParameter("user");
        String password=getServletConfig().getInitParameter("password");
        if (userID.equals(user) && password.equals(pwd)) {
            req.setAttribute("user",user);
            req.getRequestDispatcher("LoginSuccess.jsp").forward(req,res);
        }else {
            RequestDispatcher rd=getServletContext().getRequestDispatcher("/login.html");
            PrintWriter out=res.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(req,res);
        }
    }
}
