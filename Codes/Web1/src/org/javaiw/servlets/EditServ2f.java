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

/**
 * Servlet implementation class EditServ2f
 */
@WebServlet("/EditServ2f")
public class EditServ2f extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	PreparedStatement ps1;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("update courses set cname=?,duration=?,fee=? where cid=?");
		} catch (SQLException e){e.printStackTrace();}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("t1"));
		String cname = request.getParameter("t2");
		int duration = Integer.parseInt(request.getParameter("t3"));
		int fee = Integer.parseInt(request.getParameter("t4"));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
			ps1.setInt(4, cid);
			ps1.setString(1, cname);
			ps1.setInt(2, duration);
			ps1.setInt(3, fee);
			ps1.execute();
			out.println("Row edited succesffully");
		} catch (SQLException e){e.printStackTrace();}
		response.setHeader("Refresh", "4;DataServ6");
	}
}
