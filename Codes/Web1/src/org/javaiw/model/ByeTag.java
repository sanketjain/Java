package org.javaiw.model;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ByeTag extends SimpleTagSupport {
	String name, enddate;
	
	public ByeTag() { //by defining constructor for ByeTag we can set default value of enddate
		enddate = new Date().toString();
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Override doTag function
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut(); //getOut() means get the out object. Whatever we write through this object would be written in our jsp
		out.println("Bye " + name+ " ! and Congrats for ending your course on " + enddate);
		out.flush(); 
	}
}

 