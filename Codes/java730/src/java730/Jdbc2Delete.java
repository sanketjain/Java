//This program inserts new row using general statement
package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc2Delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); return;
		}
		
		try {			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee"); //Connection created
			Statement st = con.createStatement(); 
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter course id");
			int id = in.nextInt();
			String sql = "delete from courses where cid = " + id ;
			st.executeUpdate(sql);
			System.out.println("query executed");
			in.close(); st.close(); con.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
