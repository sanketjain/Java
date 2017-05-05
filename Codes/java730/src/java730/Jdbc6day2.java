//Usage of Callable Statement.

package java730;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;

public class Jdbc6day2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
				System.out.println("sorry ..... could not include driver class");
				return;
		}
		try {
	//		Scanner in = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "albert");
	//		Statement st = con.createStatement();
			DatabaseMetaData dmd = con.getMetaData(); //returns a database metadata object.
			ResultSet rss = dmd.getTables(null, null, null, null); //getTables (null, null, null, null) means all the tables inside database.
			//getTables has 4 filters. (null means all catalogs, schema pattern, table name pattern, table type)
			//This ResultSet contains multiple rows and each row is about one table in my database.
			//Columns in this result - we don't know. So we ask ResultSetMetaData class. 
			
			ResultSetMetaData rd = rss.getMetaData();
			System.out.println("count = "+ rd.getColumnCount()); //rd.getColumnCount() gives # of columns
			int count = rd.getColumnCount();
			int i;
			for(i=1; i<=count; i++){
				String clname = rd.getColumnName(i); //To get name of columns.
				String cltypename = rd.getColumnTypeName(i); //datatype of each column
				System.out.println(clname + "    " + cltypename);
			}
			int x=0;
			while(rss.next()){
				String crs=rss.getString("table_name");
				String ttype=rss.getString("table_type");
				String schema=rss.getString("table_schem"); //Gives which table belongs to which user
				if (ttype.equals("TABLE") && !crs.contains("$")&& !crs.contains("_")){
					System.out.println(schema+ "    " + crs +"     "+ttype); x++;}
			} 
			System.out.println("Total tables = " + x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

