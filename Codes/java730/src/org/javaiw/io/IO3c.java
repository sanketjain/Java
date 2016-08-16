//working with text file using PRINT STREAM 
package org.javaiw.io;

import java.io.*;

public class IO3c {

	public static void main(String[] args) {
		//working with non textual files
		try {
			long l1 = System.currentTimeMillis();
			FileReader fin = new FileReader("C:/Users/sanket/Documents/10 IO/me.nef");
			BufferedReader bin = new BufferedReader(fin); //wrapper class
			FileOutputStream fout = new FileOutputStream("C:/Users/sanket/Documents/10 IO/printStream.nef");
			PrintStream ps = new PrintStream(fout); //using printstream. System.out.println is object of Printstream class.
			String x;
			while((x=bin.readLine()) != null){
				ps.println(x);
			}
			ps.flush();ps.close();
			bin.close();
			long l2 = System.currentTimeMillis();
			System.out.println("Time taken = "+ (l2-l1)/1000.0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
