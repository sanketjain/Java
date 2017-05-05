package org.javaiw.shop;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.javaiw.shop.model.Product;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	PreparedStatement ps1;
	
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {e.printStackTrace();}
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java2", "j2ee");
			ps1 = con.prepareStatement("select * from susers where loginid=? and passwd=?"); //Good one		
		} catch (SQLException e){e.printStackTrace();}
	}
	
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("t1");
		String pwd = request.getParameter("p1");
		try{
			ps1.setString(1, id);
			ps1.setString(2, pwd);
			ResultSet rs = ps1.executeQuery();
			if(rs.next()) { //if id and password are correct then redirect to items
				HttpSession session = request.getSession(true);
				session.setAttribute("cname", id);
				ArrayList<Product> list1 = new ArrayList<>(); //At time of login we create empty arraylist of product class object and put into our session
				session.setAttribute("list", list1);
				response.sendRedirect("Items"); //Take me to Items page
				}
			else //if username and password are wrong then
			{
				response.getWriter().append("Invalid username or password"); 
				response.setHeader("Refresh", "4;login.html"); //refresh and take me to login.html
			}
		}catch(SQLException e){e.printStackTrace();}
	}
}
