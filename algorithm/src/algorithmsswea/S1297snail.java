package algorithmsswea;

import java.util.Scanner;

public class S1297snail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		// 우하좌상
		int[] dc = {0,1,0,-1};
		int[] dr = {1,0,-1,0};
		
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			// 현재 위치,방향
			int hc = 0, hr =0 , go = 0;
			// 들어갈 숫자
			int number = 1;
			arr[0][0] = 1;
			while(number < N*N) {
				
				
				if(hc+dc[go] <0 || hc+dc[go] > N-1 || hr+dr[go] <0 || hr+dr[go]>N-1 || arr[hc+dc[go]][hr+dr[go]] != 0) {
					go = (go+1) %4;
						
				}
					hc = hc+dc[go];
					hr = hr+dr[go];
				
				number++;
				arr[hc][hr] = number;
			}
			System.out.println("#"+t);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
