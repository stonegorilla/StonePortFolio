package stackqueue;

public class Stack_04_FuctionCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인함수 실행");
		func1();
		System.out.println("메인함수 종료");
	}
	
	public static void func1() {
		System.out.println("함수 1 실행");
		func2();
		System.out.println("함수 1 종료");
	}
	
	public static void func2() {
		System.out.println("함수 2 실행");
		System.out.println("앙기모띠");
		System.out.println("함수 2 종료");
	}

}
