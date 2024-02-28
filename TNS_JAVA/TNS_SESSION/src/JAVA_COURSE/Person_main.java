package java_course;

public class Person_main {
	public static void main(String args[]) {
		Person p =new Person();
		Tax_Calc tc = new Tax_Calc();
		p.setName("krishi");
		p.setEmail("abc@gmail.com");
		p.setLocation("ahmedabad");
		p.setAge(120);
		p.setSal(50000);
		
		System.out.println(p.toString());
		p.checkeligibility();
		tc.calc(p);
	}
}
