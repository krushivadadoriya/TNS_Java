package java_course;

public class Vowels {
	public static void main(String args[] ){
		
	
	String str = " Hello ! krushi here";
	int count = 0;
	for(int i =0;i<str.length();i++) {
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u') {
			count ++;
		}
		else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) =='U') {
			count++;
		}
	}
	System.out.println("total no of vowels are : " + count);
}
}
