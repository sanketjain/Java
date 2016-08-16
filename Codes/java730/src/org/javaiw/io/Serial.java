//Serialization: A process of writing an object into a file is called serialization.

package org.javaiw.io;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) {
		Student s1 = new Student(1, "sanket", 843); //Create 3 objects
		Student s2 = new Student(2, "jaguan", 432);
		Student s3 = new Student(3, "rashid", 654);
		try {
			FileOutputStream fout = new FileOutputStream("C:/Users/sanket/Documents/11 Serialization/han.serial"); 
			ObjectOutputStream out = new ObjectOutputStream(fout); //Wrap fout in objectoutputstream
			out.writeObject(s1); //Write 3 objects in this file. 
			out.writeObject(s2);
			out.writeObject(s3);
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//Check file names han.serial. Its size is ~150KB which means file is created. 