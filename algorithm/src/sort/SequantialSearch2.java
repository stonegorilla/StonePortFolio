package sort;

public class SequantialSearch2 {
	static int[] arr = {3,9,15,22,30,73,126,244,500,1000};
	public static void main(String[] args) {
		System.out.println(searchWhileSort(44));
	}
	
	// 찾았다. 못찾았다. boolean
	// 어디서 찾았는지 중요하면 int
	static boolean searchForSort(int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return true;
			}
			if(arr[i]>key) {
				return false;
			}
		}
		
		return false;
	}
	
	static boolean searchWhileSort(int key) {
		
		int idx = 0;
		while(idx <arr.length) {
			
			if(arr[idx] == key) {
				return true;
			}
			if(arr[idx]>key){
				return false;
			}
			idx++;
			
			
			
			
		}
		
		return false;
	}
}
