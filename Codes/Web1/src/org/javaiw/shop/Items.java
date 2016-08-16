package org.javaiw.shop;

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
import javax.servlet.http.HttpSession;

@WebServlet("/Items")
public class Items extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	PreparedStatement ps1;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java2", "j2ee");
			ps1 = con.prepareStatement("select * from products");		
		} catch (SQLException e){e.printStackTrace();}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String cname = session.getAttribute("cname").toString(); //Takes username 
		out.println("Welcome <b>"+cname+"</b><hr><hr><br><br>"); //and prints Welcome username
		try{
			ResultSet rs = ps1.executeQuery(); //Got list of products and create a form. Form displays our list.
			while(rs.next()){
				int pid=rs.getInt(1);
				String pname=rs.getString(2);
				String brand=rs.getString(3);
				int price = rs.getInt(4);
				String picname = rs.getString(5); //fetch fifth column
				
				out.println("<form action='Buy' method='post'>"
						+ "<h3>"+pname+"</h3>(Id:"+pid+")<br><img src='Images/"+picname+"' width='150' height='150'><br>"
							+ "<b>Brand Name: " + brand + "</b><br>Cost:"+price+"<br>"
									+ "<input type='hidden' name='pid' value='"+pid+"'>"
											+ "<input type='hidden' name='pname' value='"+pname+"'>"
												+ "<input type='hidden' name='brand' value='"+brand+"'>"
													+ "<input type='hidden' name='price' value='"+price+"'>"
														+ "<input type='submit' value='BUY'></form><hr>");
			} //When I submit all this, all the hidden data goes to next page
			
			out.println("<br><br><h3><a href='Checkout'>Check out</a></h3>"); //Click checkout takes to other page
			out.flush(); out.close();
		} catch(SQLException e){e.printStackTrace();}
	}
}
