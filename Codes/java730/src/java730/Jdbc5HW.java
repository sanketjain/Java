/*
 * Trial by me. Nowhere taught. Amazing HW. 
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
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc5HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			Scanner scin = new Scanner(System.in);
			
			while(true){
				System.out.println("1. New course \n2. Delete course \n3. Show all\n4. Exit\n Your choice");
					// System.out.println("Enter your id, name, course and fee");
					int cname = scin.nextInt();
					switch(cname){
					
					case 1:{
					PreparedStatement ps = con.prepareStatement("insert into courses values(?,?,?,?)"); 
					Scanner in  = new Scanner(System.in);
					System.out.println("Enter course id"); 
					int id = in.nextInt();
					System.out.println("Enter course name");
					in.nextLine(); 
					String name = in.nextLine(); 
					System.out.println("Enter course duration");
					int duration = in.nextInt(); 
					System.out.println("Enter course fee");
					int feee = in.nextInt();
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, duration);
					ps.setInt(4, feee);
					ps.execute();
					System.out.println("query executed");
					ps.close(); in.close();
					}break;
					
					case 2: {
					Statement stdelete = con.createStatement(); 
					Scanner in2  = new Scanner(System.in);
					System.out.println("Enter course id");
					int id = in2.nextInt();
					String sql = "delete from courses where cid = " + id ;
					stdelete.executeUpdate(sql);
					System.out.println("query executed");
					stdelete.close(); 
					in2.close();
					}break;
					
					
					case 3: {
						Statement st3 = con.createStatement(); 
						ResultSet rs = st3.executeQuery("select * from courses"); 
						while (rs.next()) {
							int cid = rs.getInt("cid"); 
							String coursename = rs.getString(2);
							int duration = rs.getInt(3);
							int feee = rs.getInt(4);
							System.out.println(cid + "  " + coursename + "   " + duration + "   " + feee);
						}
						st3.close();			
					}break;

					case 4: { System.exit(0); scin.close(); }
					}
		
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
