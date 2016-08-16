//This program fetches data from courses table and displays on server as a table
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

/**
 * Servlet implementation class DataServ
 */
@WebServlet("/DataServ1")
public class DataServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	PreparedStatement ps1;
	
	
	@Override
	public void init() throws ServletException {  //we always need init function if we need to interact with database
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("select * from courses");
		} catch (SQLException e){e.printStackTrace();}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		try{ //Lets retrieve the data
			ResultSet rs = ps1.executeQuery(); //do not write complete ResultSet. Type res and ctrl + space. IntelliSense will show suggestions
			//When we use IntelliSense, the packages are imported automatically. That's a benefit of IntelliSense. 
			out.println("<table border=1 width=80%><tr><th>Course Id</th><th>Course Name</th><th>Duration</th><th>Fee</th></tr>"); //header
			while(rs.next()){
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				int fee = rs.getInt(4);
				out.println("<tr><td>"+cid+"</td><td>"+cname+"</td><td>"+duration+"</td><td>"+fee+"</td></tr>"); //rows in table
			}
			out.println("</table>"); //table close
		}catch(SQLException e){e.printStackTrace();}
		out.flush(); out.close();	
	}
}
