/*
 * This one only uses Prepared Statement for all tasks Nowhere taught. Amazing HW.  
 * Connects to Oracle SQL
 * can add rows
 * can delete rows
 * can show all rows
 * exits :)
 */

package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc5HWComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			PreparedStatement ps = con.prepareStatement("insert into courses values(?,?,?,?)"); 
			PreparedStatement ps1 = con.prepareStatement("delete from courses where cid = ?"); 
			PreparedStatement ps2 = con.prepareStatement("select * from courses"); 
			
			while(true){
				System.out.println("1. New course \n2. Delete course \n3. Show all\n4. Exit\n Your choice");
					int cname = scan.nextInt();
					switch(cname){
					
					case 1:{
					System.out.println("Enter course id"); 
					int id = scan.nextInt();
					System.out.println("Enter course name");
					scan.nextLine(); 
					String name = scan.nextLine(); 
					System.out.println("Enter course duration");
					int duration = scan.nextInt(); 
					System.out.println("Enter course fee");
					int feee = scan.nextInt();
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, duration);
					ps.setInt(4, feee);
					ps.execute();
					System.out.println("New course added :) ");
					ps.close(); 
					}break;
					
					case 2: {
					System.out.println("Enter course id");
					int id1 = scan.nextInt();
					ps1.setInt(1, id1);
					ps1.execute();
					System.out.println("Course deleted"); }
					break;
					
					
					case 3: {
						
						System.out.println("Courses table contains: ");
						ResultSet rs = ps2.executeQuery("select * from courses"); 
						while (rs.next()) {
							int cid2 = rs.getInt("cid"); 
							String coursename = rs.getString(2);
							int duration = rs.getInt(3);
							int feee = rs.getInt(4);
							System.out.println(cid2 + "  " + coursename + "   " + duration + "   " + feee);
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
