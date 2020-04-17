package day17;

import java.util.Scanner;

/**
 * 
 * @author barrosef - barrosef@gmail.com
 *
 */
class Solution{
	
	
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {
	static final String EXCEPTION_MESSAGE = "n and p should be non-negative";
	int power(int n, int p) throws Exception {
		if(n < 0 || p < 0) {
			throw new Exception(EXCEPTION_MESSAGE);
		}
		return (int) Math.pow(n, p);
	}
}