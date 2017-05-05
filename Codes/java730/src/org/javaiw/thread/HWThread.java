//Read one and write four, using threads. Supporting files: HWTrial2.java and Example.java
//Imp: Reads data 1 and write to data1NoBuffer1.txt at Location1,2,3,4

package org.javaiw.thread;
//import java.io.*;
public class HWThread {

	public static void main(String[] args) {
		
		Example.a = System.currentTimeMillis(); 
		Example.b = 0;

		HWTrial2 ht1 = new HWTrial2("1"); 
		HWTrial2 ht2 = new HWTrial2("2");
		HWTrial2 ht3 = new HWTrial2("3");
		HWTrial2 ht4 = new HWTrial2("4");
		
	}
}
