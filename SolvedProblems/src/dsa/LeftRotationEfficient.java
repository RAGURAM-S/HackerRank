package dsa;

import java.util.Scanner;

public class LeftRotationEfficient {
	static int[] reverseArray(int array[], int d, int n) {
		int low = d;
		int high = n;
		while(low < high) {
			int temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low++;
			high--;
		}
		return array;
	}
	static void leftRotateArray(int array[], int d, int n) {
		reverseArray(array, 0, d-1);
		reverseArray(array, d, n-1);
		reverseArray(array, 0, n-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		int rotation = scanner.nextInt();
		leftRotateArray(array, rotation, size);
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
	}
}
