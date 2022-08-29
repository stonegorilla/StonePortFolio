package bfsdfs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Stack;


public class Q5639 {
	
	static ArrayList<Integer> preOrder;
	static Stack<Integer> stack ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = "";
		preOrder = new ArrayList<>();
		while(true) {
			line = br.readLine();
			
			if(line == null || line.equals("")) {
				break;
			}else {
				preOrder.add(Integer.parseInt(line));
			}
		}
		int n = preOrder.size();
		stack = new Stack<>();
		makePostOrder(0,n-1);
		
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	static void makePostOrder(int start, int end) {
		if(start>end) {
			// nothing to do
		}else if(start == end) {
			stack.add(preOrder.get(start));
		}else {
			int idx = end+1;
			for(int i= start+1; i<=end; i++) {
				if(preOrder.get(i)>preOrder.get(start)) {
					idx = i;
					break;
				}
			}
			stack.add(preOrder.get(start));
			makePostOrder(idx,end);
			makePostOrder(start+1,idx-1);
		}
	}

	
	

}
