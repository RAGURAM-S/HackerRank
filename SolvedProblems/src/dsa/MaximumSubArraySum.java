package dsa;

import java.util.Scanner;

public class MaximumSubArraySum {
	static int findMaxSum(int array[]) {
		int sum = array[0];
		for(int i = 0; i < array.length-1; i++) {
			int current_sum = array[i];
			for(int j = i+1; j < array.length; j++) {
				current_sum += array[j];
				sum = Math.max(sum, current_sum);
			}
		}
		return sum;
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
