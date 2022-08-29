package stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_02_API {
	
	public static void main(String[] args) {
		// LinkedList는 정말 많은 기능을 가지고 있지만, 
		// queue 타입으로 선언한 경우, queue 에 맞는 제한 된 것만 사용가능 
		Queue<Integer> queue = new LinkedList<>();
		
		// 추가
		queue.add(10);
		queue.offer(10);
		
		//삭제
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
		//조회
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		// 예외를 발생시키냐 안시키냐 
		// add , remove, element : 예외발생시킴
		// offer, poll , peek : 값을 반환 
	}
}
