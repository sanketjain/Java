//This is not complete HW. IO2HWb.java is full file. 
package org.javaiw.io;
import java.io.*;
public class IO2HW {
	
	public static void main(String[] args){
		try {
			FileReader fr = new FileReader("C:/Users/sanket/Documents/10 IO/Table.txt");
			FileWriter fw = new FileWriter("C:/Users/sanket/Documents/10 IO/Tablecreated5.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			String line;
			while ( (line = br.readLine()) != null ) {
				String[] ar = line.split(",");
				
				System.out.println(ar[0] + ar[1] + ar[2] + ar[3]);
				bw.write(line);
				bw.newLine();
				
			}
			br.close();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}




/*

WAP to read this txt file line by line 
and split each line by "," 
and write into data table as a record. 

create a insert query, put 4 question mark and every question mark replace individual
values.
to get individual values, string class has a function called split. 

Text file looks like:
1, sanket, java adv, 787
2, joy, java basic, 987
3, zen, j2ee, 345


*/