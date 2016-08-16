package org.javaiw.model;
//This is called Tag handler class
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
//Right click >  source > override > doTag > Finish
//doTag function defines what our tag will do
//Every tag can have few attributes. 

public class HelloTag extends SimpleTagSupport {
	String name, course="Java"; //Right click > go to Source > Define setters and getters
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Override doTag function
	@Override
	public void doTag() throws JspException, IOException { //What will our tag do is defined here
		JspWriter out = getJspContext().getOut(); //getOut() means get the out object. Whatever we write through this object would be written in our jsp
		out.println("Hello " + name+ " :) Welcome to world of " + course);
		out.flush();
	}
}

