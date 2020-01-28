package dsa;

import java.util.Scanner;

public class Rotation {
	static void leftRotateByOneElement(int array[]) {
		int temp = array[0];
		for(int i = 1; i < array.length; i++) {
			array[i-1] = array[i]; 
		}
		array[array.length-1] = temp;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		leftRotateByOneElement(array);
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
	}
}
