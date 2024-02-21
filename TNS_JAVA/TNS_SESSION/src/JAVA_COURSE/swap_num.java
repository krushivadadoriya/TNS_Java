package JAVA_COURSE;

public class swap_num {
	
	public static void swapping(int a, int b) {
		a=a+b; // a=30
		b=a-b; // b=30-20 = 10
		a=a-b; // a=30-10=20
		System.out.println("the value of a is : "+ a);
		System.out.println("the value of b is : " + b);
	}
	public static void main(String[] args) {
		swapping(10,20);

	}
}
