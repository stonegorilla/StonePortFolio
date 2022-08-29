package math;

import java.util.Scanner;

public class Q1037Divisor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 2, min = 1000000;
		
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			
			if(max<num) max = num;
			if(min>num) min = num;
			
		}
		
		System.out.println(max*min);

	}

}
