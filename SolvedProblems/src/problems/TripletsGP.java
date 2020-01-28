package problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TripletsGP {
	public static int factorial(int num) {
		if(num <= 1) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int r = scanner.nextInt();
		int array[] = new int[size];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;
		int res1 = 0;
		int res2 = 0;
		for(int i = 0; i < size; i++) {
			int count = 0;
			array[i] = scanner.nextInt();
			if(map.containsKey(array[i])) {
				count = map.get(array[i]) + 1;
				map.put(array[i], count);
			}
			else {
				count = count + 1;
				map.put(array[i], count);
			}
		}
		int triplets = 0;
		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			int inter = 0;
			res = entry.getKey();
			res1 = res/r;
			res2 = res*r;
			if(map.containsKey(res1) && map.containsKey(res2)) {
				if(res == res1 && res1 == res2) {
					int a;
					a = entry.getValue()*(entry.getValue() - 1)*(entry.getValue() - 2);
					inter = a/factorial(3);
				}
				else {
					inter = map.get(res)* map.get(res1)*map.get(res2);
				}
				triplets = triplets + inter;
			}
		}
		System.out.println(triplets);
		scanner.close();
	}
}
