package math;

import java.util.Arrays;
import java.util.Scanner;

public class Q2108Statistics {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += arr[i];
		}
		sb.append(Math.round((double)sum/arr.length)).append('\n');
		sb.append(arr[arr.length/2]).append('\n');
		
		int[] countArr = new int[N];
		countArr[0] = 1;
		int countMax = 1;
		for(int i=1; i<countArr.length; i++) {
			if(arr[i-1] == arr[i]) countArr[i] = countArr[i-1] +1;
			else countArr[i] = 1;
			
			if(countArr[i] >countMax ) countMax = countArr[i];
		}
		
		int mode = 0;
		int isSecond = 0;
		for(int i=0; i<countArr.length; i++) {
			if(countMax == countArr[i]) { 
				mode = arr[i];
				isSecond++;
			}
			if(isSecond == 2) break;
			
		}
		
		sb.append(mode).append('\n');
		
		
		sb.append(arr[arr.length-1]-arr[0]).append('\n');
		
		System.out.println(sb);
	}
}
