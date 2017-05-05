
package org.javaiw.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
	
	public static void main(String[] args){
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			byte b[] = new byte[100];
			DatagramPacket dp = new DatagramPacket(b, 100);
			ds.receive(dp);
			System.out.println("The data received is \n" + new String(dp.getData()));
		} catch (Exception e) {	e.printStackTrace(); }	
	}
}
