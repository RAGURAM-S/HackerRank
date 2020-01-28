package problems;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
	
	static boolean[] SieveOfEratosthenes(int num) {
		boolean array[] = new boolean[num+1];
		Arrays.fill(array, true);
		array[0] = false;
		array[1] = false;
		for(int i = 2; i < Math.sqrt(num); i++) {
			if(array[i] == true) {
				for(int j = 2; j*i <= num; j++) {
					array[j*i] = false;
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		boolean array[];
		array = SieveOfEratosthenes(num);
		for(int i = 0; i < num; i++) {
			if(array[i] == true) {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
