package org.javaiw.model;
//Request scope
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/A1")
public class A1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("student1", new Student(1, "Sanket", 623));
		RequestDispatcher rd = request.getRequestDispatcher("B1");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
