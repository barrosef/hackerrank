package java.stdin.stdout;

import java.util.Scanner;

/**
 * 
 * @author barrosef - barrosef@gmail.com
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int a = scan.nextInt();
            System.out.println(a);
        }
    }	
	
}
