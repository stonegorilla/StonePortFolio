package unionfindphasealignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q1516Game {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] tree = new ArrayList[N+1];
		// 진입차수
		int[] inDegree = new int[N+1];
		// 건물 짓는데 걸리는 시간
		int[] buildingTimeArr = new int[N+1];
		for(int i=0; i<=N; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
				int buildTime = Integer.parseInt(st.nextToken());
				buildingTimeArr[i] = buildTime;
				
				while(true) {
					int parent = Integer.parseInt(st.nextToken());
					if(parent == -1) {
						
						break;
					}
					
					tree[parent].add(i);
					inDegree[i]++;
				}
				
				
		}
		
		int[] realBuildTime = new int[N+1];
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			if(inDegree[i] == 0) {
				q.add(i);
				
				
			}
		}
		
		while(!q.isEmpty()) {
			realBuildTime[q.peek()] += buildingTimeArr[q.peek()];
			for(int i=0; i<tree[q.peek()].size(); i++) {
				
				inDegree[tree[q.peek()].get(i)]--;
				// 전체 시간은 어떻게 가져오지?
				if(realBuildTime[tree[q.peek()].get(i)]<realBuildTime[q.peek()]) realBuildTime[tree[q.peek()].get(i)]=realBuildTime[q.peek()];
				if(inDegree[tree[q.peek()].get(i)] == 0) {
					q.add(tree[q.peek()].get(i));
				}
				
				
			}
			
			q.poll();
			
		}
		for(int i=1; i<=N; i++) {
			System.out.println(realBuildTime[i]);
		}
		
		
	}
}
