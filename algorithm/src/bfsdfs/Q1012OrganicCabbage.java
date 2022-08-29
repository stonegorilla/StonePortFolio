package bfsdfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1012OrganicCabbage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Queue<int[]> q = new LinkedList<>();
		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		int count = 0;
		for(int t=1; t<=T; t++) {
			int M = sc.nextInt(),N = sc.nextInt(), K = sc.nextInt();
			int arr[][] = new int[N][M];
			// 배추 배치
			for(int i = 0; i<K; i++) {
				int r = sc.nextInt(),c = sc.nextInt();
				arr[c][r] = 1;
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					
					int idx = i , jdx = j;
					if(arr[idx][jdx] == 1) {
						int[] point = {idx,jdx};
						q.add(point);
						arr[idx][jdx]++;
						count++;
						
						
					}
					while(!q.isEmpty()) {
						int[] point = q.poll();
						
						
						for(int k=0; k<4; k++) {
							if(point[0]+dr[k]>=0 && point[0]+dr[k]<N && point[1]+dc[k] >=0 && point[1]+dc[k]<M && arr[point[0]+dr[k]][point[1]+dc[k]] == 1) {
								int[] p = new int[2];
								p[0] = point[0]+dr[k];
								p[1] = point[1]+dc[k];
								
								q.add(p);
								
								arr[p[0]][p[1]]++;
								
								
								
							}
						}
						
						
					}
					q.clear();
					
				}
			}
			
			System.out.println(count);
			count = 0;
		}
	}

}
