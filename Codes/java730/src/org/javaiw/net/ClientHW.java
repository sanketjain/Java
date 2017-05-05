package org.javaiw.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientHW {

	public static void main(String[] args) {
		try {
			Socket s1 = new Socket("localhost", 5550);  
			
			System.out.println("What do you want to do? enter 1 to get all details, enter 2 to add new employee: ");
			Scanner in = new Scanner(System.in);
			int option = in.nextInt();
			
			if (option==1) {
				BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream())); //put output stream of Server in input of client here into br
				
				String w = br.readLine(); //Read output of server
				System.out.println("response from server is \n" + w); //Print it as it gets from server

				
			} else if (option == 2) {
				
			} else { System.out.println("Invalid input"); }
			
			in.close();
						
		} catch (UnknownHostException e) {	e.printStackTrace(); 
		} catch (IOException e) {	e.printStackTrace(); }	
	}
}
