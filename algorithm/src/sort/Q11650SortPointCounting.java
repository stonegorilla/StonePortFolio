package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Q11650SortPointCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int xmax = 0,xmin = 0, ymax =0,ymin=0;
		
		for(int i=0; i<n; i++) {
			if(arr[xmax][0]<arr[i][0]) xmax = i;
			if(arr[xmin][0]>arr[i][0]) xmin = i;
			if(arr[ymax][1]<arr[i][1]) ymax = i;
			if(arr[ymin][1]>arr[i][1]) ymin = i;
		}
		
		int[] countX = new int[arr[xmax][0]-arr[xmin][0]+1];
		int[] countY = new int[arr[ymax][1]-arr[ymin][1]+1];
		
		int[][] sortedY = new int[n][2];
		for(int i=0; i<n; i++) {
			countY[arr[i][1]-arr[ymin][1]]++;
		}
		
		for(int i=1; i<countY.length; i++) {
			countY[i] +=countY[i-1];
		}
		
		
		
		for(int i=n-1; i>=0; i--) {
			
			sortedY[countY[arr[i][1]-arr[ymin][1]]-1][1] = arr[i][1];
			sortedY[countY[arr[i][1]-arr[ymin][1]]-1][0] = arr[i][0];
			countY[arr[i][1]-arr[ymin][1]]--;
			
		}
		System.out.println(Arrays.deepToString(sortedY));
		int[][] sorted = new int[n][2];
		
		for(int i=0; i<n; i++) {
			countX[arr[i][0]-arr[xmin][0]]++;
		}
		
		for(int i=1; i<countX.length; i++) {
			countX[i] +=countX[i-1];
		}
		
		
		
		for(int i=n-1; i>=0; i--) {
			
			sorted[countX[sortedY[i][0]-arr[xmin][0]]-1][1] = sortedY[i][1];
			sorted[countX[sortedY[i][0]-arr[xmin][0]]-1][0] = sortedY[i][0];
			countX[sortedY[i][0]-arr[xmin][0]]--;
			
		}
		
		for(int i=0; i<sorted.length; i++) {
			System.out.println(sorted[i][0]+" "+sorted[i][1]);
		}
	}

}
