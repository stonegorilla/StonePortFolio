package stackqueue;


import java.util.Scanner;
import java.util.Stack;

public class Q10773Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		long sum = 0;
		for(int i=0; i<N; i++) {
			int Input = sc.nextInt();
			if(Input == 0) {
				sum -= stack.pop();
			}else {
				stack.push(Input);
				sum += Input;
			}
		}
		System.out.println(sum);
	}

}
