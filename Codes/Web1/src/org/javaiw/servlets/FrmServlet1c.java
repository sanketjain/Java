//Supporting file for file1c.html and DataServ3.java
package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrmServlet1c")
public class FrmServlet1c extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	PreparedStatement ps1;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
	
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("insert into courses values(?,?,?,?)");
		} catch (SQLException e){e.printStackTrace();}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("t1"); 
		String cname = request.getParameter("t2");
		String duration = request.getParameter("t3");
		String fee = request.getParameter("t4");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
			
		//put into table
		try{
			ps1.setInt(1, Integer.parseInt(cid));
			ps1.setString(2, cname);
			ps1.setInt(3,  Integer.parseInt(duration));
			ps1.setInt(4, Integer.parseInt(fee));
			ps1.execute();
			out.println("Row Inserted Successfully");
		} catch (Exception e) {
			e.printStackTrace(); 
			out.println("Row could not be inserted"); 
			}
		response.setHeader("Refresh", "4;DataServ3"); //We are returning back to DataServ3
		out.flush(); out.close();
	}
}