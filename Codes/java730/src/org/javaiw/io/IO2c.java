//Read and write 
package org.javaiw.io;
import java.io.*;
public class IO2c {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Sample.txt");
			FileWriter fw = new FileWriter("C:/Users/sanket/Documents/10 IO/SamplewriteNoBuffer.txt");
			int ch; 
			long l1= System.currentTimeMillis(); 
			while((ch=fr.read())!=-1){ 
				fw.write(ch);
			}
			fr.close();
			fw.flush(); 
			fw.close();
			long l2 = System.currentTimeMillis();
			System.out.println("Time elapsed is: " + (l2-l1)/1000.0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
