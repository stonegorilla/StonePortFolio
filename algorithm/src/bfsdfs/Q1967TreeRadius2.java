package bfsdfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.StringTokenizer;
public class Q1967TreeRadius2 {
	static int sum = 0;
	static int max = 0;
	static int idx = 0;
	static ArrayList[] arr;
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		 arr = new ArrayList[N+1];
		
		for(int i=0; i<=N; i++) {
			arr[i] = new ArrayList<ArrayList>();
		}
		
		for(int i=1; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int dis = Integer.parseInt(st.nextToken());
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			list1.add(end);
			list1.add(dis);
			arr[start].add(list1);
			list2.add(start);
			list2.add(dis);
			arr[end].add(list2);
			
			
			
		}
		
		
		// 이제 최대값 찾기 
		boolean[] isVisited = new boolean[N+1];
		isVisited[1] = true;
		dfs(1,isVisited);
		
		isVisited = new boolean[N+1];
		max = 0;
		isVisited[idx] = true;
		dfs(idx , isVisited);
		System.out.println(max);
	}
	
	static void dfs(int node,boolean[] isVisited) {
		for(int i=0; i<arr[node].size(); i++) {
			int newNode = (int) ((ArrayList) arr[node].get(i)).get(0);
			int newDis = (int) ((ArrayList) arr[node].get(i)).get(1);
			if(!isVisited[newNode]) {
				isVisited[newNode] = true;
				sum += newDis;
				if(max<sum) {
					max = sum;
					idx = newNode;
				}
				dfs(newNode, isVisited);
				sum-= newDis;
				isVisited[newNode] = false;
				
			}
		}
	}
}
