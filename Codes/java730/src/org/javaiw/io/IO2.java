//To read a file :)

package org.javaiw.io;
import java.io.*;

public class IO2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Sanket.java");
			int ch; 
			while((ch=fr.read())!=-1){ //-1 is returned by read function until the file ends
				System.out.print((char)ch);  //while fetch we fetch ch as integer. But here we convert to character
			} //fr.read() returns the unicode value of character which is int type. so we convert it to char type to print.
			
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
