package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Q9251LCS1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] ch1 = br.readLine().toCharArray();
		char[] ch2 = br.readLine().toCharArray();
		
		
		int[][] lcs = new int[ch1.length][ch2.length];
		Stack<int[]> stack = new Stack<>();
		
		
		
		for(int i=0; i<ch1.length; i++) {
			for(int j=0; j<ch2.length; j++) {
				
				if(i == 0 && j == 0) {
					
					if(ch1[0] == ch2[0]) {
						lcs[0][0] = 1;
						int[] arr = new int[3];
						arr[0] = i;
						arr[1] = j;
						arr[2] = lcs[i][j];
						stack.add(arr);
						
					}
					else lcs[0][0] = 0;
				}else if(i == 0) {
					if(lcs[0][j-1] == 0 && ch1[0] == ch2[j]) {
						lcs[0][j] = 1;
						int[] arr = new int[3];
						arr[0] = i;
						arr[1] = j;
						arr[2] = lcs[i][j];
						stack.add(arr);
						
					}
					else lcs[0][j] = lcs[0][j-1];
					
				}else if(j==0) {
					if(lcs[i-1][0] == 0 && ch1[i] == ch2[0]) {
						
						lcs[i][0] = 1;
						int[] arr = new int[3];
						arr[0] = i;
						arr[1] = j;
						arr[2] = lcs[i][j];
						stack.add(arr);
					}
					else lcs[i][0] = lcs[i-1][0];
					
				}else {
					if(lcs[i-1][j] == lcs[i][j-1] && ch1[i] == ch2[j]) {
						lcs[i][j] = lcs[i-1][j-1]+1;
						int[] arr = new int[3];
						arr[0] = i;
						arr[1] = j;
						arr[2] = lcs[i][j];
						stack.add(arr);
						
					}
					else lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
					
				
				
			}
		}
		
		int idx = ch1.length;
		int jdx = ch2.length;
		int result = lcs[ch1.length-1][ch2.length-1];
		char[] resultArr = new char[result]; 
		while(!stack.isEmpty()) {
			if(stack.peek()[0] <idx && stack.peek()[1] <jdx && stack.peek()[2] == result) {
				resultArr[result-1] =  ch1[stack.peek()[0]];
				idx = stack.peek()[0];
				jdx = stack.peek()[1];
				result -= 1;
			}
			stack.pop();
			
		}
		for(int i=0; i<resultArr.length; i++) {
			sb.append(resultArr[i]);
		}
		System.out.println(Arrays.deepToString(lcs));
//		System.out.println(lcs[ch1.length-1][ch2.length-1]);
//		System.out.println(sb);
		

	}

}
