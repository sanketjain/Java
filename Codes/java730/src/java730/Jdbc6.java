//Usage of Callable Statement.

package java730;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
				System.out.println("sorry ..... could not include driver class");
				return;
		}
		
		try {
			Scanner in = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			CallableStatement cs=con.prepareCall("call increment_fee(?,?)");
			System.out.println("enter the course id and the increment amount");
			int cid=in.nextInt();
			int amt=in.nextInt();
			cs.setInt(1, cid);
			cs.setInt(2, amt);
			cs.execute();
			
			in.close(); cs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
