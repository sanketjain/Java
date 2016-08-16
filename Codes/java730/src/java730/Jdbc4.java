//This program keeps asking user to input numbers until the user inputs number 4

package java730;

import java.util.Scanner;

public class Jdbc4 {

	public static void main(String[] args) throws Exception {
		Scanner c1 = new Scanner(System.in);
		while(true){
			System.out.println("1. New employee \n2. Delete employee \n3. Show all\n4. Exit\n Your choice");
				// System.out.println("Enter your id, name, course and fee");
				int id = c1.nextInt();
				switch(id){
				case 1: System.out.println("choice 1");break;
				case 2: System.out.println("choice 2");break;
				case 3: System.out.println("choice 3");break;
				case 4: System.exit(0); c1.close(); //Good work. I added c1.close() here so that c1 is closed. Just to avoid warning. 
				} 
		}
		
		
	}
}

