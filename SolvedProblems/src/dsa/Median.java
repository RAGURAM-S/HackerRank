package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
	static int findMedian(int array[], int n) {
		Arrays.sort(array);
		float median = 0;
		if(n%2 != 0) {
			median = array[(int)Math.ceil(n/2)];
		}
		else {
			median = (int)Math.ceil(array[n/2] + array[(n/2)-1])/2;
		}
		return (int)median;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		int result = findMedian(array, n);
		System.out.println(result);
	}
}
