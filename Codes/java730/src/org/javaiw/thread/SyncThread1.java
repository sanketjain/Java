//Synchronization using synchronized class. Supporting files are: Resource1.java, SyncMain1.java


package org.javaiw.thread;
//Every object of this class has a thread associated
public class SyncThread1 implements Runnable {
	
	String place1;
	Resource1 resource1; //Every object of this class will also have resource associated. We don't want that. So in main we use keyword synchronized. 
	Thread t2;

	public SyncThread1(String place1, Resource1 resource1) {
		super();
		this.place1 = place1;
		this.resource1 = resource1;
		t2 = new Thread(this);
		t2.start();
	}

	@Override
	public void run() {
		synchronized (resource1) { //Only this change from last code makes this one amazing. This is called synchronized block.
			resource1.show(place1);
		}
	}

}
