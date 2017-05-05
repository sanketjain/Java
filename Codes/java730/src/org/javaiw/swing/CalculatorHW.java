package org.javaiw.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorHW extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorHW frame = new CalculatorHW();
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
	public CalculatorHW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnOnoff = new JButton("ON/OFF");
		panel.add(btnOnoff);
		
		JButton button = new JButton("1");
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		panel.add(button_1);
		
		JButton button_2 = new JButton("3");
		panel.add(button_2);
		
		JButton btnMr = new JButton("M+");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button_10 = new JButton("+");
		panel.add(button_10);
		panel.add(btnMr);
		
		JButton button_3 = new JButton("4");
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		panel.add(button_4);
		
		JButton button_5 = new JButton("6");
		panel.add(button_5);
		
		JButton button_11 = new JButton("-");
		panel.add(button_11);
		
		JButton btnM = new JButton("M-");
		panel.add(btnM);
		
		JButton button_6 = new JButton("7");
		panel.add(button_6);
		
		JButton button_7 = new JButton("8");
		panel.add(button_7);
		
		JButton button_8 = new JButton("9");
		panel.add(button_8);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(button_12);
		
		JButton btnMr_1 = new JButton("MC");
		btnMr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnMr_1);
		
		JButton button_13 = new JButton(".");
		panel.add(button_13);
		
		JButton button_9 = new JButton("0");
		panel.add(button_9);
		
		JButton button_14 = new JButton("=");
		panel.add(button_14);
		
		JButton button_15 = new JButton("/");
		panel.add(button_15);
		
		JButton btnMr_2 = new JButton("MR");
		panel.add(btnMr_2);
	}

}
