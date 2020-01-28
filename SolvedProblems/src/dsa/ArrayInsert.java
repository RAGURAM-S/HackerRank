package dsa;

import java.util.Scanner;

public class ArrayInsert {
	void insertAtPosition(int array[], int sizeOfArray, int index, int element) {
		if(index == sizeOfArray) {
			return;
		}
		for(int i = sizeOfArray-2; i >= index; i++) {
			array[i+1] = array[i];
		}
		array[index] = element;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayInsert object = new ArrayInsert();
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size-1; i++) {
			array[i] = scanner.nextInt();
		}
		int position = scanner.nextInt();
		int element = scanner.nextInt();
		object.insertAtPosition(array, array.length, position, element);
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
	}
}
