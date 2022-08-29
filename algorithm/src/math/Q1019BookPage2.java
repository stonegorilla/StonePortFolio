package math;

import java.util.Scanner;
import java.util.Stack;

public class Q1019BookPage2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long N = sc.nextInt();
		
		long[] arr= new long[10];
		Stack<Integer> stack = new Stack<>();
		long test = N;
		while(test!=0) {
		
			int r = (int)test%10;
			test = test/10;
			arr[r] +=1;
			stack.push(r);
		}
		
		
		
		
		
		
		long q = 0;
		int r=0;
		test = N;
		while(!stack.isEmpty()) {
			r = (int)(test-Math.pow(10, stack.size()-1)*stack.peek());
			for(int i=0; i<stack.peek(); i++) {
				arr[i] += Math.pow(10, stack.size()-1);
			}
			arr[stack.peek()] += r;
			
			for(int i=0; i<10; i++) {
				arr[i] += q/10;
			}
			
			arr[0] -= Math.pow(10, stack.size()-1);
			
			q += Math.pow(10, stack.size()-1)*stack.peek();
			test = r;
			stack.pop();
			
		}
		
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}

}
