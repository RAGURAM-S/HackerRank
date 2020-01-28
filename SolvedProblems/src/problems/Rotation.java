package problems;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int d = scanner.nextInt();
		int newPos= 0;
		int array[] = new int[size];
		for(int i = 0; i < size; i++) {
			newPos = (i+ (size - d))%size;
			array[newPos] = scanner.nextInt();
		}
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}