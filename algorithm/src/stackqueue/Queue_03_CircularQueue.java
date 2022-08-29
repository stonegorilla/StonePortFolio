package stackqueue;

public class Queue_03_CircularQueue {
	static int n = 10;
	static int[] queue = new int[n];
	static int front = 0,rear = 0;
	
	public static void main(String[] args) {
		
		
		
	}
	
	// 공백검사
	static boolean isEmpty() {
		return front == rear;
	}
	// 풀검사
	static boolean isFull() {
		return front == (rear+1) % n;
	}
	
	// 원형큐의 사정에 맞게끔 선형큐를 개조해서 작성할 것
	// enQueue
	
	// deQueue
}
