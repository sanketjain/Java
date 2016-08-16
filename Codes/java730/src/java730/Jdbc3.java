//Trial by me. Nowhere taught. Using PreparedStatement this program inserts new courses to table named courses on Oracle sql server. 
package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;


public class Jdbc3 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); return;
		} 
		try {
			
			//insert into courses values(1, 'math', 34532)
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee"); 
			PreparedStatement ps = con.prepareStatement("insert into courses values(?,?,?,?)"); //No need of single and double quote. 
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter course id"); 
			int id = in.nextInt();
			System.out.println("Enter course name");
			in.nextLine(); //We use this type of line if we input string after inputing integer.
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
			in.close(); ps.close(); con.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}

//Whenever we query, the query goes to server. Every database server has a component called sql compiler. sql compiler, 
//this sql compiler compiles our statement but not the value. 
//After compilation query is sent to sql engine. SQL engine runs that sql query on your data server. 
//Java takes advantage: It creates a prepared statement. the query that contains 3 question marks, the 3 questions marks are replaced by 
//dummy values. And that query with dummy values is send to server. It is compiled. After compilation, we have inputed real data, after that
//i tell replace first dummy value with actual value. That compile statement we call it precompile statement, the dummy values are replaced by 
//4 actual values and then ps.execute() and query is executed. 



