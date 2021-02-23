package day03;

import java.util.Scanner;

/**
 * <strong>HackerHank</strong> challenge <strong>Day 03: Intro to Conditional Statements</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Given int value print: <strong>'Weird when'</strong>
 * - value is odd;
 * - value is even and in the inclusive between 6 and 20.
 * Print <strong>'Not Weird'</strong>
 * - value is even and in the inclusive between 2 and 5
 * - value is greater than 20 
 * 
 * @author Ed Barros / barrosef@gmail.com 
 */
public class Solution {

   static final String WEIRD = "Weird";
   static final String NOT_WEIRD = "Not Weird";

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      
      scan.close();
      String ans = NOT_WEIRD;
          
      /*
       *  if 'n' (value) is odd not divisible by 2 or 5 < n <= 20
       */
      if(n % 2 == 1 || (n > 5 && n <= 20)){
         ans = WEIRD;
      }
      
      System.out.println(ans);
   }
}
