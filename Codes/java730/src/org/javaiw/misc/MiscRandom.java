//Interesting example
package org.javaiw.misc;

import java.util.*;

public class MiscRandom {
	
	public static void main(String[] args){
		Random r = new Random();
		int x = r.nextInt(100); //Gives any integer between 0 and 100
		System.out.println(x);
		
		boolean x2 = r.nextBoolean();
		System.out.println(x2);
		double d1 = r.nextDouble(); //r.nextDouble returns value between 0 and 1
		System.out.println(d1);
		
		BitSet b1 = new BitSet(20); //I take string of 20 bits (bits means 0s and 1s). It is new so the all bits are set to 0
		b1.set(0,7); //First 8 bits are set to 1s
		b1.set(14); //13th bit is set to 1
		
		BitSet b2 = new BitSet(20);
		b2.set(0,3);
		b2.set(7);
		b2.set(11);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		b1.xor(b2); //returns all where b1 and b2 are not same
		System.out.println(b1);
	}
}
