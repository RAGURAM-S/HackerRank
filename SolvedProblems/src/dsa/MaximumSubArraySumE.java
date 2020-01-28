package dsa;

import java.util.Scanner;

public class MaximumSubArraySumE {
	static int findMaxSum(int array[]) {
		int max_ending_sum = array[0];
		int max_sum = array[0];
		for(int i = 0; i < array.length; i++) {
			max_ending_sum = Math.max(max_ending_sum+array[i], array[i]);
			max_sum = Math.max(max_ending_sum, max_sum);
		}
		return max_sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int max_sum = findMaxSum(array);
		System.out.println(max_sum);
		scanner.close();
	}
}
