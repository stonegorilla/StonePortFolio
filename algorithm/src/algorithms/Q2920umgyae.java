package algorithms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2920umgyae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		int prev = Integer.parseInt(st.nextToken());
		boolean ascending = false;
		boolean descending = false;
		while(st.hasMoreTokens()) {
			int cur = Integer.parseInt(st.nextToken());
			
			if(prev<cur) {
				ascending = true;
			}else {
				descending = true;
			}
			
			prev = cur;
		}
		
		if(ascending && descending) System.out.println("mixed");
		else if(ascending) System.out.println("ascending");
		else System.out.println("descending");
	}

}
