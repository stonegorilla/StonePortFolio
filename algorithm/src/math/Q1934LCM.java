package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Q1934LCM {

	public static void main(String[] args) throws  IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int a = Math.max(M, N);
			int b = Math.min(M, N);
			
			while(a%b != 0) {
				int temp = a;
				a = b;
				b = temp%b;
				
			}
			
			
			sb.append((N*M)/b).append('\n');
			
			
				
		}
		
		System.out.println(sb);

	}

}
