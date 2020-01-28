package problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char array[] = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		boolean flag = true;
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			if (map.containsKey(array[i])) {
				count = map.get(array[i]);
				count = count + 1;
				map.put(array[i], count);
			} else {
				count = 1;
				map.put(array[i], count);
			}
		}
		if (input.length() % 2 == 0) {
			for (int i = 0; i < input.length(); i++) {
				if (map.get(array[i]) % 2 != 0) {
					flag = false;
					break;
				}
			}
		}
		else {
			Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
			while(iter.hasNext()) {
				Map.Entry<Character, Integer> entry = iter.next();
				if(entry.getValue() %2 != 0) {
					counter++;
					if(counter > 1) {
						flag = false;
						break;
					}
				}
			}
		}
		if (flag == true) {
			System.out.println("YES");
		} 
		else {
			System.out.println("NO");
		}
	}
}
