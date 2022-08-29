package unionfindphasealignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q3665 {
	static int N;
	static int[] indegree;
	static boolean[][] edges;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			indegree = new int[N + 1];
			edges = new boolean[N + 1][N + 1];

			// 등수를 매김
			for (int i = 0; i < N; i++) {
				int num = sc.nextInt();
				indegree[num] = i;

				for (int j = 1; j <= N; j++) {
					if (j != num && !edges[j][num]) {
						edges[num][j] = true;
					}
				}

			}

			int M = sc.nextInt();
			for (int i = 0; i < M; i++) {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();

				swap(n1, n2);
			}
			System.out.println(reSort());
		}

	}

	private static String reSort() {
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb= new StringBuilder();
		
		for(int i=1; i<=N; i++) {
			if(indegree[i] == 0) queue.add(i);
		}
		
		for(int i=1; i<=N; i++) {
			if(queue.size() == 0) return "IMPOSSIBLE";
			
			if(queue.size()>1) return "?";
			
			int cur = queue.poll();
			sb.append(cur+" ");
			for(int j=1; j<=N; j++) {
				if(edges[cur][j]) {
					edges[cur][j] = false;
					if(--indegree[j] == 0) queue.add(j);
				}
			}
		}
		return sb.toString();
	}
	
	private static void swap(int n1, int n2) {
		if(!edges[n1][n2]) {
			edges[n1][n2] = true;
			edges[n2][n1] =false;
			indegree[n1]--;
			indegree[n2]++;
		}else {
			edges[n1][n2] = false;
			edges[n2][n1] = true;
			indegree[n1]++;
			indegree[n2]--;
		}
	}
}
