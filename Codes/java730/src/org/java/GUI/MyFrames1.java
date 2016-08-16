//Example to create frame and also contains panel
package org.java.GUI;

import java.awt.*;

public class MyFrames1 extends Frame {
	
	Label l1, l2, l3, l4, l5, l6;
	TextField t1, t2, t3, t4, t5;
	Button b1, b2;
	Choice ch1;
	List list1;
	TextArea ta1; 
	
	public MyFrames1(String title) throws HeadlessException {
		super(title);
		l1 = new Label("Name of applicant");
		l2 = new Label("EmailId");
		l3 = new Label("Choose your country");
		l4 = new Label("Choose the cities to visit");
		l5 = new Label("Lines about yourself");
		l6 = new Label("Your hobbies");
		
		Panel p1 = new Panel(); //new panel
		Checkbox c1, c2;
		c1 = new Checkbox("Cricket", true);
		c2 = new Checkbox("Football", false);
		p1.add(c1);
		p1.add(c2);
		
		t1 = new TextField(20); 
		t2 = new TextField(20);
		
		ch1 = new Choice();  
		ch1.add("India");  
		ch1.add("China"); ch1.add("Tibet"); ch1.add("France"); ch1.add("USA"); ch1.add("Switzerland");
		
		list1 = new List(4, true);
		list1.add("New York"); 
		list1.add("Paris"); list1.add("London"); list1.add("Bombay"); list1.add("Montreal"); list1.add("Moscow"); list1.add("Rome");
		ta1 = new TextArea(6, 40); 
		b1 = new Button("Ok");
		b2 = new Button("CLEAR");
		
		setLayout(new FlowLayout());
		
		add(l1); 
		add(t1); 
		add(l2); 
		add(t2); 
		add(l3); 
		add(ch1); 
		add(l4); 
		add(list1); 
		add(l5); 
		add(ta1); 
		
		p1.setBackground(Color.red);
		add(l6); add(p1); 
		add(b1); 
		add(b2); 
	}

	public static void main(String[] args) {
		MyFrames1 m1 = new MyFrames1("Demo Frame");
		m1.setVisible(true);
		m1.setBounds(100, 50, 1100, 650);	
	}
}

