package day14;

import java.util.Arrays;
import java.util.Scanner;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	public Difference(int[] array) {
		this.elements = array;
		Arrays.sort(this.elements);
	}
  	
  	void computeDifference() {
  		this.maximumDifference = elements[elements.length - 1] - elements[0];
  	}
}

public class Solution {
	
	static final Scanner scanner = new Scanner(System.in);
	
    public static void main(String[] args) {
        
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}