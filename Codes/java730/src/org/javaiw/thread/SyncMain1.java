////Synchronization using synchronized class. Supporting files are: SnycThread1.java, Resource1.java

package org.javaiw.thread;

public class SyncMain1 {

	public static void main(String[] args) {
		
		Resource1 resource1 = new Resource1(); //we have one resource object created.
		SyncThread1 th1 = new SyncThread1("Ithaca1", resource1); //Every object has thread associated. 
		SyncThread1 th2 = new SyncThread1("Chicago1", resource1); //Same resource object is used by all three threads
		SyncThread1 th3 = new SyncThread1("Montreal1", resource1);
		
	}

}
