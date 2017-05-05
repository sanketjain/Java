package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Editserv1f")
public class Editserv1f extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String dur = request.getParameter("duration");
		String fee = request.getParameter("fee");
		out.println("<form method='post' action='EditServ2f'>"
				+ "CourseId<input type='text' name='t1' value='"+cid+"'></br>"
					+ "CourseName<input type='text' name='t2' value='"+cname+"'></br>"
						+ "Duration<input type='text' name='t3' value='"+dur+"'></br>"
							+ "Fee<input type='text' name='t4' value='"+fee+"'></br>"
									+ "<input type='submit' value='Submit'></form>");
	
	}
}

