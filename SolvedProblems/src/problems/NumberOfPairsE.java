package problems;

import java.util.Scanner;

public class NumberOfPairsE {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x_size = scanner.nextInt();
		int y_size = scanner.nextInt();
		int array_x[] = new int[x_size];
		int array_y[] = new int[y_size];
		for(int i = 0; i < x_size; i++) {
			array_x[i] = scanner.nextInt();
		}
		for(int i = 0; i < y_size; i++) {
			array_y[i] = scanner.nextInt();
		}
		scanner.close();
	}
}
