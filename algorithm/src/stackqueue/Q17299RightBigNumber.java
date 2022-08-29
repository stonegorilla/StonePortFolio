package stackqueue;


import java.util.Scanner;
import java.util.Stack;

public class Q17299RightBigNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int count[] = new int[1000001];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			count[arr[i]]++;
			
		}
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=N-1; i>=0; i--) {
			while(true) {
				if(stack.isEmpty()) {
					
					stack.push(arr[i]);
					arr[i] = -1;
					break;
				}else if(count[stack.peek()] <= count[ arr[i]]) {
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
