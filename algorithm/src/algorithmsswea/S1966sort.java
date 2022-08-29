package algorithmsswea;

import java.util.Scanner;

public class S1966sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int num = sc.nextInt();
			int arr[] = new int[num];
			for(int i=0; i<num; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length-1-i; j++) {
					if(arr[arr.length-2-j]>arr[arr.length-1-j]) {
						int temp = arr[arr.length-2-j];
						arr[arr.length-2-j] = arr[arr.length-1-j];
						arr[arr.length-1-j] = temp;
					}
				}
			}
			
			System.out.print("#"+t);
			for(int i=0; i<arr.length; i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
	}

}
