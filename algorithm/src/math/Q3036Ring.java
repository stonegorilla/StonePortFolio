package math;

import java.util.Scanner;

public class Q3036Ring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1 ; i<arr.length; i++) {
			int a = arr[0];
			int b = arr[i];
			int gcd = 0;
			while(true) {
				int temp = a;
				a = b;
				b = temp%b;
				
				if(b == 0) {
					gcd = a;
					break;
				}
			}
			System.out.println(arr[0]/gcd+"/"+arr[i]/gcd);
		}
	}

}
