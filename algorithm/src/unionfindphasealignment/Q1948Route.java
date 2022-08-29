package unionfindphasealignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Q1948Route {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		ArrayList<Node>[] tree = new ArrayList[N+1];
		ArrayList<Node>[] reTree = new ArrayList[N+1];
		
		// 진입차수
		int[] inDegree = new int[N+1];
		 
		int[] inDegree2 = new int[N+1];
		// 가는데 걸리는 시간
		int[] travelTimeArr = new int[N+1];
		for(int i=0; i<=N; i++) {
			tree[i] = new ArrayList<Node>();
			reTree[i] = new ArrayList<Node>();
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
				int startNode = Integer.parseInt(st.nextToken());
				int endNode = Integer.parseInt(st.nextToken());
				int timeWeight = Integer.parseInt(st.nextToken());
				
				tree[startNode].add(new Node(endNode,timeWeight));
				inDegree[endNode]++;
				reTree[endNode].add(new Node(startNode,timeWeight));
//				inDegree2[startNode]++;
				
				
				
				
		}
		StringTokenizer stSE = new StringTokenizer(br.readLine()," ");
		int comStart = Integer.parseInt(stSE.nextToken());
		int comEnd = Integer.parseInt(stSE.nextToken());
		
		int[] realtravelTime = new int[N+1];
		Queue<Integer> q = new LinkedList<>();
//		for(int i=1; i<=N; i++) {
//			if(inDegree[i] == 0) {
//				q.add(i);
//				
//				
//			}
//		}
		q.add(comStart);
		
		while(!q.isEmpty()) {
			
			for(int i=0; i<tree[q.peek()].size(); i++) {
				
				inDegree[tree[q.peek()].get(i).N]--;
				// 전체 시간은 어떻게 가져오지?
				if(realtravelTime[q.peek()]+tree[q.peek()].get(i).W > realtravelTime[tree[q.peek()].get(i).N]) {
					realtravelTime[tree[q.peek()].get(i).N] = realtravelTime[q.peek()]+tree[q.peek()].get(i).W;
				}
				if(inDegree[tree[q.peek()].get(i).N] == 0) {
					q.add(tree[q.peek()].get(i).N);
				}
				
				
			}
			
			q.poll();
			
		}
//		for(int i=1; i<=N; i++) {
//			System.out.println(realtravelTime[i]);
//		}
		
		System.out.println(realtravelTime[comEnd]);
		// 그다음 , 그 루트가 뭔지 알아봐야지 
		q.add(comEnd);
		inDegree2[comEnd]++;
		int count = 0;
		while(!q.isEmpty()) {
			for(int i=0; i<reTree[q.peek()].size(); i++) {
				
				if(realtravelTime[q.peek()]-reTree[q.peek()].get(i).W == realtravelTime[reTree[q.peek()].get(i).N] ) {
					count++;
					if(inDegree2[reTree[q.peek()].get(i).N] == 0) {
						inDegree2[reTree[q.peek()].get(i).N]++;
						q.add(reTree[q.peek()].get(i).N);
						
					}
					
				}
			}
			q.poll();
		}
		System.out.println(count);
		
	}
	
}

class Node{
	int N;
	int W;
	
	Node(int node, int weight){
		N = node;
		W = weight;
	}
}
