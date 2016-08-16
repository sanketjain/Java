package org.javaiw.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.javaiw.shop.model.Product;

/**
 * Servlet implementation class Checkout
 */
@WebServlet("/Checkout")
public class Checkout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	
		HttpSession session = request.getSession(true);
		String cname = session.getAttribute("cname").toString(); //Got our session object
		out.println("Welcome <b>"+cname+"</b><hr><hr><br><br>");
		ArrayList<Product> list1 = (ArrayList<Product>)session.getAttribute("list");
		
		int sum=0;
		for(Product p1:list1){
			out.println("Product Id " + p1.getPid()+"---"+p1.getPname()
					+ "="+p1.getPrice()+"<br>");
			sum+=p1.getPrice();
		}
		out.println("<br>total="+sum+"<br><a href='Logout'>LOGOUT</a>");
		out.flush(); out.close();
	}
}
