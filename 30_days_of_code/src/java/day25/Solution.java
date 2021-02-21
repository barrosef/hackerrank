package day25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	static final int TWO = 2;
	
	/**
	 * 
	 * @param n
	 * @param div
	 * @return
	 */
    static boolean isPrimeRecursive(int n, int div) { 
  
        if (n == 2) 
            return true;
        
        if (n % div == 0) 
            return false; 
       
        if ((div * 2) > n)
            return true;

        return isPrimeRecursive(n, div + 1);
    }

	static boolean isPrime(int n, int div) { 
		
		if(n <= 1) 
			return false;
		
		for (div = TWO; div * div <= n; div++) {
			if (n % div == 0)   
				return false;
		}
		
		return true;
	}


	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<String> res = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
        	res.add(isPrimeRecursive(sc.nextInt(), TWO) ? "Prime" : "Not prime");
        }
        
        res.forEach( isPrime -> System.out.println(isPrime) );
	}
}
