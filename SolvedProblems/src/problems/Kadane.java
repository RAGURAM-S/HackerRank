package problems;

import java.util.Scanner;

public class Kadane {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int current_max = 0;
		for(int i = 0; i < size; i++) {
			current_max = current_max + array[i];
			if(current_max > max) {
				max = current_max;
			}
			if(current_max < 0) {
				current_max = 0;
			}
		}
		System.out.println(max);
		scanner.close();
	}
}