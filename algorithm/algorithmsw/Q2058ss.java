package algorithmsw;

import java.util.Arrays;
import java.util.Scanner;

public class Q2058ss {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String[] temp = Integer.toString(num).split("");
		System.out.println(Arrays.toString(temp));
		
		for(int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		
		System.out.println(Integer.toString(sum));
	}

}
