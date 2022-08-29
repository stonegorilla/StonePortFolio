package algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class Q2407Combi2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		
		BigInteger mul = new BigInteger("1");
		
		for(int i=0; i<M; i++) {
			BigInteger idx = new BigInteger(String.valueOf(N-i));
			mul = mul.multiply(idx);
		}
		for(int i=1; i<=M; i++) {
			BigInteger idx = new BigInteger(String.valueOf(i));
			mul = mul.divide(idx);
		}
		System.out.println(mul);
	}

}
