package algorithms;


public class FactorialAndFibonacci {
	
	static int[] memo = new int[50];
	static {
		memo[1]=1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(fibo(1));
		System.out.println(fibo2(10));
		
	}
	
	public static long fact(int n) {
		// base case
		
		
		long sum = 1;
		for(int i=1; i<=n; i++) {
			sum *= i;
		}
		
		return sum;
		
		
	}
	// a0 = 0, a1 = 1
	public static long fibo(int n) {
		long prev = 0,cur = 1;
		
		for(int i=1; i<n; i++ ) {
			long temp = cur;
			cur = cur+prev;
			prev = temp;
		}
		if(n == 0) return 0;
		else return cur;
	}
	// 메모이제이션이라는 방법
	// 기록을 해놓고 중복된 연산을 다시는 하지 않음 . 추후 깊은 공부를 하실때 다시 한번  돌아볼것
	public static int fibo2(int n) {
		if(n>=2 && memo[n] == 0) {
			memo[n] = fibo2(n-1)+fibo2(n-2);
		}
		return memo[n];
	}

}
