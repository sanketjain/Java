//Supporting file for file1d.html and FrmServlet1d.java and DataServ4.java

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

@WebServlet("/DelServ1d")
public class DelServ1d extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con;
	PreparedStatement ps1;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("delete from courses where cid=?");
		} catch (SQLException e){e.printStackTrace();}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid")); //Taking parameter into integer type object cid
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); //Create response object named out
		try{
			ps1.setInt(1, cid); //Whatever we received from user, we put that into prepared statement and
			ps1.execute(); //execute it
			out.println("Row deleted successfully");
		} catch (SQLException e){e.printStackTrace();}
		response.setHeader("Refresh", "4;DataServ4");
	}

}
