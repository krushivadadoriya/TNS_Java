package java_course;

public class Person {
	private String name;
	private String location;
	private String email;
	private int age;
	private int sal;
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + ", email=" + email + ", age=" + age + ", sal=" + sal
				+ "]";
	}
	public void checkeligibility() {
		if(age >18) {
			System.out.println("eligible for voting...");
		}
		else {
			System.out.println("NA");
		}
	}
}
