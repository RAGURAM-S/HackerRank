package problems;

import java.util.Scanner;

public class Hill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();
		int result = n;
		int valley = 0;
		boolean flag = true;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'U') {
				flag = true;
				result--;
			}
			if(s.charAt(i) == 'D') {
				flag = false;
				result ++;
			}
			if(flag == true && result == n) {
				valley++;
			}
		}
		System.out.println(valley);
	}
}
