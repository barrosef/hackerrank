package day6;

import java.util.Scanner;

public class Solution {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int t = scanner.nextInt();
		String s;

		for(int i = 0; i < t; i++){
			s = scanner.next();
			
			for(int j = 0; j < s.length(); j++){

				if(j % 2 == 0){
					System.out.print(s.charAt(j));
				}
			} 
			System.out.print(" ");
			
			for(int j = 0; j < s.length(); j++){
				if(j % 2 == 1){
					System.out.print(s.charAt(j));
				}

			}
			System.out.println();
		}

	}

}