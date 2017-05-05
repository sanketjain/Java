package org.javaiw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1") //We got this because we are working with javaee7. In old java 6 this annotation was not there
//Rather in java6 we had to register this servlet in xml file. 
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//We unchecked doPost while creating this servlet because we just need to get things here. 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Defining methodology. 
		//doGet function takes the request and the response. Where does this get the request and response from ?
		//localhost:8081/Web1/Serv1 (my apache server named 8081 on my machine named localhost, on that server an application named Web1 is running and within that we have servlet with the name Serv1
		//whatever request client sends, comes to request object of doGet, "HttpServletRequest request"
		//we have response object given to us by server which is currently empty. That's why we take writer(getWriter()) for that and write into response(out.println) whatever we want
		response.setContentType("text/html"); //setContentType. text/html means response type is html. Other eg: jpg, mp4, pdf, json, xml
		PrintWriter out = response.getWriter(); //We use PrintWriter to write string by string and not char by char
		//We got an object to write into response. What we want to write ? it is following:
		out.println("Welcome to <b> java servlets </b>");
		out.flush(); out.close(); 
	}
}

//To check output in Chrome go to http://localhost:8085/Web1/Serv1 
