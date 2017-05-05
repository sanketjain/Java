//Supporting files are DemoClientThread.java and DataServiceThread.java
//Even if one client puts me on hold, we are not worried because we are working with thread. We will put that thread on hold and 
//continue with other threads

package org.javaiw.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket; 
import java.net.Socket;

public class DemoServerThread {
	public static void main(String[] args) {

		try {
			DataServiceThread service = new DataServiceThread(); 
			ServerSocket ss = new ServerSocket(5552); 
			System.out.println("Server Started");
			
			while(true) {
				Socket s1 = ss.accept(); 
				Thread t1 = new Thread(new Runnable(){ //using anonymous class (remember that concept?)

					@Override
					public void run() {
						try {
							BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
							PrintStream ps = new PrintStream(s1.getOutputStream());
							String city  = br.readLine();
							System.out.println("City querried = " + city);
							String w = service.getWeather(city);	
							ps.println("The current weather in "+city+" is " + w);
							ps.flush(); ps.close(); 
						} catch (Exception e) { e.printStackTrace(); } 
					}
				}); 

				t1.start();
			}
			
		} catch (IOException e) { e.printStackTrace(); } 				
	}
}
