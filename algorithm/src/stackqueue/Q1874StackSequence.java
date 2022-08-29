package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Q1874StackSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		int num = 1;
		boolean isNo = false;
		for(int i=0; i<N; i++) {
			
			int target = sc.nextInt();
			while(true) {
				if(!stack.isEmpty() && target == stack.peek()) {
					stack.pop();
					sb.append("-").append('\n');
					break;
				}else if(stack.isEmpty() || target>stack.peek()) {
					if(num<=N) {
						stack.push(num);
						sb.append("+").append('\n');
						num++;
					}else {
						isNo = true;
						break;
					}
					
					
				}else {
					isNo = true;
					break;
				}
				
				
			}
			
			if(isNo) break;
		}
		
		if(isNo) System.out.println("NO");
		else System.out.println(sb);

	}

}
