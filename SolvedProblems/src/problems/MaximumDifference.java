package problems;

import java.util.Scanner;

public class MaximumDifference {
	static int findMaximumDifference(int array[]) {
		int current_minimum = Integer.MAX_VALUE;
		int current_maximum = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > current_maximum) {
				current_maximum = array[i];
			}
			if(array[i] < current_minimum) {
				current_minimum = array[i];
			}
		}
		return current_maximum-current_minimum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for( int i = 0; i < size; i++ ) {
			array[i] = scanner.nextInt();
		}
		int result = findMaximumDifference(array);
		System.out.println(result);
		scanner.close();
	}
}
