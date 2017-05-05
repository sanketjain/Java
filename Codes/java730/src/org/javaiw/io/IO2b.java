//Read a file with and without buffered reader. 
package org.javaiw.io;
import java.io.*;

public class IO2b {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Sample.txt");
			FileWriter fw = new FileWriter("C:/Users/sanket/Documents/10 IO/SamplewriteBufferedIO2b.txt");
			BufferedReader br = new BufferedReader(fr);
			int ch; //Buffered Reader is a wrapper class. It cannot do anything of its own. 
			long l1= System.currentTimeMillis(); //CurrentTimeMillis is number of milliseconds from beginning of Java clock.
			//Java starts from 1 jan 1970 GMT.
			
			while((ch=fr.read())!=-1){ //-1 is returned by read function until the file ends
				System.out.print((char)ch);  //while fetching we fetch ch as integer. But here we convert to character
			} //fr.read() returns the unicode value of character which is int type. so we convert it to char type to print.
							
			long l2= System.currentTimeMillis(); //CurrentTimeMillis is number of milliseconds from beginning of Java clock.
			fr.close();
			fw.flush(); fw.close(); //flush command: reader is fast, writer is usually slow. So in the end reader has finished but writer
			//still has something to write. Flush helps to store that and continue writing even after program has closed.
			System.out.println("Time elapsed is: " + (l2-l1)/1000.0);
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
