package day7;

import java.util.Scanner;

/**
 *
 * Objective
 * Today, we're learning about the Array data structure.
 * Check out the Tutorial tab for learning materials and an instructional video! 
 * 
 * Task
 * Given an array, , of  integers, print 's elements in reverse order as a 
 * single line of space-separated numbers.
 * 
 * Input Format
 * 
 * The first line contains an integer,  (the size of our array).
 * The second line contains  space-separated integers describing array 's elements.
 * 
 * Constraints
 * 1 <= n <= 1000
 * 1 <= a[i] <= 1000, where a[i] is i the  integer in the array.
 * 
 * Output Format
 * Print the elements of array  in reverse order as a single line of space-separated numbers.
 * 
 * @author edbarros
 * 
 * @version 1.0 march 14, 2020
 */
public class Solution
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String out = "";
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        for(int x = n-1; x >= 0; x--) {
            out += (n > 0) ? arr[x] + " " : arr[x];
        }
        
        System.out.print(out);
        
        scanner.close();
    }
    
}
