//Supporting file is ClientHW.java

package org.javaiw.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket; 
import java.net.Socket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServerHW {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(5550); 
			System.out.println("Server Started");
			
			Socket s1 = ss.accept(); 
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			int i = Integer.parseInt(br.readLine());
			
					
			if (i==1){
				//Write code to read all details of employee table and return it
				try { Class.forName("oracle.jdbc.OracleDriver"); } 
				catch (ClassNotFoundException e) { e.printStackTrace(); }
				
				try {
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sanket", "j2ee");
					PreparedStatement ps = con.prepareStatement("select * from employees"); 
					
					System.out.println("Employee table contains: ");
					ResultSet rs = ps.executeQuery("select * from employees"); 
					while (rs.next()) {
						int eid = rs.getInt("eid"); 
						String ename = rs.getString(2);
						String work = rs.getString(3);
						int salary = rs.getInt(4);
						System.out.println(eid + "  " + ename + "   " + work + "   " + salary);
					}
				} catch (SQLException e) { e.printStackTrace(); }
		
				
				/*For example old code to simply print date was:
				 * Date d1 = new Date();
				 * PrintStream ps = new PrintStream(s1.getOutputStream());
				 * ps.println("The current date is " + d1);
				 * ps.flush(); ps.close(); 
				 */	
			} else {
				//Write code to add values to employees table
			}
			
		} catch (IOException e) { e.printStackTrace(); } 				
	}
}
