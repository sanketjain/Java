//First way to create multiple threads
package org.javaiw.thread;

public class MyThread implements Runnable {
	//We are creating a multithread class.
//When we implement Runnable interface, we are forced to override method called run. 
//public void run() method is the lifetime of thread. 
//Every thread asks one question on creation, where is my run function ?

	Thread t1; //define thread
	String name; //define a constructor by right click, source, generate constructor using field. unmark t1.
	
	public MyThread(String name) {
		super();
		this.name = name; //2. Now name sanket goes to the this.name and then a thread is started by t1. This thread is for sanket. 
		t1 = new Thread(this);  //inside Thread(), it will ask where is our run function. Here it is "this". Here our run function is in same class. Here we created thread. 
		t1.start(); //Calling start function means our thread goes into the queue. 
		
	}



	@Override
	public void run() { //Defining what thread will do whenever it gets a chance. 
		int i;
		for(i=1; i<=100; i++){
			System.out.println(name + "   " + i);
			
			/*
			try {
				Thread.sleep(500); //500 means it will sleep for half second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		
		}
		
		

	}

}
