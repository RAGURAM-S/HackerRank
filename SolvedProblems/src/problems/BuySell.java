package problems;

import java.util.Scanner;

public class BuySell{
	static int findMaxProfit(int price[], int start, int end) {
		if(end <= start) {
			return 0;
		}
		int max_profit = 0;
		for(int i = start; i < end; i++) {
			for(int j = i+1; j <= end; j++) {
				if(price[j] > price[i]) {
					int current_profit = price[j] - price[i] +
							findMaxProfit(price, start, i-1) +
							findMaxProfit(price, j+1, end);
					max_profit = Math.max(max_profit, current_profit);
				}
			}
		}
		return max_profit;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int start = 0;
		int end = array.length-1;
		int profit = findMaxProfit(array, start, end);
		System.out.println(profit);
		scanner.close();
	}
}