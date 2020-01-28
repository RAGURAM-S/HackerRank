package problems;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayE {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int size = scanner.nextInt();
			int sum = scanner.nextInt();
			int array[] = new int[size];
			for(int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
			}
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int curr_sum = 0;
			int start = 0;
			int end = 0;
			for(int i = 0; i < size; i++) {
				curr_sum = curr_sum + array[i];
				if(curr_sum - sum == 0) {
					start = 1;
					end = i+1;
					System.out.println(start + " " + end);
					break;
				}
				if(map.containsKey(curr_sum - sum)) {
					start = map.get(curr_sum - sum) + 1;
					start = start + 1;
					end = i+1;
					System.out.println(start + " " + end);
					break;
				}
				map.put(curr_sum, i);
			}
			if(end == 0) {
				System.out.println("-1");
			}
			scanner.close();
		}
	}
