//This one is not by me. By colleague
//If there are extra enters in text file. For eg: if there is extra enter after line #3, then the program will not run
//It says Number format exception because it thinks the next line is number which is not true. 
//

package org.javaiw.io;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IO2HWfull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollnofinal;
		int marksfinal;
		String rollno, marks, sname, coursename;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sanket", "j2ee");
			PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
			PreparedStatement ps1 = con.prepareStatement("truncate table students");
			FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Table.txt");
			BufferedReader br = new BufferedReader(fr);
			String s1;
			String []s2;
			ps1.execute();
			
				while((s1 = br.readLine()) != null){
					s2=s1.split(",");
					rollno = s2[0].trim();
					rollnofinal = Integer.parseInt(rollno);
					sname = s2[1].trim();
					coursename = s2[2].trim();
					marks = s2[3].trim();
					marksfinal = Integer.parseInt(marks);
//					System.out.println(rollnofinal);
					ps.setInt(1, rollnofinal);
					ps.setString(2, sname);
					ps.setString(3,  coursename);
					ps.setInt(4, marksfinal);
					ps.execute();
					
				} fr.close(); br.close();
				
		} catch (ClassNotFoundException e) { e.printStackTrace(); } 
		catch (SQLException e) { e.printStackTrace(); } 
		catch (IOException e) { e.printStackTrace(); }
		
	}
}

//Results are on Oracle SQL Server
