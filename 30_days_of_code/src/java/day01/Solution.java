package day01;

import java.util.Scanner;

/**
 * <strong>HackerHank</strong> challenge <strong>Day 01: Data Types</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Declare three different data types variables int, double and String and initialize other three same datatype variables with three stdin inputs, finally 
 * - print the int initialized variable summed with first int variable
 * - print the double initialized variable summed with first double variable
 * - print the String initialized variable summed with first String variable 
 * 
 * @author Ed Barros / barrosef@gmail.com 
 */
public class Solution {
	
        private static final Scanner scanner = new Scanner(System.in);
	
	public static void main() {
        
                int i = 4;
                double d = 4.0;
                String s = "HackerRank ";

                int x = scanner.nextInt();
                double j = scanner.nextDouble();        
                String t = scanner.nextLine();

                System.out.println(i + x);

                System.out.println(d + j);

                System.out.println(s + t);
	}	
}
