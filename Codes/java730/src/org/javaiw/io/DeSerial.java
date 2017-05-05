//Deserialization: reteriving object from file.
//We might not use in front-end but serialization takes behind the screen many many times.
//Many a times we require that all details of object are stored for future reference. So that's why we use serialization and deserialization. 
package org.javaiw.io;

import java.io.*;

public class DeSerial {

	public static void main(String[] args) {
		Student s1, s2, s3;
		try {
			FileInputStream fin = new FileInputStream("C:/Users/sanket/Documents/11 Serialization/han.serial"); //open file that we created using Serial.java
			ObjectInputStream in = new ObjectInputStream(fin); //Wrap object fin into objectinputstream so that I can read the objects
			s1 = (Student)in.readObject(); //readObjects and take them into s1, s2, s3.
			s2 = (Student)in.readObject();
			s3 = (Student)in.readObject();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
