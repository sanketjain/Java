//This servlet connects to database. This application receives data from form and insert that into a database. 
//2. {Java Resources > src > org.javaiw.servlets > (DataServ2.java + FrmServlet1b.java)} +  {WebContent > file1b.html} //Form and table both are displayed


package org.javaiw.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrmServlet1a
 */
@WebServlet("/FrmServlet1b")
public class FrmServlet1b extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Right click > source > Override/Implement > Choose Generic Servlet > Chooses init > OK
	
	Connection con; //Connection object
	PreparedStatement ps1;
	@Override
	public void init() throws ServletException {
		try{Class.forName("oracle.jdbc.OracleDriver"); } catch (ClassNotFoundException e) {e.printStackTrace();} //Driver loaded		
		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java730", "j2ee");
			ps1 = con.prepareStatement("insert into courses values(?,?,?,?)");
		} catch (SQLException e){e.printStackTrace();}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cid = request.getParameter("t1"); 
		String cname = request.getParameter("t2");
		String duration = request.getParameter("t3"); //Taking 2 more inputs
		String fee = request.getParameter("t4");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
			
		//put into table
		try{
			ps1.setInt(1, Integer.parseInt(cid));
			ps1.setString(2, cname);
			ps1.setInt(3,  Integer.parseInt(duration));
			ps1.setInt(4, Integer.parseInt(fee));
			ps1.execute();
			out.println("Row Inserted Successfully");
		} catch (Exception e) {
			e.printStackTrace(); 
			out.println("Row could not be inserted"); 
			}
		response.setHeader("Refresh", "4;file1b.html"); //After 4 seconds it will refresh page after we submitted form
		out.flush(); out.close();
	}
}

//At first run it will not run and show NullPointer Exception at line 54. We trace back
//At line 51 is ps1.setInt(1, sth); this is correct. Go to place where ps1 is declared, line 33. 
//This is also correct. Go to connection, it is not able to establish connection
//Go to Folders C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//Copy ojbc6.jar
//Go to Eclipse > Project Explorer > Web1 > WebContent > WEB-INF > lib > ojdbc6.jar (paste it here, need to do only once)

