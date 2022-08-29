package math;

import java.util.Scanner;

public class Q1024SequenceSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		while(N>= (L*(L-1))/2 && L<=100) {
			if((N-(L*(L-1))/2) % L == 0) {
				int n = (N-(L*(L-1))/2) / L ;
				for(int i=0; i<L; i++) {
					sb.append(n+i).append(" ");
				}
				
				break;
			}
			L++;
		}
		
		if(N< (L*(L-1))/2 || L>100) System.out.println(-1);
		else System.out.println(sb);
	}

}
