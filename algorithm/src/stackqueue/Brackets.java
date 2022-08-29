package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		boolean result = true;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			switch(ch) {
			case '(':
			case '{':
			case '[':
				stack.add(ch);
				break;
			case ')':
				if(stack.isEmpty() || stack.peek() != '(') {
					result = false;
					break;
				}else {
					stack.pop();
					break;
				}
			case '}':
				if(stack.isEmpty() || stack.peek() != '{') {
					result = false;
					break;
				}else {
					stack.pop();
					break;
				}
			case ']':
				if(stack.isEmpty() || stack.peek() != '[') {
					result = false;
					break;
				}else {
					stack.pop();
					break;
				}
			default:
				break;
				
			}
		}
		if(!stack.isEmpty()) result = false;
		
		System.out.println(result);

	}

}
