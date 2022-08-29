package im_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
	static int maxNum;
	static int lined;
	static int[] maxNumArr;
	static ArrayList<int[]> coreList;
	static int[][] arr;
	static int N = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");
			N = sc.nextInt();
			maxNum = 0;
		
			arr = new int[N][N];
			coreList = new ArrayList<int[]>();
			
			coreList.add(new int[2]);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
					if(arr[i][j] == 1) {
						int[] point = new int[2];
						point[0] = i;
						point[1] = j;
						coreList.add(point);
					}
					
				}
			}
			maxNumArr = new int[coreList.size()+1];
			for(int i=0; i<=coreList.size(); i++) {
				maxNumArr[i] = 10000;
			}
			
			DFS(1);
			
			for(int i=coreList.size(); i>=0; i--) {
				if(maxNumArr[i] != 10000) {
					sb.append(maxNumArr[i]);
					System.out.println(sb);
					break;
				}
			}
			
			
		}

	}
	
	static void DFS(int n) {
		
		if(n == coreList.size()) {
			
			if(maxNumArr[maxNum] >lined) maxNumArr[maxNum] = lined;
			return ;
		}else {
			
			if(coreList.get(n)[0] == 0 || coreList.get(n)[0] == N-1 || coreList.get(n)[1] == 0 || coreList.get(n)[1] == N-1) {
				
				maxNum++;
				
				DFS(n+1);
				maxNum--;
			}else {
				// 상
				int a  = coreList.get(n)[0];
				int b = coreList.get(n)[1];
				boolean isPossible = true;
				
				while(true) {
					a--;
					if(a<0) break;
					if(arr[a][b] !=0) {
						isPossible = false;
						break;
					}else {
						arr[a][b] = 2;
						lined++;
					}
				}
				if(isPossible) {
					maxNum++;
					DFS(n+1);
					maxNum--;
				}
				
				while(true) {
					a++;
					if(a>= coreList.get(n)[0]) break;
					if(arr[a][b] == 2) {
						arr[a][b] = 0;
						lined--;
					}
				}
				if(!isPossible) {
					DFS(n+1);
				}
				// 하
				a  = coreList.get(n)[0];
				b = coreList.get(n)[1];
				isPossible = true;
				
				while(true) {
					a++;
					if(a>N-1) break;
					if(arr[a][b] !=0) {
						isPossible = false;
						break;
					}else {
						arr[a][b] = 2;
						lined++;
					}
				}
				if(isPossible) {
					maxNum++;
					DFS(n+1);
					maxNum--;
				}
				 while(true) {
					a--;
					if(a<= coreList.get(n)[0]) break;
					if(arr[a][b] == 2) {
						arr[a][b] = 0;
						lined--;
					}
				}
				 if(!isPossible) {
						DFS(n+1);
					}
				// 좌
				 a  = coreList.get(n)[0];
				 b = coreList.get(n)[1];
				 isPossible = true;
				
				while(true) {
					b--;
					if(b<0) break;
					if(arr[a][b] !=0) {
						isPossible = false;
						break;
					}else {
						arr[a][b] = 2;
						lined++;
					}
				}
				if(isPossible) {
					maxNum++;
					DFS(n+1);
					maxNum--;
				}
				while(true) {
					b++;
					if(b>= coreList.get(n)[1]) break;
					if(arr[a][b] == 2) {
						arr[a][b] = 0;
						lined--;
					}
				}
				if(!isPossible) {
					DFS(n+1);
				}
				// 우
				a  = coreList.get(n)[0];
				b = coreList.get(n)[1];
				isPossible = true;
				
				while(true) {
					b++;
					if(b>N-1) break;
					if(arr[a][b] !=0) {
						isPossible = false;
						break;
					}else {
						arr[a][b] = 2;
						lined++;
					}
				}
				if(isPossible) {
					maxNum++;
					DFS(n+1);
					maxNum--;
				}
				
				while(true) {
					b--;
					if(b<= coreList.get(n)[1]) break;
					if(arr[a][b] == 2) {
						arr[a][b] = 0;
						lined--;
					}
				}
				if(!isPossible) {
					DFS(n+1);
				}
			}
			
		}
		
	}
}
