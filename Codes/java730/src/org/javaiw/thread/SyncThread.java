//Synchronization using synchronized class. Supporting files are: Resource.java, SyncMain.java

package org.javaiw.thread;
//Every object of this class has a thread associated
public class SyncThread implements Runnable {
	
	String place;
	Resource resource; //Every object of this class will also have resource associated. We don't want that. So in main we use keyword synchronized. 
	Thread t1;

	public SyncThread(String place, Resource resource) {
		super();
		this.place = place;
		this.resource = resource;
		t1 = new Thread(this); //Create new thread
		t1.start(); //Start thread
	}


	@Override
	public void run() {
		resource.show(place);
	}

}
