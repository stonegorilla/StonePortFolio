package linkedstackqueue;

public class LinkedStackQueue {

	Node head = null;
	Node tail = null;
	int size;
	
	public LinkedStackQueue() {
		
	}
	
	
	public void offer(String data) {
		
		Node node = new Node(data);
		node.setNext(head);
		if(head != null) {
			
			head.setPrev(node);
		}
		head = node;
		size++;
		
		if(head.getNext() == null) tail = head;
		
		
		
	}
	
	public void add(String data) {
		Node node = new Node(data);
		node.setPrev(tail);
		if(tail != null) {
			tail.setNext(node);
		}
		tail = node;
		size++;
		if(tail.getPrev() == null) head = tail;
		
	}
	
	public String pop() {
		if(tail == null) return null;
		String data = tail.getData();
		Node pre = tail.getPrev();
		pre.setNext(null);
		tail = pre;
		
		return data;
		
	}
	
	public String poll() {
		if(head == null) return null;
		String data = head.getData();
		Node next = head.getNext();
		next.setPrev(null);
		head = next;
		
		return data;
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		return false;
	}
	public void print() {
		Node curr = head;
		if(curr == null) System.out.println("꽁백리스트얌~");
		while(curr != null) {
			System.out.print(curr.getData() + "->");
			curr = curr.getNext();
		}
		System.out.println();
	}
	
	
	
}
