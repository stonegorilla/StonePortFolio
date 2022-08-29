package algorithms;

import java.util.ArrayList;
import java.util.Scanner;


public class Q1016nosquared3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		long min = sc.nextLong();
		long max = sc.nextLong();
		
//		int start = (int)(Math.ceil(Math.sqrt(min)));
		int end = (int)(Math.ceil(Math.sqrt(max)));
		
		
//		for(int i=3; i<=end; i++) {
//			boolean isPrime = true;
//			for(int j=0; list.get(j)<=Math.sqrt(i); j++) {
//				if(i%(list.get(j)*list.get(j)) == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			
//			if(isPrime) list.add(i);
//		}
		
	
		int result = (int)(max-min+1);
		
		boolean[] isChecked = new boolean[result];
		for(int i=2; i<=end; i++) {
			long idx = i;
			long x = (idx*idx -min%(idx*idx));
			if(min%(idx*idx) == 0) x = 0;
			if(x >= isChecked.length) continue;
			
			for(int j = (int)x; j<isChecked.length ; j = j+(i*i)) {
				
				if(!isChecked[j]) {

					isChecked[j] = true;
					result--;
				}
				if((long)(j)+(idx*idx)>= isChecked.length) break;
			}
//			for(int j=0; j<isChecked.length; j++) {
//				if(!isChecked[j] && (min+j)%(i*i) == 0  ) {
//					isChecked[j] = true;
//					result--;
//				}
//			}
			
		}
		System.out.println(result);
		
	}
}
