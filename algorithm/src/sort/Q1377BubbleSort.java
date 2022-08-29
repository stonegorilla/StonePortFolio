package sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;





public class Q1377BubbleSort {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		int arr[][] = new int[N][2];
		
		int max = 0;
		for(int i=0; i<N; i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = i;
			
		}
		
		Arrays.sort(arr,(o1,o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		int idx = -1;
		for(int i=0; i<N; i++) {
			int dis = arr[i][1] - i;
			if(max<dis ) {
				max = dis;
			}
		}
		
		System.out.println(max+1);
	}

}
