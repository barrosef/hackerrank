package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String array[] = Integer.toBinaryString(n).split("0+");
        Arrays.sort(array);
        System.out.println(array[array.length-1].length());
        scanner.close();
    }
}
