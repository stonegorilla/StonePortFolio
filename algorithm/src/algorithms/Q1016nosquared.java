package algorithms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1016nosquared{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		
//		int start = (int)(Math.ceil(Math.sqrt(min)));
		int end = (int)(Math.floor(Math.sqrt(max)));
		
		for(int i=3; i<=end; i++) {
			boolean isPrime = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) list.add(i);
		}
		
		
	
		long result = max-min+1;
		for(long i=min; i<=max; i++) {
			long i2 = i;
			boolean divided = false;
			boolean res = false;
			for(int j=0; j<list.size() && list.get(j)*list.get(j)<=i; j++) {
				if(i2%list.get(j) == 0 && divided == true) {
					res = true;
					divided = false;
					break;
				}else if(i%list.get(j) == 0 && divided == false) {
					i2 = i2/list.get(j);
					j--;
					divided = true;
				}else {
					divided = false;
				}
			}
			if(res) result--;
		}
		System.out.println(result);
		
	}
}
