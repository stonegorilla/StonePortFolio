package bfsdfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7576Tomato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<int[]> q = new LinkedList<>();
		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		int result = 0;
		
			int M = sc.nextInt(),N = sc.nextInt();
			int arr[][] = new int[N][M];
			// 미로 배치
			for(int i=0; i<N; i++) {
				
				for(int j=0; j<M; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					// 뭐 이건 나중에 다양한 출발점 할때 사용합시다.
					int idx = i , jdx = j;
					if(arr[idx][jdx] == 1) {
						int[] point = {idx,jdx,0};
						q.add(point);
						arr[idx][jdx]++;
						
						
						
					}
					
					
				}
			}
			
			while(!q.isEmpty()) {
				int[] point = q.poll();
				
					
					result = point[2];
				
				
				
				for(int k=0; k<4; k++) {
					if(point[0]+dr[k]>=0 && point[0]+dr[k]<N && point[1]+dc[k] >=0 && point[1]+dc[k]<M && arr[point[0]+dr[k]][point[1]+dc[k]] == 0) {
						int[] p = new int[3];
						p[0] = point[0]+dr[k];
						p[1] = point[1]+dc[k];
						p[2] = point[2]+1;
						q.add(p);
						
						arr[p[0]][p[1]]++;
						
						
						
					}
				}
				
				
			}
			boolean hasZero = false;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(arr[i][j] == 0) {
						hasZero = true;
						
					}
				}
			}
			if(hasZero) System.out.println(-1);
			else System.out.println(result);
		
	}

}
