package linkedstackqueue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStackQueue lsq = new LinkedStackQueue();
		
		lsq.print();
		System.out.println(lsq.isEmpty());
		lsq.add("앙기모");
		lsq.add("앙기지");
		lsq.add("모가지");
		lsq.offer("이스타");
		lsq.print();
		System.out.println(lsq.pop());
		System.out.println(lsq.poll());
		System.out.println(lsq.isEmpty());
	}

}
