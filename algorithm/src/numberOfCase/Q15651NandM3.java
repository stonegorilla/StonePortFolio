package numberOfCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Q15651NandM3 {
	
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int num = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		
		int[] result = new int[r];
		
		overlapPermutation(arr,result,r);
		System.out.println(sb);
	}
	
	
	


	static void overlapPermutation(int[] arr,  int[] result, int r) {
		if(r == 0) {
			for(int i=0; i<result.length; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
		}else {
			for(int i=0; i<arr.length; i++) {
				
					result[result.length-r] = arr[i];
					overlapPermutation(arr,result,r-1);
					
					result[result.length-r] = 0;
				
			}
		}
	}
}
