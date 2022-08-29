package stackqueue;

import java.util.Scanner;

public class Q9012Bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			String brackets  = sc.next();
			int stack = 0;
			boolean isVPS = true; 
			for(int i=0; i<brackets.length(); i++) {
				if(brackets.charAt(i) == '(') {
					stack++;
				}else {
					stack--;
				}
				
				if(stack<0) {
					isVPS = false;
					break;
				}
				
				
			}
			
			if(stack != 0) isVPS = false;
			
			if(isVPS) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}

}
