package org.javaiw.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender {

	public static void main(String[] args) {
		
		try {
			DatagramSocket ds = new DatagramSocket(8888);
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter the data to send ");
			String data = in.nextLine();
			DatagramPacket dp = new DatagramPacket(data.getBytes(), data.length(), InetAddress.getLocalHost(), 9999);
			ds.send(dp);	
		} catch (Exception e) {	e.printStackTrace(); }	
	}
}
