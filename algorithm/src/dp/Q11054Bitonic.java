package dp;


import java.util.Scanner;

public class Q11054Bitonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] dpac = new int[N];
		int[] dpde = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		dpac[0] = 1;
		dpde[N-1] = 1;
		for(int i=0; i<N; i++) {
			int maxac = 0,maxde=0;
			
			for(int j=0; j<i; j++) {
				
				if(arr[j]<arr[i]) {
					if(maxac<dpac[j]) maxac = dpac[j]; 
					
				}
				if(arr[N-1-j]<arr[N-1-i]) {
					if(maxde<dpde[N-1-j]) maxde = dpde[N-1-j];
				}
				
				dpac[i] = maxac+1;
				dpde[N-1-i] = maxde+1;
			}
		}
		int result =0;
		for(int i=0; i<N; i++) {
			if(result < dpac[i]+dpde[i]-1) result = dpac[i]+dpde[i]-1;
		}
		System.out.println(result);
		
	}

}
