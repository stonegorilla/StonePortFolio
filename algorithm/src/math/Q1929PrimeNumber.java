package math;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1929PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), N = sc.nextInt();
		
		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(2);
		if(M<=2) System.out.println(2);
		for(int i=3; i<=N; i++) {
			boolean isPrime = true;
			for(int j=0; prime.get(j)*prime.get(j)<=i; j++) {
				if(i%prime.get(j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				prime.add(i);
				if(i>=M) System.out.println(i);
			}
		}
		
		

	}

}
