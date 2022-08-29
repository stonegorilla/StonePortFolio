package algorithms;

import java.util.Scanner;

public class Q2407Combi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong(), M = sc.nextLong();
		
		long mul = 1;
		long k1 = M;
		long k2 = M;
		while(k1 > 0 || k2 > 0) {
			
			if(k1 >0) {
				mul *=(N-k1+1);
				k1--;
			}
			
			
			while(k2>0 && mul%k2 == 0) {
				mul /= k2;
				k2--;
			}
			
			
		}
		System.out.println(mul);
	}

}
