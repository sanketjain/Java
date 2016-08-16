package org.javaiw.thread;

public class Main {
	
	public static void main(String[] args) {
		MyThread2 mt1 = new MyThread2("sanket"); // 1. Create an object of class mythread and pass the string sanket, call goes to MyThread function of MyThread.java 
		MyThread2 mt2 = new MyThread2("ritwik");
		Thread.currentThread().setName("wangler"); //rename main thread to wangler
		int i;
		for(i=1; i<=100; i++){
			System.out.println(Thread.currentThread().getName() + "   " + i); 
			
			/*
			try {
				Thread.sleep(500); //500 means 0.5 seconds. every round it prints "wangler 1" then after half second "wangler 2". 
				//because main thread wangler is stuck at half second delay so some other thread has to start the job now. 
				//it goes to sanket. sanket comes. says sanket1 and leaves. 
				//check output there is not fixed order except for recurring wangler. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/			
		}

	}
}
