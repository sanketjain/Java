package org.javaiw.shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.javaiw.shop.model.Product;

@WebServlet("/Buy")
public class Buy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String brand = request.getParameter("brand");
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product p1 = new Product(); //Create object of product class
		p1.setPid(pid);
		p1.setPname(pname);
		p1.setBrand(brand);
		p1.setPrice(price);
		
		HttpSession session  = request.getSession(true); //We got the session object
		ArrayList<Product> list1 = (ArrayList<Product>)session.getAttribute("list"); //Get the list
		list1.add(p1);
		session.setAttribute("list", list1); //Put list back into session
		response.sendRedirect("Items"); //redirects me back to Items, can take a few hundred milliseconds
	} 
}
