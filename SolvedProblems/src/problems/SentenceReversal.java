package problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SentenceReversal{
	static String reverseSentence(String input) {
		String[] array = input.split("\\s");
		String result = "";
		for(int i = array.length-1; i >= 0; i--) {
			result += array[i] + " ";
		}
		return result;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String reversedString = reverseSentence(input);
		System.out.println(reversedString);
		reader.close();
	}
}