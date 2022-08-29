package stackqueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Q1935BackNotation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> alpabet = new ArrayList<>();
		List<Character> result = new ArrayList<>();
		int N = sc.nextInt();
		String str = sc.next();
		// TODO Auto-generated method stub
		
		Map<Character, Double> number = new HashMap<>();
		Stack<Double> numberStack = new Stack<>();
		
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			result.add(ch);
			if(ch !='+' && ch !='-' && ch !='*' && ch !='/') {
				if(!alpabet.contains(ch)) alpabet.add(ch);
			}
		}
		
		
		
		for(int i=0; i<alpabet.size(); i++) {
			number.put(alpabet.get(i), sc.nextDouble());
		}
		
		for(int i=0; i<result.size(); i++) {
			double a=0.00,b=0.00;
			if(result.get(i) !='+' && result.get(i)!='-' && result.get(i) !='*' && result.get(i) !='/') {
				numberStack.add(number.get(result.get(i)));
			}else if(result.get(i) == '+')  {
				 a = numberStack.pop();
				 b = numberStack.pop();
				double re = Math.round((b+a) * 100) / 100.0;
				
				numberStack.add(re);
				
			}else if(result.get(i) == '-')  {
				a = numberStack.pop();
				 b = numberStack.pop();
				double re =Math.round((b-a) * 100) / 100.0;
				numberStack.add(re);
				
			}else if(result.get(i) == '*')  {
				a = numberStack.pop();
				 b = numberStack.pop();
				double re = Math.round((b*a) * 100) / 100.0;
				numberStack.add(re);
				
			}else {
				a = numberStack.pop();
				 b = numberStack.pop();
				double re = Math.round((b/a) * 100) / 100.0;
				numberStack.add(re);
				
			}
			
		}
		
		System.out.printf("%.2f",numberStack.pop());
	}

}
