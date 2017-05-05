//Using average function
package org.javaiw.generics;

import java.util.ArrayList;

public class TStack1<T> { 
	
	ArrayList<T> stk; 
	
	public TStack1() { 
		stk = new ArrayList<T>(); //Arraylist does not depend on length
	}

	public void push(T x){
		stk.add(stk.size(), x);
	}

	public T pop(){
		T t1 = stk.get(stk.size()-1);
		stk.remove(t1);
		return t1;
	}

	public double avg(TStack1<? extends Number> tstk){ //This avg function will take as argument an object of TStack1.
		//But that object whatever be the datatype, it must be inheriting number class
		double sum=0; int x=0;
		while(tstk.stk.size()> 0){
			String s1 = "" + tstk.pop(); //converting to String type
			sum+=Double.parseDouble(s1); x++; //Convert to Double type
		}
		return sum/x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TStack1<Integer> istk= new TStack1<Integer>(); 
		//inside TStack<> we cannot write int, int is datatype. We can write Integer, Integer is a class
		
		istk.push(1);
		istk.push(2);
		istk.push(3);
		istk.push(4);
		istk.push(5);
		istk.push(6);
//		System.out.println(istk.pop() + " == " + istk.pop() + " == " +istk.pop() + " == " +istk.pop() + " == " +istk.pop() + " == " + istk.pop() );
		System.out.println(istk.avg(istk));
		
		TStack1<String> stk= new TStack1<String>(); 
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		stk.push("E");
		stk.push("F");
		System.out.println(stk.pop() + " == " + stk.pop() + " == " +stk.pop() + " == " +stk.pop() + " == " +stk.pop() + " == " + stk.pop() );
	//	System.out.println(istk.avg(stk));

	}
}
