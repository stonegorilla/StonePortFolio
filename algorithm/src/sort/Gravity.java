package sort;

public class Gravity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ?? 아니 이거 넘 쉽지 않나...
		int[] arr = {7,4,2,0,0,6,0,7,0};
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			int linemax = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<= arr[j]) {
					linemax = j-i;
					break;
				}
				if(j == arr.length-1) {
					linemax = arr.length-i;
				}
				
			}
			if(max<linemax) max = linemax;
		}
	}

}
