package im_test;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");
			int[][] arr = new int[N][3];
			
			// 배열 만들기
			for(int i=0; i<N; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
				arr[i][2] = sc.nextInt();
			}
			
			int disSumMin = 100000000;
			// 충전소 한개일때, 
			for(int i=-15; i<=15; i++) {
				
				loop:
				for(int j=-15; j<=15; j++) {
					// 각 집마다 거리의 합 (만약, 안되면 break) 
					int distance = 0;
					
					for(int a=0; a<N; a++) {
						int houseToCharge = Math.abs(arr[a][0]-i)+Math.abs(arr[a][1]-j);
						if(houseToCharge >0 && houseToCharge<=arr[a][2]) {
							distance+= houseToCharge;
						}else {
							continue loop;
						}
					}
					
					if(distance !=0 && distance<disSumMin) disSumMin = distance;
				}
			}
			if(disSumMin != 100000000) {
				sb.append(disSumMin);
				System.out.println(sb);
				continue;
			}
			// 만약, 길이 없을땐, 충전소 2개 
			for(int i= -15; i<=15; i++) {
				for(int j=-15; j<=15; j++) {
					for(int k=-15; k<=15; k++) {
						loop:
						for(int l=-15; l<=15; l++) {
							// 각 집마다의 거리의 합 
							int distance = 0;
							
							for(int a = 0; a<N; a++) {
								int houseToChargeIJ = Math.abs(arr[a][0]-i)+Math.abs(arr[a][1]-j);
								int houseToChargeKL = Math.abs(arr[a][0]-k)+Math.abs(arr[a][1]-l);
								int shorterRoute = Math.min(houseToChargeIJ, houseToChargeKL);
								if(houseToChargeIJ !=0 && houseToChargeKL !=0 && shorterRoute <= arr[a][2]) {
									distance += shorterRoute;
								}else {
									continue loop;
								}
							}
							if(distance !=0 && distance<disSumMin) disSumMin = distance;
						}
					}
				}
			}
			
			if(disSumMin != 100000000) {
				sb.append(disSumMin);
				System.out.println(sb);
				
			}else {
				sb.append(-1);
				System.out.println(sb);
			}
		}

	}
}
