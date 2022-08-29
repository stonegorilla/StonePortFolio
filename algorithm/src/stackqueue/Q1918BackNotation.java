package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Q1918BackNotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case '+':
			case '-':
				if(stack.isEmpty()) stack.push(ch);
				else if(stack.peek() == '(') stack.push(ch);
				else {
					sb.append(stack.pop());
					if(!stack.isEmpty() && (stack.peek() == '+' || stack.peek() == '-') ) {
						sb.append(stack.pop());
					}
					stack.push(ch);
				}
				break;
			case '*':
			case '/':
				if(stack.isEmpty()) stack.push(ch);
				else if(stack.peek() == '(' || stack.peek() == '+' || stack.peek() == '-') stack.push(ch);
				else {
					sb.append(stack.pop());
					stack.push(ch);
				}
				break;
			case '(':
				stack.push('(');
				break;
			case ')':
				if(stack.peek() == '(') {
					stack.pop();
					break;
				}
				sb.append(stack.pop());
				if(stack.peek() == '+' || stack.peek() == '-') sb.append(stack.pop());
				stack.pop();
				break;
			default:
				sb.append(ch);
				break;
				
				
			}
		}
		while(!stack.isEmpty()) sb.append(stack.pop());
		
		System.out.println(sb);
		
		
		

	}

}
