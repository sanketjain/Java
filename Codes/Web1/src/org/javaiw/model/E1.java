package org.javaiw.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/E1")
public class E1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public E1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//An enumeration is a complete, ordered listing of all the items in a collection. 
		//The term is commonly used in mathematics and computer science to refer to a listing of all of the elements of a set.
		Enumeration<String> e = request.getAttributeNames(); //We iterate over this enumeration getting each
		while(e.hasMoreElements()){ //for each loop does not work with enumeration. It works with every datastructure but not with enumeration
 			String s = e.nextElement();
			try{
				Student s1=(Student)request.getAttribute(s); //getAttribute only knows it has some object. What type of object? it does not know
				//so we typecast getAttribute in student object. 
				out.println(s1);
			} catch(Exception ee){}
		}
		out.flush(); out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
