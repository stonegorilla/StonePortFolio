package string;

import java.util.Arrays;

public class String_02_StringReverse {
	public static void main(String[] args) {
		
		String text = "더이상파이썬을언급하지않겠습니다";
		// 문자열 뒤집기
		// 1. 자기문자열의 자리를 바꾸기
		char[] arr= text.toCharArray();
		
		int len = text.length();
		for(int i=0; i<len/2; i++) {
			char temp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		// 2. 새로운 빈문자열을 만들어 뒤에서부터 읽기
		
		
		for(int i= text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		// 3. StringBuffer / StringBuilder를 이용하여 reverse 메서드 사용
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.append(text).reverse());
		
	}
}
