package sort;

public class BinarySearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,9,15,22,30,75,90,134,236,455,600,674,1000};
		
		int start = 0;
		int end = arr.length-1;
		int key = 30;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid] ==key) {
				System.out.println(mid);
				break;
			}
			else if(arr[mid]>key) end = mid-1;
			else start = mid+1;
			
			
			
			
		}
	}

	
}
