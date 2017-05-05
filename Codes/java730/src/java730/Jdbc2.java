//This program inserts new row using general statement
package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); return;
		} //Driver loaded
		try {
			
			//insert into courses values(1, 'math', 34532)
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee"); //Connection created
			Statement st = con.createStatement(); 
			
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter course id");  //Suppose we put 10 at this input. Then press enter. 10 goes into id, but enter remains in buffer.
			int id = in.nextInt();
			
			System.out.println("Enter course name");
			in.nextLine(); //Needed only when we input string after integer, double or float. String after string or int after string does not matter.
			String name = in.nextLine(); //This function ends when it finds a enter. So when it runs, it immediately finds enter. 
			
			System.out.println("Enter course duration");
			int duration = in.nextInt(); 

			System.out.println("Enter course fee");
			int feee = in.nextInt();
			
			String sql = "insert into courses values ("+id+",'"+name+"',"+duration+","+feee+")" ; //Generate sql
			st.executeUpdate(sql); //Execute query
			
			System.out.println("query executed");
			in.close(); st.close(); con.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
