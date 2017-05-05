package org.javaiw.typecasting;

public class TCString01 {

	public static void main(String[] args) {
		int a=2, b=7;
		String str1 = "Concatenation String " + a + b;
		String str2 = "Concatenation Integer " + (a+b);
		String str3 = a + b + " Integer addition and then concatenation";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
