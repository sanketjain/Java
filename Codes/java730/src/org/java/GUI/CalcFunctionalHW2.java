//This file is part of CalcFunctionalHW2.java with full functionality of Calculator
package org.java.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CalcFunctionalHW2 extends Frame implements ActionListener, WindowListener { 
	
	Button b[]; 
	TextField t1;
	Button bmain;
	String sign;
	double val1, val2;
	
	public CalcFunctionalHW2(String title) throws HeadlessException {
		super(title);
		bmain = new Button("ON/OFF"); 
		add(bmain, BorderLayout.WEST); 
		
		t1 = new TextField();
		t1.setEditable(false);
		this.addWindowListener(this); 
		
		t1.setFont(new Font("Arial", Font.BOLD, 24));
		t1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		b = new Button[20]; 
		int  i;
		for(i=0; i<10; i++){
			b[i] = new Button(""+i);  
			b[i].addActionListener(this);
		}
		
		b[10] = new Button("+");		b[11] = new Button("-");		b[12] = new Button("*");		b[13] = new Button("/");
		b[14] = new Button(".");		b[15] = new Button("=");		b[16] = new Button("M+");		b[17] = new Button("M-");
		b[18] = new Button("MC"); 
		b[19] = new Button("MR"); 
		for(i=10;i<20;i++){
			b[i].addActionListener(this);
		} //Now every button has actionlistener
		
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4, 5));
		p1.add(b[1]);	p1.add(b[2]);	p1.add(b[3]);	p1.add(b[10]);	p1.add(b[16]);
		p1.add(b[4]);	p1.add(b[5]);	p1.add(b[6]);	p1.add(b[11]);	p1.add(b[17]);
		p1.add(b[7]);	p1.add(b[8]);	p1.add(b[9]);	p1.add(b[12]);	p1.add(b[18]);
		p1.add(b[14]);	p1.add(b[0]);	p1.add(b[15]);	p1.add(b[13]);	p1.add(b[19]);
		
		t1.setBackground(Color.white);
		add(t1, BorderLayout.NORTH); 
		add(p1, BorderLayout.CENTER); 
	}

	public static void main(String[] args) {
		CalcFunctionalHW2 calc = new CalcFunctionalHW2("Calculator");
		calc.setBounds(450, 180, 450, 450);
		calc.setVisible(true);
	}

//Important is actionPerformed	
	@Override
	public void actionPerformed(ActionEvent e) { 
		String s = e.getActionCommand();
		
		try{
			int x = Integer.parseInt(s);
			String s2 = t1.getText();
			
			if(t1.getText().contains(".")){ t1.setText(s2+s); }
			else { t1.setText(""+Integer.parseInt(s2+s)); }
			
			if(t1.getText().equals("0.0")){ t1.setText(""); }
			return;
		} catch (Exception ee) {}
		
		if(s.equals(".")) {
			if(t1.getText().indexOf('.')==-1) 
				t1.setText(t1.getText()+".");
		}
		
		if(s.equals("+")){
			val1 = Double.parseDouble(t1.getText());
			t1.setText("");
			sign = "+";
		}

		if(s.equals("-")){
			val1 = Double.parseDouble(t1.getText());
			t1.setText("");
			sign = "-";
		}

		if(s.equals("*")){
			val1 = Double.parseDouble(t1.getText());
			t1.setText("");
			sign = "*";
		}
		
		if(s.equals("/")){
			val1 = Double.parseDouble(t1.getText());
			t1.setText("");
			sign = "/";
		}
		
		
		
		if(s.equals("=")){
			val2 = Double.parseDouble(t1.getText());
			double val3=0;
			
			if(sign.equals("+")) { val3=val1+val2; }
			t1.setText(""+val3);
			
			if(sign.equals("-")) { val3 = val1-val2; }
			t1.setText(""+val3);
			
			if(sign.equals("*")) { val3 = val1*val2; }
			t1.setText(""+val3);
			
			if(sign.equals("/")) { val3 = val1/val2; }
			t1.setText(""+val3);
			
		}		
	}

	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
