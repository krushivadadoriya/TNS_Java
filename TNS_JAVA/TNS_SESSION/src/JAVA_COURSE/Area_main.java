package java_course;

import java.util.Scanner;

public class Area_main {

	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length : ");
		int l  = sc.nextInt();
		System.out.println("enter breadth : ");
		int b = sc.nextInt();
		a.setArea(l, b);
		System.out.println("the area of rectangle : "+ a.getArea());
	}

}
