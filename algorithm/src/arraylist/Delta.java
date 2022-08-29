package arraylist;

public class Delta {
	static int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	static int N = arr.length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// 현재 나의 좌표
		int r = 2;
		int c = 1;
		
		
		// 상하좌우
		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		int[][] drc = {{-1,0},{1,0},{0,-1},{0,1}};
		// dr dc / dy dx / dx dy / di dj 잘 구분해서 다른 사람 코딩 확인할 것 
		for(int d=0; d<4; d++) {
			int nr = r +dr[d];
			int nc = c+dc[d];
			
			// 내 위치에 따라서 문제가 발생할 수 있다....
//			System.out.println(arr[nr][nc]);
			
			//경계를 확인 해야해....
			// 1. 내 몸안에 들어왔으면 해
//			if(nr >=0 && nr<N && nc>=0 && nc<N) {
//				System.out.println(arr[nr][nc]);
//			}
//			// 2. 내 품안에 들어오지 않았어? 안해~ 
//			if(nr <0 || nr>=N || nc<0 || nc>=N) continue;
//			System.out.println(arr[nr][nc]);
			
			// arr[nr][nc] 를 앞에 보내면 문제가 생길 수 있어 
			// 조건식을 쓰는 순서가 굉장히 중요하다. 
			if( nr>=0 && nr<N && nc>=0 && nc< N && arr[nr][nc] == 5 ) {
				System.out.println(arr[nr][nc]);
			}
		}
		}
	
	static boolean isOk(int r, int c) {
		return !(r <0 || r>=N || c<0 || c>=N);
			 
	}
	static boolean isOk3(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}
	}


