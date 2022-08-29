package sort;

import java.util.Scanner;
import java.util.StringTokenizer;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int n = Integer.parseInt(sc.nextLine());
			int arr[] = new int[n];
			StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int sum = 0;
			for(int i=2; i<n-2; i++) {
				int max = Math.max(Math.max(Math.max(arr[i-2], arr[i-1]), arr[i+1]),arr[i+2]);
				if(arr[i]>max) sum += (arr[i]-max);
			}
			
			System.out.println("#"+t+" "+sum);
		}
	}

}
