package JAVA_COURSE;

public class Cap_Small {
	public static void main(String args[]) {
		char name[] = {'a','c','K','v','N' };
		
		for(int i = 0;i<name.length;i++) {
		
		if(name[i]>='a' && name[i]<='z') {
			System.out.print(Character.toUpperCase(name[i]) + " ");
		}
		else {
			System.out.print(Character.toLowerCase(name[i]) + " ");
			
			}
		}
	}
}
