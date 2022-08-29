package algorithms;

import java.util.Scanner;


public class Q11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String numberline = sc.nextLine();
		
		int sum = 0;
		for(int i=0; i<numberline.length(); i++) {
			sum += (numberline.charAt(i)-48);
		}
		
		
		
		System.out.println(sum);
	}

}
