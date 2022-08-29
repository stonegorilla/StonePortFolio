package string;

import java.util.Arrays;

public class String_04_PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abcabc";
		String str2 = "abc";
		
		int answer = bruteForceFor(str1.toCharArray(),str2.toCharArray());
		System.out.println(answer);
	}
	
	static int bruteForceFor(char[] p, char[] t) {
		int result = 0;
		for(int i=0; i<p.length-t.length+1; i++) {
			for(int j=0; j<t.length; j++) {
				if(p[i+j] != t[j]) break;
				
				if(j == t.length-1) result++; 
			}
		}
		return result;
	}
}
