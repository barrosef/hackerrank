package day11;

import java.util.Scanner;

/**
 * 
 * Today, we're building on our knowledge of Arrays by adding another dimension. 
 * Check out the Tutorial tab for learning materials and an instructional video!
 * 
 * @author barrosef - barrosef@gmail.com
 *
 */
public class Solution {
	
	static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	    int[][] arrayItens = new int[6][6];

	    for (int i = 0; i < 6; i++) {
	        String[] arrayLineItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int j = 0; j < 6; j++) {
	            int arrayItem = Integer.parseInt(arrayLineItems[j]);
	            arrayItens[i][j] = arrayItem;
	        }
	    }

	    scanner.close();
	    int max=-63;
	    int sum=0;
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	            sum=arrayItens[i][j]+arrayItens[i][j+1]+arrayItens[i][j+2]+arrayItens[i+1][j+1]+arrayItens[i+2][j]+arrayItens[i+2][j+1]+arrayItens[i+2][j+2];
	            if(sum>max){
	                max=sum;
	            }
	            sum=0;

	        }

	    }
	    System.out.println(max);
	}	
}