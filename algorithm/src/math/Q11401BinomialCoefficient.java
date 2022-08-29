package math;

import java.util.Scanner;

public class Q11401BinomialCoefficient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long K = sc.nextLong();
		long mul1 = 1;
		for(int i=0; i<K; i++) {
			mul1 *= (N-i); 
			mul1 = mul1 % 1000000007;
		}
		
		long mul2 = 1;
		for(int i=1; i<=K; i++) {
			mul2 *= i;
			if(mul2>mul1) break;
		}
		if(mul2>mul1) System.out.println(mul1);
		else System.out.println(mul1/mul2);
	}
}
