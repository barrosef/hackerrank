package day5;

import java.util.Scanner;

public class Solution {

	private static Scanner in = new Scanner(System.in);
	
    public static void main(String[] args) {
        int n = in.nextInt();
        for(int i = 1; i <= 10; i++) {
        	int value = n * i; 
        	System.out.println(n + " x " + i + " = " + value);
        }
    }
}
