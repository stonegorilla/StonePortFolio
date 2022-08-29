package algorithmsswea;

import java.util.Scanner;

public class S1979WheretoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			// 단어 퍼즐 가로,세로 길이
			int N = sc.nextInt();
			// 단어길이
			int target = sc.nextInt();
			// 정답
			int answer = 0;
			int arr[][] = new int[N][N];
			
			// 퍼즐 매핑
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// count 가 단어길이가 딱 되면 answer 는 한개 증가
			// 가로줄 확인
			for(int i=0; i<N; i++) {
				int count = 0;
				for(int j=0 ; j<N; j++) {
					if(arr[i][j] == 1) count++;
					else {
						if(count == target) answer++;
						count = 0;
					}
					
				}
				if(count == target) answer++;
			}
			// 세로줄 확인
			for(int i=0; i<N; i++) {
				int count = 0;
				for(int j=0 ; j<N; j++) {
					if(arr[j][i] == 1) count++;
					else {
						if(count == target) answer++;
						count = 0;
					}
				}
				if(count == target) answer++;
			}
			
			System.out.println("#"+t+" "+answer);
		}
	}

}
