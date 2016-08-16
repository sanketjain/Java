//Supporting file is file1a.html
package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrmServlet
 */
@WebServlet("/FrmServlet1a")
public class FrmServlet1a extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//doPost function accepts the parameters from form and just displays that
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("t1"); //We need form parameter here
		String cname = request.getParameter("t2");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(cname + " has the id " + cid);
		out.flush(); out.close();
	}
}
