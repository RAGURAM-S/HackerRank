package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedSubString {
	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<String> findSubString(String input, String current, int index){
		if(index == input.length()) {
			list.add(current);
			return list;
		}
		findSubString(input, current, index+1);
		findSubString(input, current + input.charAt(index), index+1);
		return list;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int index = 0;
		String current = "";
		list = findSubString(input, current, index);
		Collections.sort(list);
		int i = 0;
		for(i = 1; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		scanner.close();
	}
}
