package arraylist;


import java.util.Arrays;

public class Transpose {
	static int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	static int N = arr.length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원래의 모습");
		for(int[] a  : arr) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		
		// 전치 행렬
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i<j) {
					int tmp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = tmp;
				}
			}
		}
		// 전치된 모습 
		for(int[] a  : arr) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
	}

}
