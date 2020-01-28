package dsa;

import java.util.Scanner;

public class ArrayReversal {
	static void reverseArray(int array[]) {
		int low = 0;
		int high = array.length-1;
		while(low < high) {
			int temp = 0;
			temp = array[high];
			array[high] = array[low];
			array[low] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		reverseArray(array);
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
	}
}
