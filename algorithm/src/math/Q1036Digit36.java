package math;

import java.util.Arrays;
import java.util.Scanner;

public class Q1036Digit36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		// Z로 바뀌었을 때, 더해지는 값들의 자리수들의 계수 
		int[][] arr = new int[36][60];
		
		// 그냥 크게 잡아 
		int[] sum = new int[60];
		for(int i=0; i<N; i++) {
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) >=48 && str.charAt(j)<=57) {
					arr[str.charAt(j)-48][str.length()-1-j] += (83-str.charAt(j));
					sum[str.length()-1-j] += (str.charAt(j)-48);
				}else if(str.charAt(j)>=65 && str.charAt(j)<=90) {
					
					arr[str.charAt(j)-55][str.length()-1-j] += (90-str.charAt(j));
					sum[str.length()-1-j] += (str.charAt(j)-55);
					
				}else {};
			}
		}
		
		// arr 자리수 계수 정리
		for(int i=0; i<36; i++) {
//			arr[i][52] = i;
			for(int j=0; j<59; j++) {
				arr[i][j+1] += arr[i][j]/36;
				arr[i][j] = arr[i][j] %36;
			}
		}
		
		// Z로 바꾸었을 때 효과가 큰 순서대로 arr 정렬
		Arrays.sort(arr,(a,b) -> {
			int i = 59;
			while(a[i] == b[i] && i>0) {
				i--;
			}
			return Integer.compare(b[i], a[i]);
		});
		
		// K개 
		int K = sc.nextInt();
		// Z로 바꿨을 때 효과를 원본에 더하기 
		for(int i= 0; i<K; i++) {
			for(int j=0; j<60; j++) {
				sum[j] += arr[i][j];
			}
		}
		// sum 자리수 계수 정리
		for(int i=0; i<59; i++) {
			sum[i+1] += sum[i]/36;
			sum[i] = sum[i]%36;
		}
		
		// 문자만들기
		String str = "";
		for(int i=sum.length-1; i>=0; i--) {
			if(str.length() !=0 || (char)(sum[i]+48) != '0') {
				
				if(sum[i]<10) str += (char)(sum[i]+48);
				else str += (char)(sum[i]+55);
			}
		}
		if(str.equals("")) System.out.println(0);
		else System.out.println(str);
	}
}
