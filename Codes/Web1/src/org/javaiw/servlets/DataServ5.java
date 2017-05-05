//Supporting file for file1e.html and FrmServlet1e.java

package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataServ5")
public class DataServ5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	PreparedStatement ps1;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("select * from courses");
		} catch (SQLException e){e.printStackTrace();}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		RequestDispatcher rd = request.getRequestDispatcher("file1e.html"); //If we want to include some page, we need to create request dispatcher like this
		rd.include(request, response);  
		
		try{
			ResultSet rs = ps1.executeQuery();
			out.println("<table border=1 width=80%><tr><th>Course Id</th><th>Course Name</th><th>Duration</th><th>Fee</th><th>DELETE</th><th>EDIT</th></tr>"); //Added edit column
			while(rs.next()){
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				int fee = rs.getInt(4);
				out.println("<tr><td>"+cid+"</td><td>"+cname+"</td><td>"+duration+"</td><td>"+fee+"</td><td><a href='DelServ1d?cid="+cid+"' onclick='return confirm(\"Do you really want to delete this row? \")'>Delete row</a></td><td><a href='EditServ?cid="+cid+"&cname="+cname+"&duration="+duration+"&fee="+fee+"' onclick='return confirm(\"Do you really want to edit this row? \")'>Edit row data</a></td></tr>"); //Important command
			}
			out.println("</table>");
		}catch(SQLException e){e.printStackTrace();}
		out.flush(); out.close();	
	}
}

//To see output go to http://localhost:8085/Web1/DataServ5
//When you go to webpage, left bottom of screen shows where the link of Delete column goes, when you hover over Delete
