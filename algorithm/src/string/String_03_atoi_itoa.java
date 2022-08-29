package string;

public class String_03_atoi_itoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("1234"));
		System.out.println(itoa(-44));
	}
	
	static int atoi(String text) {
		int value = 0;
		// 앞에서 
		for(int i=0; i<text.length(); i++) {
			char num = text.charAt(i);
			int digit;
			// 48 이렇게 해도 ㄱㅊ
			if(num >= '0' && num<= '9') {
				// 또는 -48 해도 괜찮
				digit = num - '0';
			}else {
				break;
			}
			
			value = (value*10) + digit;
		}
		
		return value;
	}
	
	static String itoa(int value) {
		StringBuilder sb = new StringBuilder();
		
		// 음수는 어떻게 해야 하나 
		// 조건문 이용해 boolean 같은 변수에 저장을 해놓고 고려해야함
		if(value <0) {
			sb.append('-').append(-value);
		}else {
			sb.append(value);
		}
		// 정수값을 어떻게 처리를 해서 sb 추가하여 결과를 뽑아내보자...
		
		return sb.toString();
	}

}
