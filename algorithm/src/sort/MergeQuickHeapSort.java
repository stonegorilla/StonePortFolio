package sort;

import java.util.Arrays;

public class MergeQuickHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,3,16,4,4,2,16,19,20,1};
		int arr2[] = {10,4,8,5,12,2,6,11,3,9,7,1};
//		int arr1[] = Arrays.copyOfRange(arr, 1, 1);
//		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(heapSort(arr2)));
	}
	
	static int[] mergeSort(int[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		int[] arr1 = mergeSort(Arrays.copyOf(arr, arr.length/2));
		int[] arr2 = mergeSort(Arrays.copyOfRange(arr,arr.length/2 , arr.length));
		return merge(arr1,arr2);		
			
	}
	static int[] merge(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length+arr2.length];
		
		int i=0,i1=0,i2=0;
		while(i<arr1.length+arr2.length) {
			if(i1 == arr1.length) {
				mergedArr[i] = arr2[i2];
				i2++;
			}else if(i2 == arr2.length) {
				mergedArr[i] = arr1[i1];
				i1++;
			}else if(arr1[i1] <arr2[i2]) {
				mergedArr[i] = arr1[i1];
				i1++;
			}else {
				mergedArr[i] = arr2[i2];
				i2++;
			}
			
			i++;
		}
		return mergedArr;
	}
	
	static int[] quickSort(int[] arr) {
		if(arr.length <= 1) {
			return arr;
		}
		
		int pivot = arr[0];
		int start = 1, end = arr.length-1;
		// 자를 위치
		int cut = 0;
		while(cut ==0) {
			if(arr[start]<=pivot && arr[end]>pivot) {
				start++;
				end--;
			}else if(arr[start]<=pivot && arr[end]<=pivot) {
				start++;
			}else if(arr[start]>pivot && arr[end]<=pivot) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}else {
				end--;
				
			}
			
			if(start == end) {
				if(arr[start]<= pivot) cut = start+1;
				else cut = start;
			}
			if(start >end) cut = start;
		}
		
		int[] arr1 = quickSort(Arrays.copyOfRange(arr, 1, cut));
		int[] arr2 = quickSort(Arrays.copyOfRange(arr, cut, arr.length));
		
		int[] quickArr = new int[arr.length];
		for(int i=0; i<arr.length; i++ ) {
			if(i<arr1.length) {
				quickArr[i] = arr1[i];
			}else if(i == arr1.length) {
				quickArr[i] = arr[0];
			}else {
				quickArr[i] = arr2[i-arr1.length-1];
			}
		}
		
		return quickArr;	
	}
	
	static int[] heapSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int idx = i;
			while(idx!= 0 && arr[idx] >arr[(idx-1)/2]) {
				int temp = arr[idx];
				arr[idx] = arr[(idx-1)/2];
				arr[(idx-1)/2] = temp;
				idx = (idx-1)/2;
			}
		}
		int[] heapArr = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			heapArr[i] = arr[0];
			arr[0] = arr[i];
			arr[i] = 0;
			int idx = 0;
			while(2*idx+2<=i) {
				
				if(2*idx+2 == i) {
					if(arr[idx]<arr[2*idx+1]) {
						int temp = arr[idx];
						arr[idx] = arr[2*idx+1];
						arr[2*idx+1] = temp;
						idx = 2*idx+1;
					}else {
						break;
					}
				}else {
					if(arr[idx]<arr[2*idx+2] && arr[2*idx+1]<arr[2*idx+2]) {
						int temp = arr[idx];
						arr[idx] = arr[2*idx+2];
						arr[2*idx+2] = temp;
						idx = 2*idx+2;
						
					}else if(arr[idx]<arr[2*idx+1]) {
						int temp = arr[idx];
						arr[idx] = arr[2*idx+1];
						arr[2*idx+1] = temp;
						idx= 2*idx+1;
					}else {
						break;
					}
				}
				
				
				
			}
		}
		return heapArr;
	}

}
