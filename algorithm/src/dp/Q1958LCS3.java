package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1958LCS3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] ch1 = br.readLine().toCharArray();
		char[] ch2 = br.readLine().toCharArray();
		char[] ch3 = br.readLine().toCharArray();
		
		int[][][] lcs = new int[ch1.length][ch2.length][ch3.length];
//		Stack<int[]> stack = new Stack<>();
		
		
		
		for(int i=0; i<ch1.length; i++) {
			for(int j=0; j<ch2.length; j++) {
				for(int k=0; k<ch3.length; k++) {
					
				
				if(i == 0 && j == 0 && k == 0) {
					
					if(ch1[0] == ch2[0] && ch2[0] == ch3[0]) {
						
						lcs[0][0][0] = 1;
					}
					else lcs[0][0][0] = 0;
				}else if(j == 0 && k == 0) {
					if(ch1[i] == ch2[0] && ch2[0] == ch3[0]) {
						lcs[i][0][0] = 1;
					}else if(lcs[i-1][0][0] == 1) {
						lcs[i][0][0] = 1;
					}else {
						lcs[i][0][0] = 0;
					}
				}else if(i == 0 && k == 0) {
					if(ch1[0] == ch2[j] && ch2[j] == ch3[0]) {
						lcs[0][j][0] = 1;
					}else if(lcs[0][j-1][0] == 1) {
						lcs[0][j][0] = 1;
					}else {
						lcs[0][j][0] = 0;
					}
				}else if(i==0 && j == 0) {
					if(ch1[0] == ch2[0] && ch2[0] == ch3[k]) {
						lcs[0][0][k] = 1;
					}else if(lcs[0][0][k-1] == 1) {
						lcs[0][0][k] = 1;
					}else {
						lcs[0][0][k] = 0;
					}
				}else if(i == 0) {
					if( ch1[0] == ch2[j] && ch2[j] == ch3[k]) {
						lcs[i][j][k] = 1;

						
					}else if(lcs[0][j-1][k] == 1 || lcs[0][j][k-1] == 1) {
						lcs[0][j][k] = 1;
					}else {
						lcs[0][j][k] = 0;
					}
					
				}else if(j==0) {
					if( ch1[i] == ch2[0] && ch2[0] == ch3[k]) {
						lcs[i][j][k] = 1;

						
					}else if(lcs[i-1][0][k] == 1 || lcs[i][0][k-1] == 1) {
						lcs[i][0][k] = 1;
					}else {
						lcs[i][0][k] = 0;
					}
					
				}else if(k==0) { 
					if( ch1[i] == ch2[j] && ch2[j] == ch3[0]) {
						lcs[i][j][k] = 1;

						
					}else if(lcs[i-1][j][0] == 1 || lcs[i][j-1][0] == 1) {
						lcs[i][j][0] = 1;
					}else {
						lcs[i][j][0] = 0;
					}
					
					
				}else {
					if(lcs[i-1][j][k] == lcs[i][j-1][k] && lcs[i][j-1][k] == lcs[i][j][k-1] && ch1[i] == ch2[j] && ch2[j] == ch3[k]) {
						lcs[i][j][k] = lcs[i-1][j-1][k-1]+1;

						
					}
					else lcs[i][j][k] = Math.max(Math.max(lcs[i-1][j][k], lcs[i][j-1][k]) , lcs[i][j][k-1]);
				}
					
				
				}
			}
		}
		
//		int idx = ch1.length;
//		int jdx = ch2.length;
//		int result = lcs[ch1.length-1][ch2.length-1];
//		char[] resultArr = new char[result]; 
//		while(!stack.isEmpty()) {
//			if(stack.peek()[0] <idx && stack.peek()[1] <jdx && stack.peek()[2] == result) {
//				resultArr[result-1] =  ch1[stack.peek()[0]];
//				idx = stack.peek()[0];
//				jdx = stack.peek()[1];
//				result -= 1;
//			}
//			stack.pop();
//			
//		}
//		for(int i=0; i<resultArr.length; i++) {
//			sb.append(resultArr[i]);
//		}
//		System.out.println(Arrays.deepToString(lcs));
		System.out.println(lcs[ch1.length-1][ch2.length-1][ch3.length-1]);
//		System.out.println(sb);
		

	}

}
