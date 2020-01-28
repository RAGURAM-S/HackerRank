package problems;

import java.util.HashMap;
import java.util.Scanner;

public class Triplets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		int count = 0;
		boolean flag = false;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			map.put(array[i], array[i]);
		}
		for(int i = 0; i < size-1; i++) {
			for(int j = i+1; j < size; j++) {
				if(map.containsKey(array[i] + array[j])) {
					flag = true;
					count++;
				}
			}
		}
		if(flag == true) {
			System.out.println(count);
		}
		else {
			System.out.println("-1");
		}
		scanner.close();
	}
}
