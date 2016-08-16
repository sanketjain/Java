//Supporting file is DemoServer.java
package org.javaiw.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DemoClient {

	public static void main(String[] args) {
		
		try {
			Socket s1 = new Socket("localhost", 5555);  //host is localhost. I am telling that server I want to connect to localhost on same system 
			//and port number for that is 5555. We got the socket now we should accept the data.
			//So far client sends request to DemoServer.java. At this moment, accept function of DemoServer creates a socket
			
			
			/*Now lets say Sanket is Client, Columbia is Server. Sanket has got the socket. Sanket takes the Input Stream
			 * s1.getInputStream. Now Sanket wants result from Columbia in form of characters. So Sanket converts Input
			 * Stream into Reader using InputStreamReader. InputStream only works byte by byte. InputStreamReader is a wrapper class
			 * it only converts the InputStream into a Reader. We got the Reader now. 
			 * Now I wrap this into a Buffered Reader. 
			 * br is ready to accept inputs which are coming from Columbia.
			 * Sanket is ready to accept inputs from Columbia via object reference br
			 */
			BufferedReader br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			String s = br.readLine(); //Whatever Sanket gets from Columbia, Sanket takes it into string s and displays on screen
			System.out.println(s); //We are done
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}


/*
 * 1. Go to DemoServer.java. right click > Choose run as > Java Application
 * 2. If it runs, then no problem. Otherwise if it gives java_blind exception, restart the laptop
 * 
 * 3. Go to DemoClient.java. Right click > Choose run as > Java Application
 * You will see everything works good.
 * 
 * Now to stop, click close (cross mark) on right hand side of Problems, Declaration, Console tab.
 */



/*
 * If server and client are not on same system then
 * instead of using "localhost", client will write IP address of server
 * use this command: 
 * Socket s1 = new Socket(InetAddress.getbyName("Columbia"), 5555);
 */

//This was only one way application. Server only sends and client only receives in this code. 
