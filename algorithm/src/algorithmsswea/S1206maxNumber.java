package algorithmsswea;

import java.util.Scanner;

public class S1206maxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++ ) {
			int max = 0;
			
			for(int i=0; i<10; i++) {
				int testnum = sc.nextInt();
				if(max<testnum) max = testnum;
			}
			System.out.println("#"+t+" "+max);
		}
	}

}
