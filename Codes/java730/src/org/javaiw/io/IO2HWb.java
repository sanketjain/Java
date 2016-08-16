//This program works only for new values of sid. Old values are already inserted.
/*
 * If you want to see the result, then follow these steps:
 * go to run sql command line
 * type conn
 * type sanket //sanket is username
 * type j2ee //j2ee is password
 * type delete from students where sid=1;
 * type delete from students where sid=3;
 * type delete from students where sid=2;
 */

package org.javaiw.io;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.Scanner;

public class IO2HWb {	
	public static void main(String[] args){
		
		try { Class.forName("oracle.jdbc.OracleDriver"); } 
		catch (ClassNotFoundException e1) { e1.printStackTrace(); return; } 

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sanket", "j2ee");
			
			try {
				FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Table.txt");
				FileWriter fw = new FileWriter("C:/Users/sanket/Documents/10 IO/TableBRcreated3.txt");
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");  

				String line;
				while ( (line = br.readLine()) != null ) {
					String[] ar = line.split(",");
				//	System.out.println(ar[0] +  ar[1] + ar[2] + ar[3]);
					
					String id1= ar[0];
					int id = Integer.parseInt(id1);
				//	System.out.println(ar[0]);
					
					String name = ar[1];
				//	System.out.println(ar[0] +  ar[1]);
					
					String coursename = ar[2];
				//	System.out.println(ar[0] +  ar[1] + ar[2]);
					
					String feee1= ar[3];
					int feee = Integer.parseInt(feee1);
				//	System.out.println(ar[0] +  ar[1] + ar[2] + ar[3]);
					
					
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setString(3, coursename);
					ps.setInt(4, feee);
					ps.execute();
					System.out.println(" row " + id + " inserted");
					} ps.close(); con.close();
				br.close();
				bw.flush();
				bw.close();	
			}catch (IOException e) { e.printStackTrace(); }				
		} catch (SQLException e1) { e1.printStackTrace(); } 
		
	}
}


/*
create a insert query, put 4 question mark and every question mark replace individual
values.
to get individual values, string class has a function called split. 
*/