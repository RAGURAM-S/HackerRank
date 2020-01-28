package dsa;

import java.util.Scanner;

public class MaxNSecondMax {
	static void findLargestAndSecondLargest(int array[], int size) {
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for(int i = 0; i < size; i++) {
			if(array[i] > max) {
				second_max = max;
				max = array[i];
			}
			else if(array[i] > second_max && array[i] != max) {
				second_max = array[i];
			}
		}
		if(second_max == Integer.MIN_VALUE) {
			second_max = -1;
		}
		System.out.println(max + " " + second_max);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		findLargestAndSecondLargest(array, size);
		scanner.close();
	}
}
