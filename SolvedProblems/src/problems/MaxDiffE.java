package problems;

import java.util.Scanner;

public class MaxDiffE {
	static int findMaxDifference(int array[]) {
		int maxDifference = array[1] - array[0];
		int minValue = array[0];
		for(int j = 1; j < array.length; j++) {
			maxDifference = Math.max(maxDifference, array[j]-minValue);
			minValue = Math.min(minValue, array[j]);
		}
		return maxDifference;
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
