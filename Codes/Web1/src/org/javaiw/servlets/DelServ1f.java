//Supporting file for file1f.html and FrmServlet1f.java and DataServ6.java

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

@WebServlet("/DelServ1f")
public class DelServ1f extends HttpServlet {
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
		int cid = Integer.parseInt(request.getParameter("cid"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
			ps1.setInt(1, cid);
			ps1.execute();
			out.println("Row deleted succesffully");
		} catch (SQLException e){e.printStackTrace();}
		response.sendRedirect("DataServ6"); //instant redirect :)
		//	response.setHeader("Refresh", "4;DataServ6"); was old	
	}
}
