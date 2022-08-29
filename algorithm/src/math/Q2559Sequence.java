package math;

import java.util.Scanner;

public class Q2559Sequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int sumArr[] = new int[N];
		sumArr[0] = sc.nextInt();
		for(int i=1; i<N; i++) {
			sumArr[i] = sumArr[i-1]+ sc.nextInt();
		}
		int max = sumArr[K-1];
		for(int i=K; i<N; i++) {
			if(max<sumArr[i]-sumArr[i-K]) max = sumArr[i]-sumArr[i-K];
			
		}
		System.out.println(max);
		
	}
}
