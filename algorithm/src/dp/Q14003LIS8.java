package dp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14003LIS8 {
	static List<Integer> dp = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		dp.add(arr[0]);
		for(int i=0; i<N; i++) {
			
			binarySearch(arr[i]);
			
		}
		
		
		
		sb.append(dp.size()).append("\n");
		int[] resultArr = new int[dp.size()];
		for(int i= N-1,idx = dp.size()-1; i>=0; i--) {
			if(idx == dp.size()-1 && arr[i]>=dp.get(idx)) {
				resultArr[idx] = arr[i];
				idx--;
			}else if(arr[i]>=dp.get(idx) && arr[i]<resultArr[idx+1]) {
				resultArr[idx] = arr[i];
				idx--;
			}else {
				
			}
			
			if(idx == -1) break; 
		}
		
		for(int i=0; i<resultArr.length; i++) {
			sb.append(resultArr[i]).append(" ");
		}
		System.out.println(sb);
		
	}
	
	static void binarySearch(int key) {
		int start = 0;
		int end = dp.size()-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(dp.get(mid) ==key) {
				
				break;
			}
			else if(dp.get(mid) >key) end = mid-1;
			else start = mid+1;
			
			if(start>=dp.size()) {
				dp.add(key);
				break;
			}
			if(start>end) {
				dp.set(start, key);
				break;
			}
			
		}
		
		
	}

}
