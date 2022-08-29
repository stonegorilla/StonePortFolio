package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Q17298RightBigNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		int[] arr= new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=N-1; i>=0; i--) {
			while(true) {
				if(stack.isEmpty()) {
					
					stack.push(arr[i]);
					arr[i] = -1;
					break;
				}else if(stack.peek() <= arr[i]) {
					stack.pop();
				}else {
					int temp = stack.peek();
					stack.push(arr[i]);
					arr[i] = temp;
					break;
				}
			}
				
		
		}
		for(int i=0; i<N; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);

	}

}
