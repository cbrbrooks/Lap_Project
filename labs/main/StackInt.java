// Your name here (NO NAME, NO CREDIT!): Ruth Brooks

package Main;

public class StackInt{
	// Fields
	private int[] a;			// Array to hold the stack items behind the scenes
	private int top;			// This is the "top" of the stack
	private final int n = 256;	// This is going to be the fixed size of the stack
	
	// Constructor
	public StackInt(){
		// TODO: Initialize the private fields (except the final constant "n")
		
		
	}
	
	// Methods
	public void push(int item){
		// TODO: Add the item to the stack based on how stacks are supposed to work
		
	}
	
	public int pop(){
		// TODO: Remove and return the item at the top of the stack. If stack is empty, return -1
		return -1;		// This can be removed but is here to prevent the Java error while testing!
	}
	
	public int peek(){
		// TODO: Return the item at the top of the stack. If stack is empty, return -1
		return -1; 		// This can be removed but is here to prevent the Java error while testing!
	} 
	
	public boolean isEmpty(){
		// TODO: Return whether the stack is empty (true if empty) or not (false if stack is not empty)
		return false;	// This can be removed but is here to prevent the Java error while testing!
	}
	
	public int size(){
		// TODO: Return how many items are currently in the stack; Return 0 if stack is empty
		return 0;		// This can be removed but is here to prevent the Java error while testing!
	}
	
	public void clear(){
		// TODO: Find a way to clear access to the stack so it appears empty to the user (Consider "Lazy Evaluation" for efficiency)
		
	}
	
	public String toString(){
		// TODO: Return the String with the format of [1,2,3,4] as an example. Have stack items seperated by commas, enclosed inside brackets, and no comma at the end!
		return "NULL";		// This can be removed but is here to prevent the Java error while testing!
	}
}


/*
helper code: 
	
	package Main;

	public class StackInt {

	    private int[] stack;
	    private int top;
	    private final int n;

	    // Constructor
	    public StackInt() {
	        n = 10;
	        stack = new int[n];
	        top = -1;
	    }

	    // Push method
	    public void push(int item) {
	        if (top < n - 1) {
	            stack[++top] = item;
	        }
	    }

	    // toString method
	    public String toString() {
	        if (isEmpty()) {
	            return "[]";
	        }
	        StringBuilder sb = new StringBuilder();
	        sb.append("[");
	        for (int i = 0; i <= top; i++) {
	            sb.append(stack[i]).append(",");
	        }
	        sb.setCharAt(sb.length() - 1, ']');
	        return sb.toString();
	    }

	    // isEmpty method
	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    // size method
	    public int size() {
	        return (top + 1);
	    }

	    // peek method
	    public int peek() {
	        if (isEmpty()) {
	            return -1;
	        }
	        return stack[top];
	    }

	    // pop method
	    public int pop() {
	        if (isEmpty()) {
	            return -1;
	        }
	        return stack[top--];
	    }

	    // clear method
	    public void clear() {
	        top = -1;
	    }
	}
