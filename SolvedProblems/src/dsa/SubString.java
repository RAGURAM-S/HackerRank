package dsa;

import java.util.Scanner;

public class SubString {
	static void printSubString(String str, String current, int index) {
		if(index == str.length()) {
			System.out.println(current);
			return;
		}
		printSubString(str, current, index+1);
		printSubString(str, current+str.charAt(index), index+1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String current = "";
		int index = 0;
		printSubString(str, current, index);
		scanner.close();
	}
}
