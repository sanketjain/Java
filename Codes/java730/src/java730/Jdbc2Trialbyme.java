package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2Trialbyme {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from courses") ;
					
			while(rs.next()){
				int sid = rs.getInt("cid");
				String sname = rs.getString(2);
				String email = rs.getString(3);
				int courseid = rs.getInt(4);
				System.out.println(sid + "  " + sname + "  " + email + "  " + courseid);

			} rs.close(); st.close(); con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
