//Supporting file is DemoServer1.java and DataService.java
package org.javaiw.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DemoClient1 {

	public static void main(String[] args) {
		
		try {
			Socket s1 = new Socket("localhost", 5554);  
			BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			
			PrintStream ps = new PrintStream(s1.getOutputStream()); //put output stream of Server in ps
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the cityname ");
			String city = in.nextLine(); //We have inputed the city name
			System.out.println("city = " + city); 
			
			ps.println(city); //Send city name to Server
			String w = br.readLine();
			System.out.println("response from server is \n" + w);
			
			
		} catch (UnknownHostException e) {	e.printStackTrace(); 
		} catch (IOException e) {	e.printStackTrace(); }	
	}
}
