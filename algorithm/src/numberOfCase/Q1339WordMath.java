package numberOfCase;




import java.util.ArrayList;

import java.util.Scanner;

public class Q1339WordMath {
	static int[] constArr = new int[10];
	static int maxSum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		ArrayList<String> alpabet = new ArrayList<>();
		for(int i=0; i<num; i++) {
			String str = sc.next();
			
			for(int j=0; j<str.length(); j++) {
				if(!alpabet.contains(String.valueOf(str.charAt(j)))) {
					alpabet.add(String.valueOf(str.charAt(j)));
					
				}
					constArr[alpabet.indexOf(String.valueOf(str.charAt(j)))] += Math.pow(10, str.length()-1-j);
				
				
			}
			
			
		}
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		boolean[] isVisited = new boolean[10];
		int[] result = new int[alpabet.size()];
		
		permutation(arr,isVisited,result,alpabet.size());
		System.out.println(maxSum);
		
	}

	static void permutation(int[] arr, boolean[] isVisited, int[] result, int r) {
		if(r == 0) {
			int sum = 0;
			
			for(int i=0; i<result.length; i++) {
				sum += result[i]*constArr[i];
			}
			if(maxSum <sum) {
				maxSum = sum;

			}
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
