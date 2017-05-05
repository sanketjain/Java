//Working with generic datatype
package org.javaiw.generics;
import java.util.ArrayList;

public class TStack<T> { //When we write something in <> our class becomes generic class. It means objects are flexible to work with any datatype.

	ArrayList<T> stk; //ArrayList is type of data structure. It allows us to collect elements of certain type
	//st = new T[len];  is not allowed. Solution is to use ArrayList<T> stk;
	
	public TStack() { 
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TStack<Integer> istk= new TStack<Integer>(); //inside TStack<> we cannot write int, int is datatype. We can write Integer, Integer is a class
		istk.push(1);
		istk.push(2);
		istk.push(3);
		istk.push(4);
		istk.push(5);
		istk.push(6);
		System.out.println(istk.pop() + " == " + istk.pop() + " == " +istk.pop() + " == " +istk.pop() + " == " +istk.pop() + " == " + istk.pop() );
		
		TStack<String> stk= new TStack<String>(); 
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		stk.push("E");
		stk.push("F");
		System.out.println(stk.pop() + " == " + stk.pop() + " == " +stk.pop() + " == " +stk.pop() + " == " +stk.pop() + " == " + stk.pop() );

	}
}
