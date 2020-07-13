package day19;

import java.util.Scanner;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
	
	int[] basePrimeNumber = {1, 2, 3, 5, 7};
	
    public int divisorSum(int n) {
		int sum = n;
		if(n > 1) {
			int test = n / 2;
			do {
			    if(n % test == 0) {
			        sum += test;
			    }
			} while( test-- > 1 );
		}
		return sum;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}