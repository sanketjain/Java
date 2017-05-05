package org.javaiw.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentHW {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sanket", "j2ee");
			PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)"); 
			PreparedStatement ps1 = con.prepareStatement("delete from students where cid = ?"); 
			PreparedStatement ps2 = con.prepareStatement("select * from students"); 
			
			while(true){
				System.out.println("1. New student \n2. Delete student \n3. Show all\n4. Exit\n Your choice");
					int userinput = scan.nextInt();
					switch(userinput){
					
					case 1:{
					System.out.println("Enter student id"); 
					int sid = scan.nextInt();
					System.out.println("Enter student name");
					scan.nextLine(); 
					String sname = scan.nextLine(); 
					System.out.println("Enter course name");
					String coursename = scan.nextLine(); 
					System.out.println("Enter course duration");
					int duration = scan.nextInt();
					ps.setInt(1, sid);
					ps.setString(2, sname);
					ps.setString(3, coursename);
					ps.setInt(4, duration);
					ps.execute();
					System.out.println("New student added :) ");
					ps.close(); 
					}break;
					
					case 2: {
					System.out.println("Enter student id");
					int sid1 = scan.nextInt();
					ps1.setInt(1, sid1);
					ps1.execute();
					System.out.println("Student deleted"); }
					break;
					
					
					case 3: {
						
						System.out.println("Students table contains: ");
						ResultSet rs = ps2.executeQuery("select * from students"); 
						while (rs.next()) {
							int sid = rs.getInt(1); 
							String studentname = rs.getString(2);
							String coursename = rs.getString(3);
							int duration = rs.getInt(4);
							System.out.println(sid + "  " + studentname + "   " + coursename + "   " + duration);
						}
					}break;

					case 4: System.exit(0);
					}		
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


/* 
1.create a table student and insert 10rows into that. Done
2. write a function to retrieve data from table and create a TreeSet and put all these retrieved rows into set.
3. retrieve them back from set and display-----they must be in sorted order
*/