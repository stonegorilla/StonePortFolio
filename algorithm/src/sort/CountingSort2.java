package sort;

import java.util.Arrays;

public class CountingSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,4,2,16,14,13,12};
		int[] sorted = new int[arr.length];
		// 최대값 찾기
		int K = -1;
		for(int i=0; i<arr.length; i++) {
			if(K<arr[i]) K = arr[i];
		}
		
		int[] countArr = new int[K+1];
		// 카운트 하기 
		for(int i=0; i<arr.length; i++) {
			countArr[arr[i]]++;
		}
		
		// 누적합 하기 
		for(int i=1; i<countArr.length; i++) {
			countArr[i] += countArr[i-1];
		}
		System.out.println(Arrays.toString(countArr));
		// 넣기 
		for(int i=arr.length-1; i>=0; i--) {
			sorted[countArr[arr[i]]-1] = arr[i];
			countArr[arr[i]]--;
		}
		
		System.out.println(Arrays.toString(sorted));
		
	}

}
