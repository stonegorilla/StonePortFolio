package numberOfCase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q15666NandM12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int r = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<num; i++) {
			set.add(sc.nextInt());
		}
		int[] arr = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		int i=0;
		while(iter.hasNext()) {
			arr[i] = iter.next();
			i++;
		}
		
		
		Arrays.sort(arr);
		
		int[] result = new int[r];
		
		overlapCombination(arr,result,0,r);
		
	}
	
	
	static void overlapCombination(int[] arr,  int[] result,int start, int r) {
		if(r == 0) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}else {
			for(int i=start; i<arr.length; i++) {
				
					result[result.length-r] = arr[i];
					overlapCombination(arr,result,i,r-1);
					
					result[result.length-r] = 0;
				
			}
		}
	}

}
