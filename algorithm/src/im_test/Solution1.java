package im_test;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int kMin = sc.nextInt();
			int kMax = sc.nextInt();
			int[] count = new int[101];
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");
			for(int i=0; i<N; i++) {
				count[sc.nextInt()]++;
			}
			
			// T1 과 T2 , 그리고 max-min 해서 찾기
			int anum = 0;
			int bnum = 0;
			int cnum = 0;
			int subMin = 1000;
			for(int t1 = 2; t1<=100; t1++) {
				anum += count[t1-1];
				
				cnum = 0;
				bnum = N-anum-cnum;
				
				for(int t2 = 100; t2>t1; t2--) {
					cnum += count[t2];
					bnum -= count[t2];
					
					int max = Math.max(Math.max(anum, bnum), cnum);
					int min = Math.min(Math.min(anum, bnum), cnum);
					
					if(max <= kMax && min>= kMin &&max-min< subMin) subMin = max-min;
//					System.out.println(anum+" "+bnum+" "+cnum+" "+subMin);
				}
			}
			if(subMin == 1000) sb.append(-1);
			else sb.append(subMin);
			
			System.out.println(sb);
		}
	}

}
