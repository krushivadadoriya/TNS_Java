package java_course;

public class Tax_Calc {
	public  void calc(Person p) {
	double tax = 0;
	int a = p.getSal();
	int b = p.getAge();
	if(b> 50 && a >= 50000 && a<=80000 ) {
		tax = a*0.1;
	}
	else if(b> 18 && a>80000 && a<=100000) {
		tax = a*0.2;
	}
	System.out.println("you need to pay tax of : " + tax);
	}
}
