package output.formating;

import java.util.Scanner;

public class Solution {

	static Scanner sccanner = new Scanner(System.in);
	
	static String REGEX = "%-15s%03d%n";
	
	static String LINE_STRING = "================================";
	
    public static void main(String[] args) {
		System.out.println(LINE_STRING);
		for(int i=0;i<3;i++)
		{
		    String s1=sccanner.next();
		    int x=sccanner.nextInt();
		    System.out.printf(REGEX, s1, x);
		}
		System.out.println(LINE_STRING);

    }
}



