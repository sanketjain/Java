//working with non textual file using buffered input and output
package org.javaiw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3b {

	public static void main(String[] args) {
		//working with non textual files
		try {
			long l1 = System.currentTimeMillis();
			FileInputStream fin = new FileInputStream("C:/Users/sanket/Documents/10 IO/me.nef");//reading jpg file
			BufferedInputStream bin = new BufferedInputStream(fin);
			FileOutputStream fout = new FileOutputStream("C:/Users/sanket/Documents/10 IO/buffered.nef");//new file will be created
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int x;
			while((x=bin.read()) != -1){
				bout.write(x);
			}
			bout.flush();bout.close();
			bin.close();
			long l2 = System.currentTimeMillis();
			System.out.println("Time taken = "+ (l2-l1)/1000.0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
