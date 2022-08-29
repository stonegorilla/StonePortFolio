package bfsdfs;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2667AptComplex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Queue<int[]> q = new LinkedList<>();
		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		int count = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			// 단지 배치
			for(int i = 0; i<N; i++) {
				String line = sc.next();
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(line.split("")[j]);
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					int number = 0;
					int idx = i , jdx = j;
					if(arr[idx][jdx] == 1) {
						int[] point = {idx,jdx};
						q.add(point);
						number++;
						arr[idx][jdx]++;
						count++;
						
						
					}
					while(!q.isEmpty()) {
						int[] point = q.poll();
						
						
						for(int k=0; k<4; k++) {
							if(point[0]+dr[k]>=0 && point[0]+dr[k]<N && point[1]+dc[k] >=0 && point[1]+dc[k]<N && arr[point[0]+dr[k]][point[1]+dc[k]] == 1) {
								int[] p = new int[2];
								p[0] = point[0]+dr[k];
								p[1] = point[1]+dc[k];
								
								q.add(p);
								number++;
								arr[p[0]][p[1]]++;
								
								
								
							}
						}
						
						
						
					}
					if(number != 0) arrayList.add(number) ;
					q.clear();
					
				}
			}
			
			System.out.println(count);
			
			Collections.sort(arrayList);
			for(int i=0; i<arrayList.size(); i++) {
				sb.append(arrayList.get(i)).append('\n');
			}
			System.out.println(sb);
			
			
		
	}

}
