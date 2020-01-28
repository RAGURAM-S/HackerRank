package problems;

import java.util.Scanner;

public class StrangeCounter{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		long time = 1;
		long value = 3;
		long v = value;
		boolean flag = false;
		while(time < number) {
			if(flag == true && v == 1) {
				value = value*2;
				v = value;
			}
			time++;
			v--;
			flag = true;
		}
		System.out.println(v);
		scanner.close();
	}
}