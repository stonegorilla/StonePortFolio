package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {44,33,14,67,55,3,16};
		
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length-1-i; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		// 얘는 거꾸로 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[arr.length-2-j]>arr[arr.length-1-j]) {
					int temp = arr[arr.length-2-j];
					arr[arr.length-2-j] = arr[arr.length-1-j];
					arr[arr.length-1-j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
