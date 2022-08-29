package algorithms;

import java.util.Scanner;

public class Q1932IntegerTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][];
		int[][] memory = new int[N][];
		for(int i=0; i<N; i++) {
			arr[i] = new int[i+1];
			memory[i] = new int[i+1];
			for(int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		memory[0][0] = arr[0][0];
		for(int i=1; i<N; i++) {
			
			
			for(int j=0; j<=i; j++) {
				if(j==0) {
					memory[i][0] = memory[i-1][0]+arr[i][0];
				}else if(j == i) {
					memory[i][j] = memory[i-1][j-1]+arr[i][j];
				}else {
					memory[i][j] = Math.max(memory[i-1][j-1], memory[i-1][j])+arr[i][j];
				}
			}
			
		}
		int max = 0;
		for(int i=0; i<N; i++) {
			if(max<memory[N-1][i]) max = memory[N-1][i];
		}
		System.out.println(max);
		
		
	}

}
