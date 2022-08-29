package math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;

import java.util.StringTokenizer;

public class Q1033Cocktail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] resultArr = new long[N];
		Queue<int[]> q = new LinkedList<>();
		int x = 0, y=0;
		for(int i=0; i<N-1; i++) {
			int arr[] = new int[4];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<2; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				
			}
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == b) {
				arr[2] = 1;
				arr[3]= 1;
			}else {
				for(int k=4 ; k>=2; k--) {
					if(a%k == 0 && b%k == 0) {
						a = a/k;
						b = b/k;
					}
				}
				arr[2] = a;
				arr[3] = b;
			}
			
			if(i ==0) {
				x = arr[0]; 
				y = arr[1];
				resultArr[x] = arr[2];
				resultArr[y] = arr[3];
			}else if(resultArr[arr[0]] !=0) {
				long temp = resultArr[arr[0]];
				for(int idx = 0; idx<N; idx++) {
					resultArr[idx] *= arr[2];
				}
				resultArr[arr[1]] = temp*arr[3];
				x = arr[0];
				y = arr[1];
				
			}else if(resultArr[arr[1]] !=0) {
				long temp = resultArr[arr[1]];
				for(int idx=0; idx<N; idx++) {
					resultArr[idx] *= arr[3];
				}
				resultArr[arr[0]] = temp*arr[2];
				x = arr[0];
				y = arr[1];
				
			}else {
				q.add(arr);
			}
			
			
		}
		
		
		
		
		while(!q.isEmpty()) {
			
			if(resultArr[q.peek()[0]] == 0 && resultArr[q.peek()[1]] == 0) {
				q.add( q.poll());
			}else if(resultArr[ q.peek()[0]] != 0) {
				long temp = resultArr[q.peek()[0]];
				for(int i = 0; i<N; i++) {
					resultArr[i] *= q.peek()[2];
				}
				resultArr[q.peek()[1]] = temp*q.peek()[3];
				x = q.peek()[0];
				y = q.peek()[1];
				q.poll();
			}else if(resultArr[ q.peek()[1]] != 0) {
				long temp = resultArr[q.peek()[1]];
				for(int i=0; i<N; i++) {
					resultArr[i] *= q.peek()[3];
				}
				resultArr[q.peek()[0]] = temp*q.peek()[2];
				x = q.peek()[0];
				y = q.peek()[1];
				q.poll();
			}else {
				
			}
			
		}
		
		boolean divided2 = true;
		boolean divided3 = true;
		boolean divided5 = true;
		boolean divided7 = true;
		loop:
		while(divided2) {
			for(int i=0; i<N; i++) {
				if(resultArr[i]%2 != 0) {
					divided2 = false;
					break loop;
				}
			}
			
			for(int i=0; i<N; i++) {
				resultArr[i] /=2;
			}
			
		}
		
		loop:
			while(divided3) {
				for(int i=0; i<N; i++) {
					if(resultArr[i]%3 != 0) {
						divided3 = false;
						break loop;
					}
				}
				
				for(int i=0; i<N; i++) {
					resultArr[i] /=3;
				}
				
			}
		
		loop:
			while(divided5) {
				for(int i=0; i<N; i++) {
					if(resultArr[i]%5 != 0) {
						divided5 = false;
						break loop;
					}
				}
				
				for(int i=0; i<N; i++) {
					resultArr[i] /=5;
				}
				
			}
		
		loop:
			while(divided7) {
				for(int i=0; i<N; i++) {
					if(resultArr[i]%7 != 0) {
						divided7 = false;
						break loop;
					}
				}
				
				for(int i=0; i<N; i++) {
					resultArr[i] /=7;
				}
				
			}
		
//		System.out.println(Arrays.toString(resultArr));
		for(int i=0; i<resultArr.length; i++) {
			System.out.print(resultArr[i]+" ");
		}
		
		
	}
	
	
}
