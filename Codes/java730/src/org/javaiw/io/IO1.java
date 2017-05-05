//File class. To check if file exists. if it is directory, can write etc.

package org.javaiw.io;
import java.io.*;

public class IO1 {

	public static void main(String[] args) {
		File file1 = new File("C:/Users/sanket/Documents/10 IO/me.nef");
		System.out.println(file1.exists());
		System.out.println(file1.isDirectory());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getName());
		System.out.println(file1.getParentFile());
		System.out.println(file1.canWrite());
		System.out.println(file1.getTotalSpace());
		System.out.println(file1.getFreeSpace());
		
		/*
		String s[] = file1.list();
		for(String s1:s) {
			System.out.println(s1);
		}*/
		System.out.println(file1.length());
		//file1.delete(); //Important command. Do not run this one. It will delete file and not even found in trash.
		
	}

}
