//Read and write with buffered reader reading string by string.

package org.javaiw.io;
import java.io.*;
public class IO2e {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Sample.txt");
			FileWriter fw = new FileWriter("C:/Users/sanket/Documents/10 IO/SamplewriteBufferStringbyString.txt");
			BufferedReader br = new BufferedReader(fr); //Speeds up process of reading
			BufferedWriter bw = new BufferedWriter(fw); //Speeds up process of writing
//			int ch; 
			long l1= System.currentTimeMillis(); 
			
			/*while((ch=fr.read())!=-1){ 
				bw.write(ch);
			}*/
			
			String s1;
			while((s1=br.readLine()) != null)
				bw.write(s1);
			
			br.close();
			bw.flush(); //flush stops our program for very small time and allows our data to be written.
			bw.close();
			long l2 = System.currentTimeMillis();
			System.out.println("Time elapsed is: " + (l2-l1)/1000.0);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
