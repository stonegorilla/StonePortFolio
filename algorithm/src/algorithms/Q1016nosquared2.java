package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class Q1016nosquared2{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		long min = Long.parseLong(st.nextToken());
		long max = Long.parseLong(st.nextToken());
		long result = max-min+1;
		for(long i=min; i<=max; i++) {
			for(int j=2; Math.pow(j, 2)<=i; j++) {
				if(i%Math.pow(j, 2) == 0) {
					
					result--;
					break;
				}
			}
		}
		System.out.println(result);
		
	}
}
