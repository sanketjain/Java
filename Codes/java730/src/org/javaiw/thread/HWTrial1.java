//Read one file and write four files
//Imp: Reads data 1 and write to data5NoBuffer1, 2, 3, 4.txt
package org.javaiw.thread;
import java.io.*;
public class HWTrial1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/sanket/Documents/12 Multithreading/data1.txt");
			FileWriter fw1 = new FileWriter("C:/Users/sanket/Documents/12 Multithreading/Location1/data5NoBuffer1.txt");
			FileWriter fw2 = new FileWriter("C:/Users/sanket/Documents/12 Multithreading/Location2/data5NoBuffer2.txt");
			FileWriter fw3 = new FileWriter("C:/Users/sanket/Documents/12 Multithreading/Location3/data5NoBuffer3.txt");
			FileWriter fw4 = new FileWriter("C:/Users/sanket/Documents/12 Multithreading/Location4/data5NoBuffer4.txt");

			int ch; 
			long l1= System.currentTimeMillis(); 
			while((ch=fr.read())!=-1){ 
				fw1.write(ch);
				fw2.write(ch);
				fw3.write(ch);
				fw4.write(ch);
			}
			fr.close();
			fw1.flush(); fw2.flush(); fw3.flush(); fw4.flush();
			fw1.close(); fw2.close(); fw3.close(); fw4.close();
			long l2 = System.currentTimeMillis();
			System.out.println("Time elapsed is: " + (l2-l1)/1000.0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
