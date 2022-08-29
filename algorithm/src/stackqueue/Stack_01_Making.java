package stackqueue;

import java.util.Stack;

public class Stack_01_Making {
	static int[] stack = new int[10];
	static int top = -1; // 마지막 원소를 가리키는 변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
	}
	// 공백상태인지 확인
	static boolean isEmpty() {
		return top == -1;
	}
	// 배열 형태로 만들어 놓았으니까.
	static boolean isFull() {
		return (top == stack.length-1) ;
		
	}
	
	static void stackPush(int value) {
		// 푸쉬를 구현해본다. 
		// 가득 찼니? 물어보고 값을 넣는다. 
	}
	
	static int stackPop() {
		// 팝을 구현한다. 
		
		return 0;
	}
}
