package arraylist;

public class SinglelyLinkedList {

	private Node head; // 노드의 시작점
	private int size; // 있으면 굉장히 편리하기 때문에... 
	
	public SinglelyLinkedList() {
		// 아래 노드는 필요한 것인가? (X) 필요없다.
		this.head = null;
		this.size = 0;
	}
	//조회
	public Node get(int idx) {
		// 예외를 발생 시킬 수도 있고 기타 등등의 작업을 할수도 있을 것 같다. 
		if(idx < 0 || idx>=size) {
			return null;
		}
		Node curr = head;
		
		// 해당 위치까지 curr를 옮긴다. 
		for(int i = 0 ; i< idx ; i++) {
			curr = curr.link;
			
		}
		return curr;
	}
	
	// 첫번째 원소 삽입
	public void addFirst(String data) {
		// 노드를 생성한다. 
		Node node = new Node(data);
		node.link = head; // 새로 만든 노드의 링크를 head로 변환
		head = node;
		size++;
		
	}
	// 마지막 원소
	public void addLast(String data) {
		Node node = new Node(data);
		// size == 0 이라는 것은 첫번째 노드에 넣는것과 동일하니까. 
		if(size == 0) {
			addFirst(data);
			return ;
		}
		// 마지막 노드를 찾아가기
		Node curr = head;
		while(curr.link != null) {
			curr = curr.link;
			
		}
		curr.link = node;
		size++;
		
	}
	// 중간 원소 삽입
	public void add(int idx, String data) {
		
		if(idx<0 || idx>size) return;
		// 범위를 아주 관대하게 실행할 수도 있다. 
		if(idx == 0) {
			addFirst(data);
			return;
		}
		if(idx == size) {
			addLast(data);
			return;
		}
		
		Node pre = get(idx-1);
		Node node = new Node(data);
		// 순서가 굉장히 중요 
		node.link = pre.link;
		pre.link = node;
		size++;
	}
	
	// 첫번째 원소 삭제
	public String remove() {
		if(head == null) return null; // 혹은 예외발생
		
		String data = head.data;
		head = head.link; // 헤드 위치 조정
		size--;
		
		return data;
	}
	// 중간 원소 삭제 
	public String remove(int idx) {
		if(idx ==0) return remove();
		
		if(idx<0 || idx>=size) return null; // 예외처리 가능
		
		Node pre = get(idx-1);
//		Node rmNode = get(idx); 1번 1번해도 상관없지만 아래 코드가 더 빠름
		Node rmNode = pre.link; //2번 이게 더 빠름 
		String data = rmNode.data;
		// String data = pre.link.data; // 이렇게 써도 됨
		pre.link = rmNode.link;
		// pre.link = pre.link.link 로 해도 됨
		size--;
		
		return data;
	}
	
	public void printList() {
		Node curr = head;
		if(head == null) {
			System.out.println("지금은 공백리스트야");
			return;
		}
		while(curr != null) {
			System.out.print(curr.data+" ->");
			curr = curr.link;
		}
		System.out.println();
	}
}
