package org.javaiw.collections;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropDemo2 {

	public static void main(String[] args) throws Exception{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/sanket/Documents/15/prop.txt");
		prop.load(fis);
		Enumeration<Object> e = prop.keys();
		while(e.hasMoreElements()){
			String k = e.nextElement().toString();
			System.out.println(k + "    " + prop.getProperty(k));
		}
	}
}
