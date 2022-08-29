package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11047greedymoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		int money = sc.nextInt();
		int allCoins = 0;
		int[] arr = new int[type];
		
		for(int i=0; i<type; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=type-1; i>=0; i--) {
			int coin= money/arr[i];
			money = money%arr[i];
			allCoins += coin;
		}
		
		System.out.println(allCoins);
	}

}
