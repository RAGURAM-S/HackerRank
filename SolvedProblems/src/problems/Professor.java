package problems;

import java.util.Scanner;

public class Professor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int threshold = scanner.nextInt();
		int array[] = new int[size];
		int early_count = 0;
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		for(int i = 0; i < size; i++) {
			if(array[i] <= 0) {
				early_count++;
			}
		}
		if(early_count >= threshold) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
