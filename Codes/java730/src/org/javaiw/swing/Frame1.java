/*

package org.javaiw.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Frame1 extends JFrame {

	private JPanel contentPane;

	//Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame.
	 
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0){
				MyJFrame1 m1 = new MyJFrame1(getFrame());
				m1.setBounds(350, 190, 700, 400);
				m1.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(333, 137, 204, 100);
		contentPane.add(btnNewButton);
	}

	public JFrame getFrame(){
		return this;
	}
}

*/





