package algorithmsw;


import java.util.Collections;
import java.util.Scanner;
import java.lang.String;
public class Q1946ss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcase = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<testcase; i++) {
			int Ci = Integer.parseInt(sc.nextLine());
			String result = "";
			
			for(int j=0; j<Ci; j++) {
				String alpabetandnumber = sc.nextLine();
//				result += alpabetandnumber.split(" ")[0].repeat(Integer.parseInt(alpabetandnumber.split(" ")[1]));
				result +=  String.join("", Collections.nCopies(Integer.parseInt(alpabetandnumber.split(" ")[1]), alpabetandnumber.split(" ")[0])) ;
				
			}
			System.out.println("#"+(i+1));
			for(int j=0; j<result.length(); j = j+10) {
				if(j+10<=result.length()) System.out.println(result.substring(j,j+10));
				else System.out.println(result.substring(j,result.length()));
				
			}
			
		}
	    
	}

}
