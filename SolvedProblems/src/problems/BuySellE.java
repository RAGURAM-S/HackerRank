package problems;

import java.util.Scanner;

public class BuySellE {
	static int findMaximumProfit(int array[]) {
		int profit = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i] > array[i-1]) {
				profit = profit + (array[i]-array[i-1]);
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int max_profit = findMaximumProfit(array);
		System.out.println(max_profit);
		scanner.close();
	}
}
