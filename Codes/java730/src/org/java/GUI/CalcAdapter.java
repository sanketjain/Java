//Using adapters instead of Listener
package org.java.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CalcAdapter extends Frame implements ActionListener { 
	
	Button b[]; 
	TextField t1;
	Button bmain;
	String sign;
	double val1, val2;
	
	Frame getFrame(){
		return this;
	}
	
	public CalcAdapter(String title) throws HeadlessException {
		super(title);
		bmain = new Button("ON/OFF"); 
		add(bmain, BorderLayout.WEST); 
		
		MenuBar mb = new MenuBar(); //Create a new MenuBar
		setMenuBar(mb);
		Menu m1 = new Menu("File");
		MenuItem i1 = new MenuItem("New", new MenuShortcut(KeyEvent.VK_N, false)); //KeyEvent has all things. False is because we don't need shortcut
		MenuItem i2 = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S, false));
		i2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				FileDialog fd = new FileDialog(getFrame(), "Save calculation", FileDialog.SAVE); //Just asks to save, but actually does not save
				fd.setVisible(true);
				String fn = fd.getDirectory() + fd.getFile();
				setTitle(fn);
			}
			
		});
		MenuItem i3 = new MenuItem("Exit");
		m1.add(i1);
		m1.add(i2);
		m1.add(i3); //Everything added to m1 and now lets put m1 in mb
		mb.add(m1);
		
		t1 = new TextField();
		t1.setEditable(false);
		
		t1.addMouseListener(new MouseAdapter(){ //This method adds color to textbox when I hover mouse over textbox. 

			@Override
			public void mouseEntered(MouseEvent arg0) {
				t1.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				t1.setBackground(Color.white);
			}
			
		});
		
		this.addWindowListener(new WindowAdapter(){ //Using windowadapter. Creating Anonymous class see Notes. 
			//In that anonymous class we are inheriting windowadapter. So all 7 functions of windowlistener are inherited.
			//Windowadapter is parent of windowListener. Lets override closing function

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}  
		});
		
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
		CalcAdapter calc = new CalcAdapter("Calculator");
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
	
}
