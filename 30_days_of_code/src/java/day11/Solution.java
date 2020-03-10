package day11;

import java.util.Scanner;

/**
 * 
 * Today, we're building on our knowledge of Arrays by adding another dimension. 
 * Check out the Tutorial tab for learning materials and an instructional video!
 * 
 * @author barrosef - barrosef@gmail.com
 *
 */
public class Solution {
	
	static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int hourglasses[] = new int[7];
		int hourglasseArrayIndex = 0;
		
		for(int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 6; j++) {
				if (j > 0 || j < 4) {
					//Ele participa do anterior hourglassesArrayIndex - 1;
					//recursividade até o
					hourglasses[hourglasseArrayIndex] += scanner.nextInt();
				}
			}
			
		}
	}
	
}