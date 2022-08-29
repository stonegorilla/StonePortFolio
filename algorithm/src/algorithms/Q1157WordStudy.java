package algorithms;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Q1157WordStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		String word = sc.next();
		for(int i=0; i<word.length(); i++) {
			int num;
			if(word.charAt(i)>=97) {
				num = word.charAt(i)-32;
			}else {
				num = word.charAt(i);
			}
			
			if(hashmap.containsKey(num)) {
				hashmap.put(num, hashmap.get(num)+1);
			}else {
				hashmap.put(num, 1);
			}
			
			
			
			
		}
		int max = 0;
		char answer='a' ;
		for(Map.Entry<Integer,Integer> entry : hashmap.entrySet()) {
			if(max==entry.getValue()) {
				answer = '?';
			}else if(max <entry.getValue()) {
				max = entry.getValue();
				answer = (char)(int)entry.getKey();
			}else {
				
			}
		}
		
		System.out.println(answer);
	}
}
