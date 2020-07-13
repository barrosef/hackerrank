package quartiles;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	    
	    int n = scanner.nextInt();
	    int[] array = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	        array[i] = scanner.nextInt();
	    }
	    
	    Arrays.sort(array);

	    System.out.println(median(array, 0, n / 2 - 1));
	    System.out.println(median(array, 0, n - 1));
	    
	    if (n % 2 == 0) {
	        System.out.println(median(array, n / 2, n - 1));
	    } else {
	        System.out.println(median(array, n / 2 + 1, n - 1));
	    }


	    scanner.close();
	}

	private static int median(int[] arr, int start, int end) {
	    int length = end - start + 1;
	    int median = 0;
	    if (length % 2 != 0) {
	        median = arr[start + length / 2];
	    } else {
	        median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
	    }
	    return median;
	}	
	
}
