package problems;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		long num = scanner.nextLong();
		long occurences = 0;
		long occurence = 0;
		long result = 0;
		long resultant = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'a') {
				occurences++;
			}
		}
		result = (num/input.length()*occurences);
		resultant = num%input.length();
		for(int i = 0; i < resultant; i++) {
			if(input.charAt(i) == 'a') {
				occurence++;
			}
		}
		result = result + occurence;
		System.out.println(result);
	}
}
