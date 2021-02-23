package day00;

import java.util.Scanner;

static String HELLO_WORLD = "Hello, World.;
/**
 * <strong>HackerHank</strong> challenge <strong>Day 0: Data Types</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Save in a variable a input's line from stdin and print in output 'Hello, World' on the first line and on a second line print the variable that saved.
 * 
 * @author Ed Barros / barrosef@gmail.com 
 */
public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String inputString = scanner.nextLine(); 

		scanner.close(); 
      
		System.out.println(HELLO_WORLD);
      
		System.out.println(inputString);
    }
}