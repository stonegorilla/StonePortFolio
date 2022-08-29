package bfsdfs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Q1260DFSBFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		int line = sc.nextInt();
		int V = sc.nextInt();
		DFSBFS1260 db1260 = new DFSBFS1260(node+1);
		int arr[][] = new int[2*line][2];
		
		for(int i=0; i<line; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

		}
		for(int i=line; i<2*line; i++) {
			arr[i][0] = arr[i-line][1];
			arr[i][1] = arr[i-line][0];
		}
		Arrays.sort(arr,(o1,o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		for(int i=0; i<2*line; i++) {
			db1260.add(arr[i][0], arr[i][1]);
			
		}
		
		db1260.DFS(V);
		System.out.println();
		db1260.BFS(V);
		
		

	}

}

class DFSBFS1260{
	
	private int V ;
	LinkedList<Integer>[] adj; 
	
	DFSBFS1260 (int v){
		this.V = v;
		adj = new LinkedList[V];
		
		for(int i=0; i<adj.length; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	void add(int v, int w) {
		adj[v].add(w);
	}
	
	void DFS(int v) {
		boolean[] isVisited = new boolean[V];
		DFSUtil(v,isVisited);
	}
	
	void DFSUtil(int v, boolean isVisited[]) {
		isVisited[v] = true;
		System.out.print(v+" ");
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext()) {
			int n = it.next();
			if(!isVisited[n]) {
				DFSUtil(n, isVisited);
			}
		}
		
	}
	
	void BFS(int v) {
		boolean[] isVisited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		
		isVisited[v] = true;
		queue.add(v);
		while(!queue.isEmpty()) {
			v = queue.poll();
			System.out.print(v+" ");
			Iterator<Integer> it = adj[v].listIterator();
			while(it.hasNext()) {
				int n = it.next();
				if(!isVisited[n]) {					
					isVisited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	
}


