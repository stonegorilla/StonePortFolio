package stackqueue;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2493Top {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int count = 0;
		
		for(int i=0; i<N; i++) {
			int[] num = new int[2];
			
			num[0] = Integer.parseInt(st.nextToken());
			num[1] = i+1;
			while(true) {
				if(stack.isEmpty()) {
					sb.append("0 ");
					stack.push(num);
					break;
				}else if(stack.peek()[0] <= num[0]) {
					stack.pop();
				}else {
					sb.append(stack.peek()[1]).append(" ");
					stack.push(num);
					break;
				}
			}
		}
		
		System.out.println(sb);
		
	}
}
