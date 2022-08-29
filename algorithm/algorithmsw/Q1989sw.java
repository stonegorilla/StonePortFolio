package algorithmsw;

import java.util.Arrays;
import java.util.Scanner;

public class Q1989sw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] arr = new String[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<num; i++) {
			boolean ispali = true;
			for(int j=0; j<arr[i].length()/2; j++) {
				if(arr[i].charAt(j) != arr[i].charAt(arr[i].length()-1-j)) {
					System.out.println("#"+(i+1)+" 0");
					ispali = false;
					break;
				}
			}
			if(ispali == true) System.out.println("#"+(i+1)+" 1");
		}
	}

}
