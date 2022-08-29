package math;

import java.util.Scanner;

public class Q1912Sequence2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sumArr[] = new int[N];
		 sumArr[0] = arr[0];
		
		int max = arr[0];
		for(int i=1; i<N; i++) {
			// arr[i] 는 무조건 포함하고, 바로 앞에걸 포함안할지, 할지 여부 
			sumArr[i] = Math.max(arr[i], sumArr[i-1]+arr[i]);
			if(max<sumArr[i]) max = sumArr[i];
		}
		
		System.out.println(max);
		
	}
}
