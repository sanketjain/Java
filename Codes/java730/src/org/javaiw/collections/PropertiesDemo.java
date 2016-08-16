package org.javaiw.collections;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
//Properties is the only class in collections which is not generic
import java.util.Properties;
//Key and Values in Properties objects are String
//We can store Properties object into file

public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("A", "France");
		prop.setProperty("B", "USA");
		prop.setProperty("C", "India");
		prop.setProperty("D", "Switzerland");
		prop.setProperty("E", "Norway");
		prop.setProperty("F", "Australia");
		prop.setProperty("G", "New Zealand");
		prop.setProperty("H", "Japan");
		prop.setProperty("I", "Iran");

		Enumeration<Object> e=prop.keys();
		while(e.hasMoreElements()){
			String k = e.nextElement().toString();
			System.out.println(k + "   "  + prop.getProperty(k));
		}
		String addr = prop.getProperty("E");
		
		try {
			FileOutputStream out = new FileOutputStream("C:/Users/sanket/Documents/15/prop.txt");
			prop.store(out, "List of system properties");
			out.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
