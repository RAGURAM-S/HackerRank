package problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Socks{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int size = scanner.nextInt();
			int counter = 0;
			int var;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i = 0; i < size; i++) {
				int count = 0;
				int key = scanner.nextInt();
				if(map.containsKey(key)) {
					count = map.get(key);
					count++;
					map.put(key, count);
				}
				else {
					count++;
					map.put(key, count);
				}
			}
			scanner.close();
			Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
			while(iterator.hasNext()) {
				Map.Entry<Integer, Integer> entry = iterator.next();
				var = entry.getValue();
				counter = counter + (var/2);
			}
			System.out.println(counter);
	}
}