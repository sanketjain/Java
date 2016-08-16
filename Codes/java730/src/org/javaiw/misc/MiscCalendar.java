//A few uses of java utility package
package org.javaiw.misc;

import java.util.*;

public class MiscCalendar {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1947);
		System.out.println(cal.get(Calendar.MONTH));
		
	}

}
