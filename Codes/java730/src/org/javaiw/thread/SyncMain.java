//Synchronization using synchronized class. Supporting files are: SnycThread.java, Resource.java
package org.javaiw.thread;

public class SyncMain {

	public static void main(String[] args) {
		
		Resource resource = new Resource(); //we have one resource object created.
		SyncThread th1 = new SyncThread("Ithaca", resource); //Every object has thread associated. 
		SyncThread th2 = new SyncThread("Chicago", resource); //Same resource object is used by all three threads
		SyncThread th3 = new SyncThread("Montreal", resource);
		
	}

}
