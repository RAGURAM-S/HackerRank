package problems;

import java.util.Scanner;

public class UTree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cycle = scanner.nextInt();
		int curr_height = 0;
		if(cycle == 0) {
			curr_height = 1;
		}
		else {
			for(int i = 0; i <= cycle; i++) {
				if(i%2 == 0) {
					curr_height++;
				}
				else {
					curr_height = curr_height*2;
				}
			}
		}
		System.out.println(curr_height);
		scanner.close();
	}
}
