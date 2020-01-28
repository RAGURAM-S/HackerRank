package sorting;

import java.util.Scanner;

public class SelectionSort{
	static void sort(int array[]) {
		for(int i = 0; i < array.length-1; i++) {
			int min = Integer.MAX_VALUE;
			int res = 0;
			for(int j = i+1; j < array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					res = j;
				}
			}
			if(array[i] > min) {
				int temp = array[i];
				array[i] = array[res];
				array[res] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for(int i =0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		sort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
 	}
}