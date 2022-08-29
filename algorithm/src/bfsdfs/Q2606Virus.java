package bfsdfs;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Q2606Virus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int node = sc.nextInt();
		int line = sc.nextInt();
		
		BFS2606 db2606 = new BFS2606(node+1);
		int arr[][] = new int[2*line][2];
		
		for(int i=0; i<line; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();

		}
		for(int i=line; i<2*line; i++) {
			arr[i][0] = arr[i-line][1];
			arr[i][1] = arr[i-line][0];
		}

		for(int i=0; i<2*line; i++) {
			db2606.add(arr[i][0], arr[i][1]);
			
		}
		
		
		System.out.println(db2606.BFS(1)-1);
		
		

	}

}

class BFS2606{
	
	private int V ;
	LinkedList<Integer>[] adj; 
	
	BFS2606 (int v){
		this.V = v;
		adj = new LinkedList[V];
		
		for(int i=0; i<adj.length; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	void add(int v, int w) {
		adj[v].add(w);
	}
	
	
	
	int BFS(int v) {
		boolean[] isVisited = new boolean[V];
		Queue<Integer> queue = new LinkedList<>();
		int result = 0;
		isVisited[v] = true;
		queue.add(v);
		result++;
		while(!queue.isEmpty()) {
			v = queue.poll();
			
			Iterator<Integer> it = adj[v].listIterator();
			while(it.hasNext()) {
				int n = it.next();
				if(!isVisited[n]) {					
					isVisited[n] = true;
					queue.add(n);
					result++;
				}
			}
		}
		return result;
	}
	
	
}


