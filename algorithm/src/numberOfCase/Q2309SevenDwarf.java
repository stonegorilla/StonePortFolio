package numberOfCase;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309SevenDwarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 합구하기
		int sum = 0;
		for(int i=0; i<9; i++) {
			sum += arr[i];
		}
		Arrays.sort(arr);
		int d1 = 0;
		int d2 = 0;
		for(int i=0; i<9; i++) {
			for(int j = i+1; j<9; j++) {
				if(sum-arr[i]-arr[j] == 100) {
					d1 = i;
					d2 = j;
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(i != d1 && i !=d2) {
				System.out.println(arr[i]);
			}
		}
	}

}
