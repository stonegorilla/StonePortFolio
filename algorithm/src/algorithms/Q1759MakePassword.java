package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Q1759MakePassword {
	static String vowel = "aeiou";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		String[] result = new String[r];
		
		combination(arr,result,0,r,0,0);
		
	}
	
	
	static void combination(String[] arr, String[] result, int start, int r,int v, int c) {
		if(r == 0 ) {
			
			if(v>=1 && c>=2) {
				for(int i=0; i<result.length; i++) {
					System.out.print(result[i]);
				}
				System.out.println();
			}
			
		}else {
			for(int i=start; i<arr.length; i++) {
				
				
					result[result.length-r] = arr[i];
					if(vowel.contains(arr[i])) combination(arr,result,i+1,r-1,v+1,c);
					else combination(arr,result,i+1,r-1,v,c+1);
					result[result.length-r] = null;
					
				}
			}
		}

}
