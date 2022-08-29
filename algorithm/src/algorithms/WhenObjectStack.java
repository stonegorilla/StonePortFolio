package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class WhenObjectStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[2];
		String str = new String("aaa");
		Stack<ArrayList<Integer>> stack = new Stack<>();
		ArrayList arraylist = new ArrayList<>();
		stack.push(arraylist);
		
		System.out.println(stack.peek());
		arraylist.add(55);
		System.out.println(stack.peek());
		
	}

}
