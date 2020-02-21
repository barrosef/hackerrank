package day8;

import java.util.Scanner;

public class Solution {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.close();
		String ans = "";

		if (n % 2 == 1 || (n > 5 && n <= 20)) {
			ans = "Weird";
		} else {
			ans = "Not Weird";
		}
		System.out.println(ans);
	}
}
