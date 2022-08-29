package numberOfCase;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean[] isVisited = new boolean[num];
		
		int[] result = new int[r];
		
		combination(arr,isVisited,0,r);
		
	}
	
	
	static void combination(int[] arr, boolean[] isVisited, int start, int r) {
		if(r == 0) {
			
			for(int i=0; i<isVisited.length; i++) {
				if(isVisited[i]) System.out.print(arr[i]);
			}
			System.out.println();
		}else {
			for(int i=start; i<arr.length; i++) {
				if(!isVisited[i]) {
					isVisited[i] = true;
					
					combination(arr,isVisited,i+1,r-1);
					isVisited[i] = false;
					
				}
			}
		}
	}

}
