package stackqueue;

import java.util.Scanner;
import java.util.Stack;
 
public class Q10799IronBar {
     
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        
        
            String str = sc.next();
            boolean canCut = true;
            Stack<Character> stack = new Stack<>();
            int result = 0;
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                 
                if(ch == '(') {
                    stack.add(ch);
                    canCut = true;
                }else {
                    if(canCut) {
                        stack.pop();
                        result+=stack.size();
                    }else {
                        stack.pop();
                        result+=1;
                    }
                    canCut = false;
                }
            }
             
            System.out.println(result);
        
    }
}