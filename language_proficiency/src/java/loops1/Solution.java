package loops1;

import java.util.Scanner;

public class Solution {

    static final Scanner scanner = new Scanner(System.in);
    
    static final String REGEX = "%d x %d = %d%n";
    
    public static void main(String[] args) {
    	
        int N = scanner.nextInt();
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int x = 1; x <= 10; x++) {
            System.out.printf(REGEX, N, x, N*x);
        }
        
        scanner.close();
    }
}