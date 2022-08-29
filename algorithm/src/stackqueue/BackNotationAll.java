package stackqueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BackNotationAll {

	public static void main(String[] args) {
		
		//중위 표기식 계산
		// 후위 표기식으로 변경. (스택 : 연산자) : Stack<Character>
		// 1-1 . 토큰을 읽는다. (요소를 하나씩 읽는다. ) 
		// 1-2 . 피연산자라면 출력한다. 
		// 1-3 . 연산자라면 ... 
		// 1-3-1 . 스택이 공백상태라면 그냥 넣는다. 
		// 1-3-2 . 스택인 공백상태가 아니라면 top이 현재가 가리키고 있는 연산자와 읽은
		// 연산자를 비교하여 내가 찍어 누를 수 있을 때만 넣는다. 
		// 1-3-3 . 연산자의 우선순위는 안,밖 (, */ , +-  0,3 2,2 1,1
		// 1-4 닫는 소괄호 라면 여는 소괄호 만날때까지 pop 하여 출력, 
		// 1-5 토큰을 전부 읽을 때까지 반복
		// 1-6. 토큰을 다 읽었는데 스택이 공백이 아니라면 스택이 공백 상태가 될때까지 pop하여 출력.
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		List<Character> result = new ArrayList<>();
		List<Character> alpabet = new ArrayList<>();
		Map<Character, Integer> priorityinner = new HashMap(){{
			put('(', 0);
			put('+', 1);
			put('-', 1);
			put('*', 2);
			put('/', 2);
		    
		}};
		Map<Character, Integer> priorityouter = new HashMap(){{
			put('(', 3);
			put('+', 1);
			put('-', 1);
			put('*', 2);
			put('/', 2);
		    
		}};
		
		
		
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != '(' && ch !='+' && ch !='-' && ch !='*' && ch !='/' && ch !=')' ) {
				result.add(ch);
				if(!alpabet.contains(ch)) alpabet.add(ch);
			}else {
				while(true) {
					
					if(ch == ')') {
						while(true) {
							
							if(stack.peek() == '(') {
								stack.pop();
								break;
							}else {
								result.add(stack.pop());
							}
						}
						break;
					}else if(stack.isEmpty() || priorityinner.get(stack.peek()) < priorityouter.get(ch)) {
						stack.add(ch);
						break;
					}else {
						result.add(stack.pop());
					}
				}
				
			}
		}
		while(!stack.isEmpty()) result.add(stack.pop());
		System.out.println(result);
		
		//2 . 변경한 후위표기식을 계산 . (스택 : 피연산자) : Stack<Integer>
		// 2-1 토큰을 읽는다. (요소를 하나씩 읽는다. )
		// 2-2 피연산자라면 스택에 넣는다. 
		// 2-3 연산자라면 필요한 피연산자만큼 꺼내여 계산하고 다시 결과를 집어 넣는다.
		// 2-4 토큰을 전부 읽을 때까지 반복
		// 2-5 . 토큰을 다읽고 처리했다면 , 마지막으로 pop 하여 결과를 출력한다. 
		System.out.println(alpabet);
		Map<Character, Double> number = new HashMap<>();
		Stack<Double> numberStack = new Stack<>();
		for(int i=0; i<alpabet.size(); i++) {
			number.put(alpabet.get(i), sc.nextDouble());
		}
		
		for(int i=0; i<result.size(); i++) {
			
			if(result.get(i) !='+' && result.get(i)!='-' && result.get(i) !='*' && result.get(i) !='/') {
				numberStack.add(number.get(result.get(i)));
			}else  {
				double re = numberStack.pop()+numberStack.pop();
				numberStack.add(re);
				
			}
		}
		
		System.out.println(numberStack.pop());
		
		
	}

}
