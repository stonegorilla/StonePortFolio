package arraylist;

// 데이터와 다음링크를 가지고 있는 단위
public class Node {
	// 데이터 필드 (추후 제네릭으로 대체하면 공용하기로 사용이 가능하다. )
	public String data;
	// 링크를 저장하겠다. 
	public Node link;
	
	// 내가 생성자를 새롭게 정의하는 순간 기본생성자는 안만들어지니까...
	public Node() {
		
	}
	
	public Node(String data) {
		super();
		this.data = data;
		// 이거 궂이 사용안해도 알아서 null로 초기화
		this.link = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
