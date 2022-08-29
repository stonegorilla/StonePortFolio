package arraylist;

import java.util.Arrays;

public class SequentialList {
	// 문자열을 관리를 하겠다. 
	private String[] arr;
	private int size;
	
	
	public SequentialList() {
		super();
		this.arr = new String[10];
		this.size = 0;
	}
	
	// 조회 가능
	public String get(int idx) {
		// 사용자를 신뢰할 수 없기 때문에 조건을 걸어서 제한하겠다. 
		if(idx <0 || idx>=size) {
			return null; // 예외를 발생시킬 수도 있겠네유?
		}
		// 해당 idx번째의 값을 가져와 
		return arr[idx];
	}
	
	// 첫번째 삽입
	public void addFirst(String data) {
		// 넣을 수 있는지? 
		if(size == arr.length) {
			return; // 예외 처리를 할 수 있겠다.
		}
		
		// 뒤에서 부터 하나씩 밀고 나서 데이터를 넣어야 한다. 
		for(int i = size-1; i>=0; i--) {
			arr[i+1] = arr[i]; 
		}
		
		arr[0] = data;
		size++;
	}
	// 마지막 삽입
	public void addLast(String data) {
		
	}
	// 중간에 삽입
	public void add(int idx, String data) {
		
	}
	
	// 첫번째 원소 삭제
	public String remove() {
		//예외를 발생시켜서 처리 가능
		
		if(size == 0) return null;
		
		String data = arr[0];
		for(int i=1; i<size; i++) {
			arr[i-1] = arr[i];
		}
		// 제일 마지막 값을 null로 채워도 좋고 안채워도 좋음 
		size--;
		return data;
	}
	// 중간 원소 삭제
	
	
	public void printList() {
		System.out.println(Arrays.toString(Arrays.copyOf(arr, size)));
	}
	
}
