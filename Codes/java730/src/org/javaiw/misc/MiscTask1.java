package org.javaiw.misc;

import java.util.*;

public class MiscTask1 extends TimerTask {

	@Override
	public void run() {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.HOUR) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));
	
	}
	

}
