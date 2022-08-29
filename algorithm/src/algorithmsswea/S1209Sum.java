package algorithmsswea;

import java.util.Scanner;

public class S1209Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			sc.nextInt();
			int[][] arr = new int[100][100];
			// 배열 값넣기
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int maxSum = -1;
			// 가로 덧셈
			for(int i=0; i<100; i++) {
				int sum = 0;
				for(int j=0; j<100; j++) {
					sum += arr[i][j]; 
				}
				if(maxSum <sum) maxSum = sum;
			}
			
			// 세로 덧셈
			for(int i=0; i<100; i++) {
				int sum = 0;
				for(int j=0; j<100; j++) {
					sum += arr[j][i]; 
				}
				if(maxSum <sum) maxSum = sum;
			}
			
			// 대각선
			int sum = 0;
			for(int i=0; i<100; i++) {
				sum += arr[i][i];
				
			}
			if(maxSum <sum) maxSum = sum;
			sum = 0;
			for(int i=0; i<100; i++) {
				sum += arr[i][99-i];
			}
			if(maxSum <sum) maxSum = sum;
			
			System.out.println("#"+t+" "+maxSum);
		}
	}
}
