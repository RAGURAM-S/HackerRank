package problems;

import java.util.HashMap;
import java.util.Scanner;

public class Ransom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		boolean flag = true;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < m; i++) {
			String inp = scanner.next();
			int count = 0;
			if(map.containsKey(inp)) {
				count++;
				map.put(inp, count);
			}
			else {
				count = 1;
				map.put(inp, count);
			}
		}
		for(int i = 0; i < n; i++) {
			String in = scanner.next();
			if(map.containsKey(in)){
				if(map.get(in) > 0) {
					map.put(in, map.get(in) - 1);
					System.out.println(in);
					System.out.println(map.get(in));
				}
				else {
					flag = false;
					System.out.println(in);
					System.out.println(map.get(in));
				}
			}
			else {
				flag = false;
				System.out.println(in);
				System.out.println(map.get(in));
				break;
			}
		}
		if(flag == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
