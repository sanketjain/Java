package org.java.GUI;

import java.awt.*;

public class Calc extends Frame {
	
	Button b[]; //array of buttons. 
	//Right click, choose source, constructor from superclass. Choose Frame(String), Finish
	TextField t1;
	
	public Calc(String arg0) throws HeadlessException {
		super(arg0);
		b = new Button[20]; //array of 20 buttons
		int  i;
		for(i=0; i<10; i++){
			b[i] = new Button(""+i);  //Remember this one. 
		}
		t1 = new TextField(); //textbox
		//t1.setEditable(false); //we cannot put anything this one prevents from putting values. 
		t1.setFont(new Font("Arial", Font.BOLD, 24)); //set fonts of input in textbox
		t1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		b[10] = new Button("+");		b[11] = new Button("-");		b[12] = new Button("*");		b[13] = new Button("/");
		b[14] = new Button(".");		b[15] = new Button("=");		b[16] = new Button("M+");		b[17] = new Button("M-");
		b[18] = new Button("MC"); //Memory clear
		b[19] = new Button("MR"); //Memory recall
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4, 5));
		p1.add(b[1]);	p1.add(b[2]);	p1.add(b[3]);	p1.add(b[10]);	p1.add(b[16]);
		p1.add(b[4]);	p1.add(b[5]);	p1.add(b[6]);	p1.add(b[11]);	p1.add(b[17]);
		p1.add(b[7]);	p1.add(b[8]);	p1.add(b[9]);	p1.add(b[12]);	p1.add(b[18]);
		p1.add(b[14]);	p1.add(b[0]);	p1.add(b[15]);	p1.add(b[13]);	p1.add(b[19]);
		
		add(t1, BorderLayout.NORTH); //put textbox 
		add(p1, BorderLayout.CENTER); //put keys in center
	}

	public static void main(String[] args) {
		Calc calc = new Calc("Calculator");
		calc.setBounds(450, 180, 450, 450);
		calc.setVisible(true);
	}
}
