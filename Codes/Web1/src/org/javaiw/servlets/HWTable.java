package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HWTable")
public class HWTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	PreparedStatement ps2;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps2 = con.prepareStatement("select * from courses"); 
		} catch (SQLException e){e.printStackTrace();}		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try{
			ResultSet rs = ps2.executeQuery("select * from courses"); 
			out.println("<table border=1><tr><th>Course Number</th><th>Course Name</th><th>Duration</th><th>Fee</th></tr>");
			while (rs.next()) {
				try{
					int cid = rs.getInt("cid"); 
					String coursename = rs.getString(2);
					int duration = rs.getInt(3);
					int fee = rs.getInt(4);
					out.println("<tr><td>"+cid+"</td><td>"+coursename+"</td><td>"+duration+"</td><td>"+fee+"</td></tr>");
				}catch(Exception e){System.out.println(e);}
			}
			out.println("</table></body></html>");
		} catch(SQLException e){e.printStackTrace();}		
		out.flush(); out.close();
	}
}

 
/*
 * HW
 * using select query and get into the result set
 * init function will connect to database, create a connection, create a prepared statement from table name
 * within doget write code to fetch data from resultset and show that in form of html table
 */
