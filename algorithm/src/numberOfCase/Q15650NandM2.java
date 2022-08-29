package numberOfCase;

import java.util.Scanner;

public class Q15650NandM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		boolean[] isVisited = new boolean[num];
		
		int[] result = new int[r];
		
		combination(arr,result,0,r);
		
	}
	
	
	static void combination(int[] arr, int[] result, int start, int r) {
		if(r == 0) {
			
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}else {
			for(int i=start; i<arr.length; i++) {
				
				
					result[result.length-r] = arr[i];
					combination(arr,result,i+1,r-1);
					result[result.length-r] = 0;
					
				}
			}
		}

}
