package algorithms;

import java.util.Scanner;

public class Q10870Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fibonacci(num));
		
	}
	
	static int fibonacci(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
