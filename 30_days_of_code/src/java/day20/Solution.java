package day20;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int totalSwaps = orderArray(a);
        System.out.println("Array is sorted in "+totalSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);       
    }

    private static int orderArray(int[] a) {
	    // Track number of elements swapped during a single array traversal    	    
    	int numberOfSwaps = 0;
    	for (int i = 0; i < a.length; i++) {
    	    
    	    for (int j = 0; j < (a.length - 1); j++) {
    	        // Swap adjacent elements if they are in decreasing order
    	        if (a[j] > a[j + 1]) {
    	            swap(j, j  + 1, a);
    	            numberOfSwaps++;
    	        }
    	    }
    	    
    	}    	
    	return numberOfSwaps;
    }
    
    private static void swap(int i, int j, int a[]) {
    	int x = a[i];
    	a[i] = a[j];
    	a[j] = x; 
    }
}