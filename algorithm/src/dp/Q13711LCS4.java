package dp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13711LCS4 {
	static List<Integer> dp = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int[] arr1 = new int[N];
		int[][] arr2 = new int[N][2];
		
		
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			arr2[i][0] = sc.nextInt();
			arr2[i][1] = i;
		}
		
		int[] madeArr = makingLIS(arr1,arr2);
		dp.add(madeArr[0]);
		
		
		for(int i=0; i<N; i++) {
			
			binarySearch(madeArr[i]);
			
		}
		
		
		
//		sb.append(dp.size()).append("\n");
//		for(int i=0; i<dp.size(); i++) {
//			sb.append(dp.get(i)).append(" ");
//		}
//		System.out.println(sb);
		System.out.println(dp.size());
	}
	
	static int[] makingLIS(int[] arr1 , int[][] arr2) {
		
		Arrays.sort(arr2, (o1,o2) -> {
			return Integer.compare(o1[0], o2[0]);
		});
		int[] resultArr = new int[arr1.length];
		
		for(int i=0; i<resultArr.length; i++) {
			resultArr[i] = arr2[arr1[i]-1][1];
		}
		return resultArr;
		
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
