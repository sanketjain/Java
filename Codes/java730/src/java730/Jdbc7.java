//Example of updatable and scroll sensitive ResultSet statement.
//This code would not work. I have not written complete code. 


package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc7 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JAVA730", "j2ee");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			
			ResultSet rs = stmt.executeQuery("select * from employee order by 1");
			rs.afterLast();
			while(rs.previous()){
				int empno = rs.getInt("empno");
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int sal = rs.getInt("sal");
			}
			

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
