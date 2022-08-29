package numberOfCase;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Q15664NandM10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int r = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<num; i++) {
			int val = sc.nextInt();
			if(!map.containsKey(val)) map.put(val, 1);
			else map.put(val, map.get(val)+1);
		}
		Iterator<Integer> keys = map.keySet().iterator();
		Iterator<Integer> values = map.values().iterator();
		
		
		int[] arr = new int[map.size()];
		
		int[] isCounted = new int[map.size()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = keys.next();
			isCounted[i] = values.next();
		}
		int[] result = new int[r];
		
		combination(arr,isCounted,result,0,r);
		
	}
	
	
	static void combination(int[] arr, int[] isCounted , int[] result,int start, int r) {
		if(r == 0) {
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}else {
			for(int i=start; i<arr.length; i++) {
				if(isCounted[i] !=0) {
					isCounted[i] -= 1;
					result[result.length-r] = arr[i];
					combination(arr,isCounted,result,i,r-1);
					isCounted[i] += 1;
					result[result.length-r] = 0;
				}
			}
		}
	}

}
