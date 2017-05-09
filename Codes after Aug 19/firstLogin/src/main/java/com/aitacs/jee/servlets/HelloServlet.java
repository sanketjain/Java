package com.aitacs.jee.servlets;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

@WebServlet(urlPatterns = {"/hellonew"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet(){
		System.out.println("entered the HelloServlet Constructor");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entered the doGet method of HelloServlet");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("Name entered by you is " +name + " and password is " + password);
		
		
		//JDBC code to display all users
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); return; //Add return
		} 
		
		System.out.println("Driver loaded");
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee"); //connecting to database.
			Statement st = con.createStatement(); //createStatement creates a new statement object
			ResultSet rs = st.executeQuery("select * from userinfo"); //The query that we want to execute
			while (rs.next()) {
				String uname = rs.getString("uname");
				String upassword = rs.getString("upassword");
		//		System.out.println(uname + "   " + upassword);
				if(uname.equals(name)){
					System.out.println("User found");
					if(upassword.equals(upassword)){
						System.out.println("Login Successful! Welcome "+ uname);
					}
				}
			}
			rs.close(); //close the result set
			st.close(); //close the statement
			con.close(); //close the connection
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

		PrintWriter pw = response.getWriter();
		pw.append("Served at: ");
		pw.append(request.getContextPath());
		pw.append("\n");
		pw.append("Name : "+name);
		pw.append("\n");
		pw.append("email : "+ password);

		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
