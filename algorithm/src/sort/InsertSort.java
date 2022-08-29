package sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {55,10,30,2,16,8,31,22 };
		
		// 정렬 하겠다. 
		for(int i=1; i<data.length; i++) {
			int key = data[i]; // 이번에 정렬할 값
			int j; //정렬할 위치
			
			for(j = i-1; j>=0; j--) {
				if(data[j] <= key) {
					break;
				}else {
					data[j+1] = data[j];
//					data[j] = key;
				}
			}
			data[j+1] = key;
			
		} 
		
		System.out.println(Arrays.toString(data));
	}

}
