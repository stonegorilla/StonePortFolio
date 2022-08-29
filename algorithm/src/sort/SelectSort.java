package sort;

import java.util.Arrays;

public class SelectSort {
	int[] arr = {8,123,18,321,45,418,324,64};
	public static void main(String[] args) {
		int[] nums = {8,123,18,321,45,418,324,64};
		
		for(int i=0; i<nums.length; i++) {
			int minIdx = i;
			
			for(int j=i; j<nums.length; j++) {
				if(nums[j]<nums[minIdx]) {
					minIdx = j;
					
				}
			}
			
			
			swap(nums, i, minIdx);
			// swap2(arr[i],arr[minIdx]);
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	
	static void swap(int[] nums,int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	static void swap2(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
