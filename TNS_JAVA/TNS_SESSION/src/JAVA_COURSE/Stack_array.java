package JAVA_COURSE;

import java.util.Scanner;

public class Stack_array {

	int n = 5;
	int stack[] = new int[n];
	int top=-1;
	public void push(int val) {
		if(top>=n-1) {
			System.out.println("stack is full");
		}
		else {
			top++;
			stack[top] = val;
		}
	}
	
	public void pop() {
		if(top<=-1) {
			System.out.println("nothing nothing..");
		}
		else {
			System.out.println("poped element .." + stack[top] );
			top--;
		}
	}
	public void dis() {
		if(top>=0) {
			System.out.println("elements are : ");
			for(int i=top;i>=0;i--) {
				System.out.print(stack[i] + " ");
			}
		}
		else {
			System.out.println("stack is empty..");
		}
	}
	public int peek() {
		if(top==-1) {
			System.out.println("empty...");
			return -1;
		}
		else {
		return stack[top];
		}
	}
	public static void main(String args[]) {
		int ch,val;
		Stack_array sa = new Stack_array();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice : \n 1.push \n 2.pop \n 3.peek \n 4 display \n 5 exit");
		do {
			System.out.println("enter choice...");
	        ch = sc.nextInt();
	
			switch(ch) {
			case 1:
				 val = sc.nextInt();
				sa.push(val);
				break;
				
			case 2:
				sa.pop();
				break;
				
			case 3 :
				System.out.println(sa.peek());
			
			case 4:
				sa.dis();
			}	
			
		}while(ch!=5);
	}

	
}

