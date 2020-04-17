package day02;

import java.util.Scanner;

/**
 * HackerHank challenge
 * 
 * @author barrosef - barrosef@gmail.com
 *
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
        
        System.out.println("The total meal cost is " + total_cost +" dollars.");
        
        in.close();
    }
    
    static double getValueFromPercent(double value, double percent) {
        return value * (percent / ONE_HUNDRED);
    }
}