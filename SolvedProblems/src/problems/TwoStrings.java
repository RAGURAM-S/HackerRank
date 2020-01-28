package problems;

import java.util.HashMap;
import java.util.Scanner;

public class TwoStrings{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int iter = 0; iter < test; iter++) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			boolean flag = false;
			HashMap<Character,Character> map = new HashMap<Character, Character>();
			for(int i = 0; i < s1.length(); i++) {
				map.put(s1.charAt(i), s1.charAt(i));
			}
			char array[] = s2.toCharArray();
			for(int i = 0; i < s2.length(); i++) {
				if(map.get(array[i]) != null){
					if(map.get(array[i]) == array[i]) {
						flag = true;
						break;
					}
				}
				else {
					continue;
				}
			}
			if(flag == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}