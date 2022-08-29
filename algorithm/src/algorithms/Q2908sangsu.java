package algorithms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2908sangsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int aResult = 100* (a.charAt(2)-48)+10*(a.charAt(1)-48)+a.charAt(0)-48;
		int bResult = 100* (b.charAt(2)-48)+10*(b.charAt(1)-48)+b.charAt(0)-48;
		
		if(aResult>bResult) {
			System.out.println(aResult);
		}else {
			System.out.println(bResult);
		}
		
	}

}
