package doubleLinkedList;

public class DoublelyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublelyLinkedList list = new DoublelyLinkedList();
		
		list.addFirst("임혜진");
		list.addLast("앙");
		list.addLast("오잉");
		list.printList();
		list.add(1, "이윤주");
		list.printList();
		
		list.remove();
		list.printList();
		list.remove(1);
		list.printList();
		
	}

}
