package problems;

import java.util.HashMap;
import java.util.Scanner;

public class SparseArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			int count = 0;
			String input = scanner.next();
			if(map.containsKey(input)) {
				count = map.get(input);
				count = count + 1;
				map.put(input, count);
			}
			else {
				count = 1;
				map.put(input, count);
			}
		}
		int m = scanner.nextInt();
		String array[] = new String[m];
		for(int j = 0; j < m; j++) {
			array[j] = scanner.next();
		}
		for(int i = 0; i < m; i++) {
			if(map.containsKey(array[i])) {
				System.out.println(map.get(array[i]));
			}
			else {
				System.out.println("0");
			}
		}
		scanner.close();
	}
}
