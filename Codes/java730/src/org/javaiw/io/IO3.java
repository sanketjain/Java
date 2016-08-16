//working with non textual file. Takes about 2 mins to return output. 
package org.javaiw.io;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3 {

	public static void main(String[] args) {
		//working with non textual files
		try {
			long l1 = System.currentTimeMillis();
			FileInputStream fin = new FileInputStream("C:/Users/sanket/Documents/10 IO/me.nef");//reading jpg file
			FileOutputStream fout = new FileOutputStream("C:/Users/sanket/Documents/10 IO/noBuffer.nef");//new file will be created
			int x;
			while((x=fin.read()) != -1){
				fout.write(x);
			}
			fout.flush();fout.close();
			fin.close();
			long l2 = System.currentTimeMillis();
			System.out.println("Time taken = "+ (l2-l1)/1000.0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
