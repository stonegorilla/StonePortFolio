package algorithmsswea;

import java.util.Scanner;

public class S1984average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int arr[] = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length-1-i; j++) {
					if(arr[arr.length-2-j]>arr[arr.length-1-j]) {
						int temp = arr[arr.length-2-j];
						arr[arr.length-2-j] = arr[arr.length-1-j];
						arr[arr.length-1-j] = temp;
					}
				}
			} // 정렬
			
			int sum = 0;
			int num = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != arr[0] && arr[i] != arr[arr.length-1]) {
					
					sum += arr[i];
					num++;
				}
				
			}
			if(num == 0) System.out.println("#"+t+" "+0);
			else System.out.println("#"+t+" "+Math.round(sum/(double)num));
			
			
		}
		
	}

}
