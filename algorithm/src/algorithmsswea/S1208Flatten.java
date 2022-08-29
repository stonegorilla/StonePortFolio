package algorithmsswea;

import java.util.Scanner;

public class S1208Flatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int arr[] = new int[100];
			int dumpNum = sc.nextInt();
			for(int i=0; i<100; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<dumpNum; i++) {
				int maxIdx = 0;
				int minIdx = 0;
				for(int j=0; j<100; j++) {
					if(arr[maxIdx]<arr[j]) maxIdx = j;
					if(arr[minIdx]>arr[j]) minIdx = j;
					
				}
				
				if(arr[maxIdx]-arr[minIdx]<=1) break;
				
				arr[maxIdx]--;
				arr[minIdx]++;
				
			}
			
			int maxIdx = 0;
			int minIdx = 0;
			for(int i=0; i<100; i++) {
				if(arr[maxIdx]<arr[i]) maxIdx = i;
				if(arr[minIdx]>arr[i]) minIdx = i;
			}
			
			System.out.println("#"+t+" "+(arr[maxIdx]-arr[minIdx]));
			
			
		}
	}

}
