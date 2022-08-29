package numberOfCase;

import java.util.Scanner;

public class Permutation {

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
		
		permutation(arr,isVisited,result,r);
		
	}
	
	
	static void permutation(int[] arr, boolean[] isVisited, int[] result, int r) {
		if(r == 0) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
		}else {
			for(int i=0; i<arr.length; i++) {
				if(!isVisited[i]) {
					isVisited[i] = true;
					result[result.length-r] = arr[i];
					permutation(arr,isVisited,result,r-1);
					isVisited[i] = false;
					result[result.length-r] = 0;
				}
			}
		}
	}

}
