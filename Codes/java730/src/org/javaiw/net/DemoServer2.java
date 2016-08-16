//Supporting files are DemoClient1.java and DataService.java

package org.javaiw.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket; 
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class DemoServer2 {

	public static void main(String[] args) {
		
		try {
			DataService2 service = new DataService2(); //My server is going to dataservice
			ServerSocket ss = new ServerSocket(5553); 
			System.out.println("Server Started");
			
			while(true) {
				Socket s1 = ss.accept(); //Accept function expects input from client, whenever it connects to client
				BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream())); //Taking input from client
				
				PrintStream ps = new PrintStream(s1.getOutputStream());
				String city  = br.readLine();
				System.out.println("City querried = " + city);
				String w = service.getWeather(city);
				
				ps.println("The current weather in "+city+" is " + w);
				ps.flush(); ps.close(); 

			}
		} catch (IOException e) { e.printStackTrace(); } 				
	}
}
