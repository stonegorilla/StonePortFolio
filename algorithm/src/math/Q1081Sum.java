package math;

import java.util.Scanner;
import java.util.Stack;

public class Q1081Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long L = sc.nextLong();
		long U = sc.nextLong();
		if(L == 0) System.out.println(sum(U)-sum(0));
		else System.out.println(sum(U)-sum(L-1));
		
	}
	
	static long sum(long N) {
		long[] arr= new long[10];
		Stack<Integer> stack = new Stack<>();
		long test = N;
		while(test!=0) {
		
			int r = (int)(test%10);
			test = test/10;
			arr[r] +=1;
			stack.push(r);
		}
		
		
		long q = 0;
		int r=0;
		test = N;
		while(!stack.isEmpty()) {
			r = (int)((long)test-(long)(Math.pow(10, stack.size()-1)*stack.peek()));
			for(int i=0; i<stack.peek(); i++) {
				arr[i] += Math.pow(10, stack.size()-1);
			}
			arr[stack.peek()] += r;
			
			for(int i=0; i<10; i++) {
				arr[i] += q/10;
			}
			
			arr[0] -= Math.pow(10, stack.size()-1);
			
			q += (long)(Math.pow(10, stack.size()-1)*stack.peek());
			test = r;
			stack.pop();
			
		}
		
		long sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += (arr[i])*i;
		}
		return sum;
	}

}
