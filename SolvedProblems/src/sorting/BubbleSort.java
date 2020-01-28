package sorting;

import java.util.Scanner;

public class BubbleSort {
	static void sort(int array[]) {
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		sort(array);
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
	}
}
