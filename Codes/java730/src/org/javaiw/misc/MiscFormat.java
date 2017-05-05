package org.javaiw.misc;

import java.util.*;

public class MiscFormat {

	public static void main(String[] args) {
		
		Formatter fmt = new Formatter(); //Formatter class is in util package
		fmt.format("My name is %s and age is %d", "vishal", 38); //replace %s by vishal and %d by 38
		String str = fmt.toString();
		System.out.println(str);
		
		Calendar c = Calendar.getInstance();
		String s = String.format("abcd's Birthday: %1$tm %1$te, %1$te, %1$tY", c); //%1$t. $t stands for date m means months, e means date, Y means year. %1 means exact these values from very first argument
		String s12 = String.format("My name is %s and age is %d", "vishal", 38);
		System.out.println(s);
		System.out.println(s12);
		
		String names = "Zara, Aldo, Denim, Klein";
		String sarray[] = names.split("\\, ");
		
		for(String x:sarray)
			System.out.println("word " + x);
		
		String s1 = "Rohit = 342; Joy = 845; Tisha=523; Rebecca=162";
		StringTokenizer st = new StringTokenizer(s1, "=;");
		while(st.hasMoreTokens()){
			String nm = st.nextToken().trim();
			String hno = st.nextToken().trim();
			System.out.println(nm + "lives in house No." + hno);
		}
				
		String s2 = "BMW, Mercedes, Toyota, RR";
		String ss[] = s2.split("\\, ");
		for(String s3:ss)
			System.out.println(s3 + "  .. ");
				
				
	}
}


