//Supporting file is DemoClient.java
//This code is for server side


package org.javaiw.net;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket; //import ServerSocket class
import java.net.Socket;
import java.util.Date;

public class DemoServer {

	public static void main(String[] args) {
		
		try {
			//Surround by try/catch for new ServerSocket(5555)
			ServerSocket ss = new ServerSocket(5555); //in bracket we have to give port. We got server socket created
			System.out.println("Server Started");
			
			Socket s1 = ss.accept(); //At this line program waits after we run only DemoServer.java. It waits for input. 
			//ss.accept() blocks our program here. Cannot go further. Now I run DemoClient.java
			
			Date d1 = new Date(); //import java.util.date and not java.sql.date
			
			PrintStream ps = new PrintStream(s1.getOutputStream());
			ps.println("The current date is " + d1);
			ps.flush(); ps.close(); 
			//We are done with server

		} catch (IOException e) { e.printStackTrace(); } 				
	}
}
