package org.javaiw.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class CalculatorHW2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorHW2 frame = new CalculatorHW2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorHW2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JToggleButton tglbtnOnoff = new JToggleButton("ON/OFF");
		contentPane.add(tglbtnOnoff, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 5, 0, 0));	
		
		JButton btnNewButton_1 = new JButton("1");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("+");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("M+");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("4");
		panel.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("5");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("6");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("-");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("M-");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_12 = new JButton("7");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_10 = new JButton("8");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("9");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("*");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("MR");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton(".");
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("0");
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_17 = new JButton("=");
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("/");
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("MC");
		panel.add(btnNewButton_19);
		
		
	}

}
