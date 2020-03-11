package stdin.stdout;

import java.util.Scanner;

/**
 * 
 * @author barrosef - barrosef@gmail.com
 *
 */
public class Solution {

	static Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
        
        for(int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            System.out.println(a);
        }
        scanner.close();
    }	
	
}
