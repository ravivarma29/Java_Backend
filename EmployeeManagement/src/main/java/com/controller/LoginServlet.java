package com.controller;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;

import com.dao.AdminDAO;
import com.model.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Admin admin = new Admin(username ,password);
		AdminDAO adminDAO = new AdminDAO();
		
		boolean isValid = adminDAO.validateAdmin(admin);
		
		if(isValid) {
			HttpSession session= req.getSession();
			String [] split=username.split("@");
			session.setAttribute("username",split[0]);
			resp.sendRedirect("employees");
		}
		else
		{
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
			requestDispatcher.forward(req, resp);	
		}
		
	}
}
