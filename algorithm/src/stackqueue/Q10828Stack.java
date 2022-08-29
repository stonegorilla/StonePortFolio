package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Q10828Stack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num; i++) {
			String command = sc.next();
			
			switch(command) {
				
			case "push":
				stack.push(sc.nextInt());
				break;
				
			case "pop":
				if(!stack.isEmpty()) sb.append(stack.pop()).append('\n');
				else sb.append(-1).append('\n');
				break;
			case "size":
				sb.append(stack.size()).append('\n');
				break;
			case "empty":
				if(stack.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "top":
				if(stack.isEmpty()) sb.append(-1).append('\n');
				else sb.append(stack.peek()).append('\n');
				break;
				
			default:
				break;
			}
		}
		
		System.out.println(sb);
	}

}
