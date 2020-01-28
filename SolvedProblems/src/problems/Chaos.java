package problems;

import java.util.HashMap;
import java.util.Scanner;

public class Chaos{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		int num = 0;
		for(int i = 0; i < size; i++) {
			++num;
			array[i] = num;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < size; i++) {
			int input = scanner.nextInt();
			map.put(input, i);
		}
		scanner.close();
	}
}