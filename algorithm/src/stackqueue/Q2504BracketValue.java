package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Q2504BracketValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		Stack<Integer> numStack = new Stack<>();
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '[') {
				stack.push(ch);
			}else if(ch == ')') {
				if(stack.peek() == '[') {
					result = 0;
					break;
				}else {
					
				}
				
			}else {
				if(stack.peek() == '(') {
					result = 0;
					break;
				}
			}
		}
	}
}
