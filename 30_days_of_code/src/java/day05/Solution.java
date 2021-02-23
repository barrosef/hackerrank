package day05;

import java.util.Scanner;

public class Solution {

    static final String MESSAGE = "%o x %o = %o";
	private static Scanner in = new Scanner(System.in);
	
    public static void main(String[] args) {
        int n = in.nextInt();
        for(int i = 1; i <= 10; i++) {
        	int value = n * i; 
        	System.out.printf(MESSAGE, n, i, value);
        }
    }
}
