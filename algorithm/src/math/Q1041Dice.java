package math;

import java.util.Scanner;

public class Q1041Dice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		
		int[] dice = new int[6];
		int sum = 0;
		int max = 0;
		for(int i=0; i<6; i++) {
			dice[i] = sc.nextInt();
			sum += dice[i];
			if(max<dice[i]) max = dice[i];
		}
		int[] min = new int[3];
		
		
		int a = Math.min(dice[0], dice[5]);
		int b = Math.min(dice[1], dice[4]);
		int c = Math.min(dice[2], dice[3]);
		
		min[0] = Math.min(a, Math.min(b, c));
		min[1] = Math.min(a+b, Math.min(b+c, c+a));
		min[2] = a+b+c;
		
		long answer;
		if(N==1) {
			answer = sum-max;
		}else {
			answer = 4*min[2]+((N-2)*4+(N-1)*4)*min[1]+((N-2)*(N-1)*4+(N-2)*(N-2))*min[0];
		}
		
		
		
			
		System.out.println(answer);
		

	}

}
