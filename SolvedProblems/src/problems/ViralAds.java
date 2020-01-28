package problems;

import java.util.Scanner;

public class ViralAds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int shared = 5;
		int cumulative = 0;
		for(int i = 1; i <= number; i++) {
			int liked = 0;
			liked = (int)Math.floor(shared/2);
			shared = liked * 3;
			cumulative += liked;
		}
		System.out.println(cumulative);
	}
}
