package org.javaiw.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_3;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JButton btnSave;
	
	Connection con;
	PreparedStatement ps1, ps2, ps3, ps4;
	String tcourseid, tcoursename, tduration, tfee;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataFrame frame = new DataFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DataFrame() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) { System.out.println("Driver not found"); return; }
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 961, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Course Id", "Course Name", "Duration", "Fee"
			}
		) {
			Class[] columnTypes = new Class[] {
					Integer.class, String.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(184);
		table.getColumnModel().getColumn(1).setPreferredWidth(129);
		table.getColumnModel().getColumn(2).setPreferredWidth(141);
		table.getColumnModel().getColumn(3).setPreferredWidth(136);
		scrollPane.setViewportView(table);
		
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("insert into courses values(?,?,?,?)");
			ps2 = con.prepareStatement("select * from courses");
			ps3 = con.prepareStatement("update course set duration = ?, fee=?, where courseid=?");
			ps4 = con.prepareStatement("delete from courses where cid = ?");
			showdata();
		} catch (SQLException e) {e.printStackTrace();}
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(2, 1));
		
		btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int r = table.getSelectedRow();
				if(r==-1){
					JOptionPane.showMessageDialog(scrollPane, "No row selected");
					return;
				}
				
				int ch = JOptionPane.showConfirmDialog(contentPane, "Are you sure to delete the selected row??");
				if(ch != JOptionPane.YES_OPTION){
					return;
				}
				
				String cid = table.getValueAt(r, 0).toString(); //get value from r row and 0th column
				try{
					ps4.setString(1, cid);
					ps4.execute();
				} catch (SQLException e){e.printStackTrace();}
				showdata();
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_3 = new JButton("EDIT");
		panel.add(btnNewButton_3);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(5, 2));
		
		lblNewLabel = new JLabel("Course Id");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
			
		lblNewLabel_1 = new JLabel("Course Name");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Duration");
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Fee");
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		btnSave = new JButton("SAVE");		
		panel_1.add(btnSave);
			
	}
	
	
	public void showdata(){
		try{
			ResultSet rs = ps2.executeQuery(); //Now we need to put all data into jtable
			DefaultTableModel model = (DefaultTableModel)table.getModel(); //typecasting: tabale.getModel() returns the tablemodel. But we need DefaultTableModel type. So we add (DefaultTableModel) video 27th min
			try{
				while(true){
					model.removeRow(0);
				} 
			}catch (Exception e){}
			while(rs.next()){
				Object o[] = new Object[4];
				o[0] = rs.getInt(1);
				o[1] = rs.getString(2);
				o[2] = rs.getInt(3);
				o[3] = rs.getInt(4);
				model.addRow(o);
			}
			table.setModel(model);
		}catch(Exception e){e.printStackTrace();}	
	}
}
