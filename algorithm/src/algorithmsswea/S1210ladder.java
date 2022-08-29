package algorithmsswea;

import java.util.Scanner;

public class S1210ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 상하좌우
		int[] dc = {-1,1,0,0};
		int[] dr = {0,0,-1,1};
		
		for(int t=1; t<=10; t++) {
			// 불필요한 것 제거
			sc.nextInt();
			
			int arr[][] = new int[100][100];
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			// hc 와 hr 은 현재 위치 , go는 현재 방향 
			int hc = 99;
			int hr = 0;
			int go = 0;
			for(int i=0; i<100; i++) {
				if(arr[99][i] == 2) {
					hr = i;
					break;
				}
			}
			// 방향이 상이면 좌우를 살펴라
            // 방향이 좌우면 위를 살펴라
			while(hc !=0) {
				if(go == 0) {
					if(hr != 0 && arr[hc+dc[2]][hr+dr[2]] == 1) {
						go = 2;
						hc = hc+dc[2];
						hr = hr+dr[2];
					}else if(hr != 99 && arr[hc+dc[3]][hr+dr[3]] == 1) {
						go = 3;
						hc = hc+dc[3];
						hr = hr+dr[3];
					}else {
						hc = hc+dc[go];
						hr = hr+dr[go];
					}
				}else {
					if( arr[hc+dc[0]][hr+dr[0]] == 1) {
						go = 0;
						hc = hc+dc[0];
						hr = hr+dr[0];
					}else {
						hc = hc+dc[go];
						hr = hr+dr[go];
					}
				}
			}
			
			System.out.println("#"+t+" "+hr);
			
			
			
		}
	}

}
