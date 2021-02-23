package day02;

import java.util.Scanner;

/**
 * <strong>HackerHank</strong> challenge <strong>Day 02: Operators</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Given the meal price and percentage of tip and  tax, calculate the total cost.  
 * 
 * @author Ed Barros / barrosef@gmail.com 
 */
public class Solution {
    
    static final double ONE_HUNDRED = 100;
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        
        double tip_cost = getValueFromPercent(meal_cost, tip_percent);
        double tax_cost = getValueFromPercent(meal_cost, tax_percent);
        
        long total_cost = Math.round(meal_cost + tip_cost + tax_cost);
        
        System.out.println(total_cost);
        
        in.close();
    }
    
    static double getValueFromPercent(double value, double percent) {
        return value * (percent / ONE_HUNDRED);
    }
}