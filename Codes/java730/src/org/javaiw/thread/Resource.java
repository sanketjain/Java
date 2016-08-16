//Synchronization using synchronized class. Supporting files are: SnycThread.java, SyncMain.java
package org.javaiw.thread;

public class Resource {
	
	synchronized public void show(String place){ //Writing synchronized here makes a huge change. 
		System.out.println("Enter " + place);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exit " + place);
	}
}
