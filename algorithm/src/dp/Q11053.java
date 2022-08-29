package dp;


import java.util.Scanner;

public class Q11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] dp = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		dp[0] = 1;
		for(int i=0; i<N; i++) {
			int max = 0;
			for(int j=0; j<i; j++) {
				
				if(arr[j]<arr[i]) {
					if(max<dp[j]) max = dp[j]; 
					
				}
				dp[i] = max+1;
			}
		}
		
		int result =0;
		for(int i=0; i<N; i++) {
			if(result < dp[i]) result = dp[i];
		}
		System.out.println(result);
		
	}

}
