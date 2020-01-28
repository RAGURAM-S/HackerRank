package problems;

import java.util.HashMap;
import java.util.Scanner;

public class Pairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int diff = scanner.nextInt();
		int array[] = new int[size];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			map.put(array[i], array[i]);
			}
		for(int i = 0; i < size; i++) {
			if(map.containsKey(array[i] + diff)) {
				count++;
			}
		}
		System.out.println(count);
	scanner.close();
	}
}
