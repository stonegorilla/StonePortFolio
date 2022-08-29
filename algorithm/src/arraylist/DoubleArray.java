package arraylist;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int N = arr.length;
		
		int M = arr[0].length; // 모든 행의 원소수가 같으므로 
		
		// 1. 행우선순회
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d",arr[i][j]);
			}
			System.out.println();
		}
		// 2. 행 역우선순회
		for(int i=0; i<N; i++) {
			for(int j=arr[i].length-1; j>=0; j--) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		// 3. 열 우선순회
		for(int j=0; j<M; j++) {
			for(int i=0; i<N; i++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		// 4. 열 역우선순회
		for(int j=M-1; j>=0; j--) {
			for(int i=0; i<N; i++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		// 5. 지그재그
		for(int i=0; i<N; i++) {
			
			if(i%2 == 0) {
				for(int j=0; j<M; j++) {
					System.out.printf("%3d",arr[i][j]);
				}
			}else {
				for(int j=M-1; j>=0; j--) {
					System.out.printf("%3d",arr[i][j]);
				}
			}
			System.out.println();
		}
		
		// 5. 지그재그 (다른 방식)
				for(int i=0; i<N; i++) {
					
				
						for(int j=0; j<M; j++) {
							
							System.out.printf("%3d",arr[i][j+(M-1-2*j)*(i%2)]);
						}
					 
						
					
					System.out.println();
				}
		
	}

}
