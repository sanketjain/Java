package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv1model
 */
@WebServlet("/Serv1model")
public class Serv1model extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		getServletContext().setAttribute("author", "Sanket Jain"); 
		//ServletContext object gives all information about the server we are working on
		
		out.println("Welcome to <b> java servlets </b>");
		out.flush(); out.close(); 
		//To check output go to http://localhost:8085/Web1/Serv1model in Chrome
	}
}
//Some information set by this page Serv1model into the context for a different client
//If the client is gone and a servlet for a new client tries to get that information and yes it is able to get
//This is called application scope
//This info is available to all the users as long as this server is working. 
//But if we restart this server once, the information would be gone