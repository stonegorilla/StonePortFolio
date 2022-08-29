package algorithms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1978primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String aaa = sc.nextLine();
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			boolean isPrime = true;
			
			if(num == 1) isPrime= false;
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num%i == 0) {
					isPrime = false;
				}
			}
			
			if(isPrime) sum++;
			
			
		}
		
		System.out.println(sum);
	}

}
