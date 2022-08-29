package bfsdfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2178MazeSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<int[]> q = new LinkedList<>();
		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		int result = 0;
		
			int N = sc.nextInt(),M = sc.nextInt();
			int arr[][] = new int[N][M];
			// 미로 배치
			for(int i=0; i<N; i++) {
				String line = sc.next();
				for(int j=0; j<M; j++) {
					arr[i][j] = Integer.parseInt(line.split("")[j]);
				}
			}
			
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					// 뭐 이건 나중에 다양한 출발점 할때 사용합시다.
					int idx = i , jdx = j;
					if(arr[idx][jdx] == 1) {
						int[] point = {idx,jdx,1};
						q.add(point);
						arr[idx][jdx]++;
						
						
						
					}
					while(!q.isEmpty()) {
						int[] point = q.poll();
						
						if(point[0] == N-1 && point[1] == M-1) {
							result = point[2];
							break;
						}
						
						for(int k=0; k<4; k++) {
							if(point[0]+dr[k]>=0 && point[0]+dr[k]<N && point[1]+dc[k] >=0 && point[1]+dc[k]<M && arr[point[0]+dr[k]][point[1]+dc[k]] == 1) {
								int[] p = new int[3];
								p[0] = point[0]+dr[k];
								p[1] = point[1]+dc[k];
								p[2] = point[2]+1;
								q.add(p);
								
								arr[p[0]][p[1]]++;
								
								
								
							}
						}
						
						
					}
					q.clear();
					
				}
			}
			
			System.out.println(result);
		
	}

}
