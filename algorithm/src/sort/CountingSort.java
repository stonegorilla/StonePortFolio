package sort;

import java.util.Arrays;

public class CountingSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {42,95,33,6,77,10,31,5};
		// 1. 데이터 중 가장 큰값을 알아내야 겠다. 
		int K = -1;
		for(int i=0; i<arr.length; i++) {
			if(K< arr[i]) {
				K = arr[i];
			}// 최대값을 찾는 for 문
		}
		
		int[] count = new int[K+1];
		int[] sorted = new int[arr.length];
		
		//2. 세야죠 
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		// 누적합 왜 구하냐? 
		for(int i=1; i< count.length; i++) {
			count[i] += count[i-1];
		}
		
		// 4. 정렬해서 넣는다. 
		for(int i = arr.length -1; i>=0; i--) {
			int idx = count[arr[i]]-1;
			sorted[idx] = arr[i];
			count[arr[i]]--;
		}
		
		System.out.println(Arrays.toString(sorted));
	}

}
