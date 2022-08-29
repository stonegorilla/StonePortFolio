package unionfindphasealignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1766WorkBook {
	static Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer>[] tree = new ArrayList[N + 1];

		for (int i = 0; i <= N; i++) {
			tree[i] = new ArrayList<>();
		}
		int noe[] = new int[N + 1];
		
		for (int i = 0; i < M; i++) {
			// 풀고, 그 다음 문제
			int first = sc.nextInt(), second = sc.nextInt();
			tree[first].add(second);
			noe[second]++;
		}
		
		
		
		for(int i=1; i<=N; i++) {
			if(noe[i] == 0) {
				q.add(i);
				for(int j=0; j<tree[i].size(); j++) {
					noe[tree[i].get(j)]--;
					if(noe[tree[i].get(j)] == 0 && tree[i].get(j)<i) q.add(tree[i].get(j));
				}
				
			}
		}
		
		while(!q.isEmpty()) {
			
			
			sb.append(q.poll()).append(" ");
		}
		System.out.println(sb);
	}
	
	static void makingList() {
		
	}

}
