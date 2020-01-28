package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int sum = (size) * (size + 1) / 2;
		int curr_sum = 0;
		int missingNumber = 0;
		int array[] = new int[size];
		String line = br.readLine();
		String[] strs = line.trim().split("\\s+");
		for (int i = 0; i < size - 1; i++) {
			array[i] = Integer.parseInt(strs[i]);
			curr_sum = curr_sum + array[i];
		}
		missingNumber = sum - curr_sum;
		System.out.println(missingNumber);
		br.close();
	}
}