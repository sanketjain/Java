//Synchronization using synchronized class. Supporting files are: SnycThread1.java, SyncMain1.java

package org.javaiw.thread;

public class Resource1 {
	
	public void show(String place1){ 
		System.out.println("Enter " + place1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exit " + place1);
	}
}


