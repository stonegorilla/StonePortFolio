package math;

import java.util.Scanner;

public class Q1019BookPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		int[] arr= new int[10];
		
		
		for(int i=1; i<=N; i++) {
			int num = i;
			while(num !=0) {
				int q = num/10;
				int r = num%10;
				
				num = q;
				arr[r]++;
			}
		}

		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}

}
