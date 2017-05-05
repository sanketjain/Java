//Read one and write four, using threads. Supporting files: HWThread.java and Example.java
//Imp: Reads data 1 and write to data1NoBuffer1.txt at Location1,2,3,4
package org.javaiw.thread;
import java.io.*;

public class HWTrial2 implements Runnable {

	Thread t1; //define thread
	String name;
	long l1; 
	long l2;
	
	public HWTrial2(String name) { //This is Constructor
		super();
		this.name = name;
		t1 = new Thread(this);
		
		t1.start();
		
		System.out.println("Thread state inside " + name + " constructor is : "+ t1.getState());

	}

	@Override
	public void run() { //Defining what thread will do whenever it gets a chance. 
		try {
			l1 = System.currentTimeMillis();
			FileReader fr = new FileReader("C:/Users/sanket/Documents/12 Multithreading/data1.txt");
			String myLink = "C:/Users/sanket/Documents/12 Multithreading/Location" + name + "/data1NoBuffer.txt" ;
			
			System.out.println("Active threads count: "+ Thread.activeCount());
//			System.out.println(Thread.getAllStackTraces());
			System.out.println("Thread state inside run override:  " + t1.getState());
			
			FileWriter fw1 = new FileWriter(myLink);
			int ch; 
			while((ch=fr.read())!=-1){ fw1.write(ch); }
			fr.close(); fw1.flush(); fw1.close(); 
			l2 = System.currentTimeMillis();
		} 
		
		catch (IOException e) { e.printStackTrace(); }	
		Example.b = System.currentTimeMillis() + Example.b;
		System.out.println("Time elapsed for "+ name + " is : " + (l2-l1)/1000.0);
		System.out.println("Time elapsed for " + name + " since starting of main is: " + (Example.b - Example.a)/1000.0  );
	} 
}
