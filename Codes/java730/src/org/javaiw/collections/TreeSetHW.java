package org.javaiw.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;

public class TreeSetHW {

	public static void main(String[] args) {
		
		TreeSet <Student1> set2 = new TreeSet<Student1>(new MyComparator());
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sanket", "j2ee");
			PreparedStatement ps2 = con.prepareStatement("select * from students"); 					
				//System.out.println("Students table contains: ");
				ResultSet rs = ps2.executeQuery("select * from students"); 
				while (rs.next()) {
					int sid = rs.getInt(1); 
					String studentname = rs.getString(2);
					String coursename = rs.getString(3);
					int duration = rs.getInt(4);
				//	System.out.println(sid + "  " + studentname + "   " + coursename + "   " + duration);
					set2.add(new Student1(sid, studentname, coursename,  duration));
				}
		} catch (SQLException e) { e.printStackTrace(); }
		System.out.println(set2);					
	}
}


/* 
1.create a table student and insert 10rows into that.
2. write a fn. to retreieve data from table and create a TreeSet and put all these retireved rows into set.
3. retreieve them back from set and display-----they must be in sorted order
*/