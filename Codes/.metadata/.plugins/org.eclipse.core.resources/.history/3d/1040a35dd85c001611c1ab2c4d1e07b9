package org.javaiw.model;
//Page Scope
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/A2")
public class A2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String name="Sanket Jain"; //This name is available only inside this class. If someone comes here, he/she can use it

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("student1", new Student(1, "Sanket", 623));
		RequestDispatcher rd = request.getRequestDispatcher("B2");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
