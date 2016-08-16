package org.javaiw.generics;
//Functionality of stack: Last in First out. Insert from top. Delete always from last position.
public class IStack {

	int st[]; //Take an int array and define a constructor. 
	int tos; //Another integer
	
	public IStack(int len) { //This is constructor
		st = new int[len]; //We got the stack array created
		tos=-1;
	}

	public void push(int x){
		st[++tos] = x; //Inserting new element to stack		
	}

	public int pop(){
		return st[tos--]; //Value of last element in stack is returned
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack stk = new IStack(10); //Create object of IStack of length 10
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		System.out.println(stk.pop() + " == " + stk.pop() + " == " +stk.pop() + " == " +stk.pop() + " == " +stk.pop() + " == " + stk.pop() );
	}
}
