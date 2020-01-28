package problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String inp = input.replaceAll("\\s+", "");
		int length = inp.length();
		System.out.println(inp);
		int rows = (int)Math.floor(Math.sqrt(length));
		int cols = (int)Math.ceil(Math.sqrt(length));
		char array[][] = new char[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				array[i][j] = inp.charAt(j + i*cols);
			}
		}
		for(int i = 0; i < rows; i++) {
			System.out.println();
			for(int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + "");
			}
		}
		System.out.println();
		for(int j = 0; j < cols; j++) {
			for(int i = 0; i < rows; i++) {
				System.out.print(array[i][j] + "");
			}
			System.out.println();
		}
	}
}