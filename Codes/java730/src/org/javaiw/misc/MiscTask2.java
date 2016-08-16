package org.javaiw.misc;

import java.util.Timer;

public class MiscTask2 {
	
	public static void main(String[] args){
		
		Timer timer = new Timer();
		timer.schedule(new MiscTask1(), 5000, 100); //Task will start at gap of 5 seconds and repeat after every 1 second
	}

}
