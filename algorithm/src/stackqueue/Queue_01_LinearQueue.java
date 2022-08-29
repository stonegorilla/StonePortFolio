package stackqueue;

public class Queue_01_LinearQueue {
	public static int[] queue = new int[10];
	public static int front = -1, rear = -1;
	public static void main(String[] args) {
		
	}
	
	// 큐가 공백상태인지를 첵 하겠다. 
	public static boolean isEmpty() {
		return front == rear;
	}
	// 큐가 가득찬 상태인지를 첵 하겠다.
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	
	public static void enQueue(int item) {
		// 가득 차있는지 검사를하고
		// 삽입을 시도해본다. 
	}
	
	public static void deQueue() {
		//공백인지 검사를 하고,
		if(isEmpty()) {
			System.out.println("가득 차버렸어....");
		}
	}
}
