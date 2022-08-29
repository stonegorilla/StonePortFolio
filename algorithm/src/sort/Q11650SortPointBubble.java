package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q11650SortPointBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j][0]>arr[j+1][0]) {
					int temp = arr[j][0];
					arr[j][0] = arr[j+1][0];
					arr[j+1][0] = temp;
					 temp = arr[j][1];
					arr[j][1] = arr[j+1][1];
					arr[j+1][1] = temp;
				}else if(arr[j][0] == arr[j+1][0]) {
					
					if(arr[j][1]>arr[j+1][1]) {
						int temp = arr[j][0];
						arr[j][0] = arr[j+1][0];
						arr[j+1][0] = temp;
						 temp = arr[j][1];
						arr[j][1] = arr[j+1][1];
						arr[j+1][1] = temp;
					}
				}else {
					
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.printf(arr[i][0]+" "+arr[i][1]);
			System.out.println();
		}
	}

}
