package string;

import java.util.Arrays;

public class String_01_StringMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = str3;
		
		System.out.println("== 비교");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
	
		
		System.out.println("equals 비교");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		System.out.println(Arrays.toString(str1.toCharArray()));
		System.out.println((int)'A');
		System.out.println('A'-'B');
	}

}
