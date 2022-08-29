package linkedstackqueue;

public class Node {
	
	private String data;
	private Node prev;
	private Node next;
	
	public Node() {
		
	}
	
	public Node(String data) {
		super();
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", prev=" + prev + ", next=" + next + "]";
	}
	
	
	
	
}
