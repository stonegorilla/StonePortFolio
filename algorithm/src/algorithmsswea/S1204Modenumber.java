package algorithmsswea;

import java.util.Scanner;

public class S1204Modenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int testnumber = sc.nextInt();
			int arr[] = new int[101];
			for(int i=0; i<1000; i++) {
				
				arr[sc.nextInt()]++;
				
			}
			
			
			int idx = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[idx]<=arr[i]) {
					
					idx = i;
				}
			}
			
			System.out.println("#"+t+" "+idx);
			
			
		}
		
		
	}

}
