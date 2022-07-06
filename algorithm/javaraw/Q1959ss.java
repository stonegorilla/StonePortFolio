package algorithmsw;

import java.util.Scanner;

public class Q1959ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<testcase; i++) {
			String lines = sc.nextLine();
			String[] arr1;
			String[] arr2;
			int maxsum = -100;
			if( Integer.parseInt(lines.split(" ")[0]) <= Integer.parseInt(lines.split(" ")[1])){
				
				arr1 = sc.nextLine().split(" ");
				arr2 = sc.nextLine().split(" ");
			}else {
				arr2 = sc.nextLine().split(" ");
				arr1 = sc.nextLine().split(" ");
			}
			
			for(int j=0; j+arr1.length<=arr2.length; j++) {
				int sum = 0;
				for(int k=0; k<arr1.length; k++) {
					sum = sum + Integer.parseInt(arr1[k])*Integer.parseInt(arr2[j+k]);
				}
				if (maxsum< sum) maxsum = sum;
				
			}
			
			System.out.println("#"+(i+1)+" "+maxsum);
		}
	}

}
