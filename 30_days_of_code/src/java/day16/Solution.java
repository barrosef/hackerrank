package day16;

import java.util.Scanner;

public class Solution {
    
	static Scanner scanner = new Scanner(System.in);
	static final String MESSAGE_BAD_STRING = "Bad String";
	
	public static void main(String[] args) {
        String S = scanner.next();
        String print = S;
        try {
        	Integer.parseInt(S);
        } catch(Exception e) {
        	print = MESSAGE_BAD_STRING;
        }
        System.out.println(print);
    }
}
