package java730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcLogin {

	public static void main(String[] args) {
		
		//There is a class called "Class" and a function 'forName("name")'
		//The name we provide inside forName(), that particular class will be loaded into memory
		//This will not work, so we say surround by trycatch.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); return; //Add return
		} 
		//By this line driver is now loaded
		
		//Type conn, press Ctrl+space. Take Connection-java sql (it is a package)
		//How do we get connection? When we load the driver, then a class called driverManager
		//Type Dri, press Ctrl+space. Take DriverManager - java.sql
		//Driver Manager: The basic service for managing a set of JDBC drivers
		//Type get, press Ctrl+space. Take getConnection(Sting url, String user, String password)
		//Attempts to establish a connection to the given database URL. The DriverManager attempts to select an appropriate driver from the set of registered JDBC drivers. 
		//url is connection string(complicated see eg), username is: java730, password is j2ee
		//url is: jdbc:oracle:thin:@localhost(where is oracle? it is on same system, so localhost):1521(oracle has 2 service numbers, we are using 1521)
		//xe: name of database. Oracle 10g supports only one database named xe
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee"); //connecting to database.
			//Write sql statement and send it to oracle
			Statement st = con.createStatement(); //createStatement creates a new statement object
			//Now following are commands to run select query:
			ResultSet rs = st.executeQuery("select * from userinfo"); //The query that we want to execute
			//When we run a select query, we get all rows as result set.
			//Execute Query returns a result set. Result set is set of rows and columns which are fetched as a result of set query
			//We got result set, we just need to iterate over this result set. 
			while (rs.next()) {
				//rs.next brings cursor down one step. It returns true or false depending on whether it was able to pull down or not.
				//in last row, trying rs.next is not able to pull down and returns false. So while loop continues till last row. 
				//When done with last row, the loop will break
				//I am on row one. (first student). I need to fetch data from different columns. First column is student id
				String uname = rs.getString("uname");
				String upassword = rs.getString("upassword");
				System.out.println(uname + "   " + upassword);
			}
			rs.close(); //close the result set
			st.close(); //close the statement
			con.close(); //close the connection
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//Click Run :)

