package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_05_silhangchiso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> ctrlZ = new Stack<>();
		Stack<String> ctrlY = new Stack<>();
		
		String work = "work1";
		
		while(true) {
			System.out.println("1. 새로운 작업");
			System.out.println("2. Ctrl+Z");
			System.out.println("3. Ctrl+Y");
			System.out.println("0. 종료 (아무숫자를 입력해도 종료되도록)");
			
			int cmd = sc.nextInt();
			if(cmd == 1) {
				// 1. 새로운 작업을 Z 스택에 저장한다.
				// 2. 새로운 작업을 입력 받는다. 
				// 3. Y 스택을 비운다.
				// 3-1. clear() 메서드를 활용하여 비운다. 
				// 3-2. 반복문을 이용하여 공백이 될때까지 pop() 한다. 
				// 3-3. 새로운 인스턴스를 생성한다. new 키워드로 
				// 4. 입력 받은 작업을 출력한다. (선택사항)
				String str = sc.next();
				ctrlZ.add(str);
				ctrlY.clear();
				System.out.println(ctrlZ.peek());
			}else if(cmd == 2) {
				// 실행 취소 (뒤로)
				// 1. Z 스택인 공백인지 확인한다. 공백이면 할게 없음.(안내멘트)
				// 2. (공백상태가 아닐시) 현재 작업을 Y스택에 저장한다. 
				// 3. Z 스택에서 작업을 거내 현재작업을 저장한다. 
				// 4. 현재 작업을 출력한다. (선택사항) 
				if(!ctrlZ.isEmpty()) ctrlY.add(ctrlZ.pop());
					
				if(!ctrlZ.isEmpty()) System.out.println(ctrlZ.peek());
				
			}else if(cmd == 3) {
				// 실행 취소의 취소(앞으로)
				// 1. Y스택이 공백인지 확인한다. 
				// 2. (공백 아닐시) 현재 작업을 Z스택에넣기
				// 3. Y 스택에서 작업을 꺼내 현재작업에 저장한다. 
				// 4. 현재 작업을 출력한다. (선택사항) 
				if(!ctrlY.isEmpty()) ctrlZ.add(ctrlY.pop());
				System.out.println(ctrlZ.peek());
				
			}else {
				// 0 또는 그외의 입력이 들어올때 종료.
				System.out.println("종료합니다.");
				break;
			}
		
		}
		
	}
	
	

}
