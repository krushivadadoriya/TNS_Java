package JAVA_COURSE;

public class swap_num {
	
	public static void swapping(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a is : "+ a);
		System.out.println("the value of b is : " + b);
	}
	public static void main(String[] args) {
		swapping(10,20);

	}

}
