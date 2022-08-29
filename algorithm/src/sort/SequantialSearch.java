package sort;

public class SequantialSearch {
	static int[] arr = {9,123,18,321,45,418,324,64};
	public static void main(String[] args) {
		System.out.println(searchWhileNoSort(44));
	}
	
	// 찾았다. 못찾았다. boolean
	// 어디서 찾았는지 중요하면 int
	static boolean searchForNoSort(int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return true;
			}
		}
		
		return false;
	}
	
	static boolean searchWhileNoSort(int key) {
		
		int idx = 0;
		while(idx <arr.length) {
			
			if(arr[idx++] == key) {
				return true;
			}
			
			
			
		}
		
		return false;
	}
}
