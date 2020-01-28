package problems;

import java.util.Scanner;

public class MaxDiff {
	static int findMaxDifference(int array[]) {
		int current_max = Integer.MIN_VALUE;
		int current_diff = 0;
 		for(int i = array.length-1; i >= 0; i--) {
			for(int j = i-1; j >= 0; j--) {
				current_diff = array[i] - array[j];
				if(current_diff > current_max) {
					current_max = current_diff;
				}
			}
		}
 		return current_max;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int result = findMaxDifference(array);
		System.out.println(result);
		scanner.close();
	}
}
