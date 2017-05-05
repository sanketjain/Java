//Another way of multithreading using extends keyword. 
package org.javaiw.thread;

public class MyThread2 extends Thread{ //using extend here we inherit Thread class. I did not say implementable 
String name; 
	

	public MyThread2(String name) {
		super();
		this.name = name;
		start();		//we don't say t1.start because we use extend
	}

	
	@Override
	public void run() { 
		int i;
		for(i=1; i<=100; i++){
			System.out.println(name + "   " + i);
			/*
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		
		}
	
	}


}
