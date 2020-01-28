package sorting;

import java.util.Scanner;

public class InsertionSort {
	static void sort(int array[]) {
		for(int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	static void printArray(int array[]) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
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
		printArray(array);
		scanner.close();
	}
}
