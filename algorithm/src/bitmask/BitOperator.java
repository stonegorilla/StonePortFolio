package bitmask;

import java.util.Scanner;

public class BitOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
	
		int A = Integer.parseInt(a,2);
		int B = Integer.parseInt(b,2);
		System.out.println(Integer.toBinaryString(A&B));
		System.out.println(Integer.toBinaryString(A|B));
		System.out.println(Integer.toBinaryString(A^B));
		System.out.println(Integer.toBinaryString(~A));
		System.out.println(Integer.toBinaryString(~B));
		
	}

}
