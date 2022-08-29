package arraylist;

public class List_02_SinglelyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglelyLinkedList list = new SinglelyLinkedList();
		
		list.printList();
		list.addLast("이해건");
		
		list.printList();
		
		list.addFirst("김동현");
		list.printList();
		
		list.addLast("염선재");
		list.printList();
		
		list.add(1,  "김인중");
		list.printList();
		
		list.remove();
		list.printList();
		
		list.remove(1);
		list.printList();
		
		list.add(1, "공조한");
		list.printList();
	}

}
