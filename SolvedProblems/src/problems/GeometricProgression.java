package problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GeometricProgression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size= scanner.nextInt();
		int r = scanner.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;
		int count = 0;
		for(int i = 0; i < size; i++) {
			int inp = scanner.nextInt();
			map.put(inp, inp);
		}
		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			res = entry.getValue();
			if(map.containsKey(res/r)) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
