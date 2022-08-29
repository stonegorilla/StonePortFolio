package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Q1017PrimePair2 {
	
	static int[] arrOdd;
	static int[] arrEven;
	static int[] primeArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, 1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499, 1511, 1523, 1531, 1543, 1549, 1553, 1559, 1567, 1571, 1579, 1583, 1597, 1601, 1607, 1609, 1613, 1619, 1621, 1627, 1637, 1657, 1663, 1667, 1669, 1693, 1697, 1699, 1709, 1721, 1723, 1733, 1741, 1747, 1753, 1759, 1777, 1783, 1787, 1789, 1801, 1811, 1823, 1831, 1847, 1861, 1867, 1871, 1873, 1877, 1879, 1889, 1901, 1907, 1913, 1931, 1933, 1949, 1951, 1973, 1979, 1987, 1993, 1997, 1999};
	static Stack<ArrayList<Integer>> stack = new Stack<>();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
//		for(int i=900; i<1000; i++) {
//			System.out.print(i+" ");
//		}
//		ArrayList<Integer> primeList = new ArrayList<>();
//		primeList.add(2);
//		for(int i =3; i<2000; i++) {
//			boolean isPrime = true;
//			for(int j=0; primeList.get(j) <= Math.sqrt(i); j++) {
//				if(i%primeList.get(j) == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) primeList.add(i);
//		}
//		
//		primeArr = new int[primeList.size()];
//		
//		for(int i=0; i<primeArr.length; i++) {
//			primeArr[i] = primeList.get(i);
//		}
//		System.out.println(Arrays.toString(primeArr));
		arrOdd = new int[N/2];
		arrEven = new int[N/2];
		
		int idxOdd = 0,idxEven = 0;
		boolean isOddKey = true;
		boolean oddEvenSame = true;
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			if(num%2 != 0) {
				if(idxOdd >=N/2) {
					oddEvenSame = false;
					break;
				}
				arrOdd[idxOdd] = num;
				idxOdd++;
				if(i == 0) isOddKey = true;
			}else {
				if(idxEven >= N/2) {
					oddEvenSame = false;
					break;
				}
				arrEven[idxEven] = num;
				idxEven++;
				if(i == 0) isOddKey = false;
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(arrOdd));
		System.out.println(Arrays.toString(arrEven));
		
		// 출력할 것들
		ArrayList<Integer> resultList = new ArrayList<>();
		if(oddEvenSame) {
			for(int i=0; i<N/2; i++) {
				if(isOddKey) {
					
					if(binarySearch(arrOdd[0]+arrEven[i])) {
						int temp = arrOdd[0];
						int temp2 = arrEven[i];
						arrOdd[0] = 0;
						arrEven[i] = 0;
						
					
						
						if(permutation(isOddKey ,(N/2)-1,1)) resultList.add(temp2);
						arrOdd[0] = temp;
						arrEven[i] = temp2;
					}
					
				}else {
					if(binarySearch(arrEven[0]+arrOdd[i])) {
						int temp = arrEven[0];
						int temp2 = arrOdd[i];
						arrEven[0] = 0;
						arrOdd[i] = 0;
						
						ArrayList<Integer> list = new ArrayList<>();
						list.add(temp);
						list.add(temp2);
						stack.add(list);
						
						System.out.println(i);
						System.out.println(Arrays.toString(arrOdd));
						System.out.println(Arrays.toString(arrEven));
						if(permutation(isOddKey ,(N/2)-1,1)) resultList.add(temp2);
						arrEven[0] = temp;
						arrOdd[i] = temp2;
						stack.pop();
					}
				}
					
				
			}
		}
		
		Collections.sort(resultList);
		for(int i = 0; i<resultList.size(); i++) {
			sb.append(resultList.get(i)).append(" ");
		}
		
		if(resultList.size()== 0) System.out.println(-1);
		else System.out.println(sb);
		
	}
	
	static boolean permutation(boolean isOddKey, int r, int idx) {
		boolean isPossible = false;
		System.out.println(stack);
		if(r == 0) {
			
			return true;
			
		}else {
			if(isOddKey) {
				for(int i=0; i<arrEven.length; i++) {
					
					
					if(arrEven[i] !=0 && binarySearch(arrOdd[idx]+arrEven[i])) {
						int temp = arrOdd[idx];
						int temp2 = arrEven[i];
						arrOdd[idx] = 0;
						arrEven[i] = 0;
						
						if(permutation(isOddKey, r-1, idx+1)) {
							isPossible = true;
							arrOdd[idx] = temp;
							arrEven[i] = temp2;
							return true;
						}
						arrOdd[idx] = temp;
						arrEven[i] = temp2;
					}
			}
			
				
			}else {
				for(int i=0; i<arrOdd.length; i++) {
					
					if(arrOdd[i] !=0 && binarySearch(arrEven[idx]+arrOdd[i])) {
						
						int temp = arrEven[idx];
						int temp2 = arrOdd[i];
						arrEven[idx] = 0;
						arrOdd[i] = 0;
						
						ArrayList<Integer> list = new ArrayList<>();
						list.add(temp);
						list.add(temp2);
						stack.add(list);
						
						if(permutation(isOddKey, r-1,idx+1)) {
							isPossible = true;
							arrEven[idx] = temp;
							arrOdd[i] = temp2;
							return true;
						}
						arrEven[idx] = temp;
						arrOdd[i] = temp2;
						stack.pop();
					}
			}
			}
		}
		
		return isPossible;
	}
	
	static boolean binarySearch(int key) {
	
		
		int start = 0;
		int end = primeArr.length-1;
		
		boolean hasPrime = false;
		while(start<=end) {
			int mid = (start+end)/2;
			if(primeArr[mid] ==key) {
				hasPrime = true;
				
				break;
			}
			else if(primeArr[mid]>key) end = mid-1;
			else start = mid+1;
			
			
			
			
		}
		
		return hasPrime;
	}

}
