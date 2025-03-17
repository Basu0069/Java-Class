/**
 * WAP
 * 1. find length of given string
 * 2. convert string toUppercase
 * 3. Extract substring from main string
 * 4. access character at specific position
 */



public class _035_string{

	public static void main(String[] args) {
		String str= "Hello world";
		int a = str.length();
		System.out.println("Length: "+ a);
		
		String b = str.toUpperCase();
		System.out.println("String uppercase: "+ b);
		
		String subs= str.substring(4);
		System.out.println("Extracted substring: " + subs);
		
		char c = str.charAt(8);
		System.out.println("Char access: "+ c);
		
		

	}

}