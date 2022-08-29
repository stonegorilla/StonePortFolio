package arraylist;

public class List_01_SequentialList {
	public static void main(String[] args) {
		SequentialList list = new SequentialList();
		
		list.printList();
		list.addFirst("앙기모");
		list.addFirst("앙기기");
		list.printList();
		list.remove();
		list.printList();
	}
}
