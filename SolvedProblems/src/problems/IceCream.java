package problems;

import java.util.HashMap;
import java.util.Scanner;

public class IceCream{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int size = scanner.nextInt();
		int array[] = new int[size];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			map.put(array[i], i);
		}
		for(int i = 0; i < size; i++) {
			int map_count = 0;
			if(hash.containsKey(array[i])) {
				map_count = hash.get(array[i]);
				map_count++;
				hash.put(array[i], map_count);
			}
			else {
				map_count = 1;
				hash.put(array[i], map_count);
			}
		}
		for(int i = 0; i < size ; i++) {
			if(map.containsKey(m - array[i])) {
				if(m - array[i] == array[i]) {
					if(hash.get(array[i]) >= 2) {
						System.out.println((i+1) + " " + (map.get(m - array[i])+1));
						break;
					}
					else {
						continue;
					}
				}
				else {
					System.out.println((i+1) + " " + (map.get(m - array[i])+1));
					break;
				}
			}
		}
	}
}