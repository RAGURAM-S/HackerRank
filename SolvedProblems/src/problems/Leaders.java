package problems;

import java.util.Scanner;

public class Leaders{
	static void printLeaders(int array[]) {
		for(int i = 0; i < array.length; i++) {
			boolean flag = false;
			for(int j = i+1; j < array.length; j++) {
				if(array[i] <= array[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(array[i]);
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
		printLeaders(array);
		scanner.close();
	}
}