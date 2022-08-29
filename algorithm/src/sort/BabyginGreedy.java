package sort;

import java.util.Arrays;

public class BabyginGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "101123";
		int[] arr = new int[12];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-48]++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-2; i++) {
			
			while(arr[i]>=3) {
				arr[i] -= 3;
			}
			
			while(arr[i]*arr[i+1]*arr[i+2] != 0) {
				arr[i]--;
				arr[i+1]--;
				arr[i+2]--;
			}
		}
		
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i] != 0) {
				System.out.println("Not BabyGin");
				break;
			}
			if(i == arr.length-3) System.out.println("BabyGin");
		}
	}

}
