package day26;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * <strong>Hacker Rank</strong> challenge <strong>day 26: Nested Logic</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Calculate the fine like as: 
 * When return date is late in days fine is (days difference * 15)
 * When return date is late in months fine is (months differences * 500)
 * When return date is late in years fine is 10000
 * When no late return fine is 0
 * 
 * @author Ed Barros - barrosef@gmail.com
 */
public class Solution {

    static Scanner in = new Scanner(System.in);

    //Defining constants
    static int ZERO = 0;
    static int FIFTEEN = 15;
    static int FIVE_HUNDRED = 500;
    static int TEN_THOUSAND = 10000;

    public static void main(String[] args) {
        
        final LocalDate returnDate = getDate();
        final LocalDate expectDate = getDate();
        in.close();

        int fine;
        
        if (returnDate.equals(expectDate) || returnDate.isBefore(expectDate)) {
            //If is returned on or before the expected return date, no fine will be charged
            fine = ZERO;
        } else if (returnDate.getMonth() == expectDate.getMonth()  && returnDate.getYear() == expectDate.getYear()) {
            //If the book is returned after the expected return day but still within the same calendar month and year as the expected return date
            fine = FIFTEEN * (returnDate.getDayOfMonth() - expectDate.getDayOfMonth());
        } else if (returnDate.getYear() == expectDate.getYear()) {
            //If the book is returned after the expected return month but still within the same calendar year as the expected return date
            fine = FIVE_HUNDRED * (returnDate.getMonthValue() - expectDate.getMonthValue());
        } else {
            //If the book is returned after the calendar year in which it was expected, there is a fixed fine of TEN_THOUSAND
            fine = TEN_THOUSAND;
        }
        
        System.out.println(fine);
        System.exit(0);
    }

    static final LocalDate getDate() {
        int day = in.nextInt();
        int mon = in.nextInt();
        int year = in.nextInt();
        return LocalDate.of(year, mon, day);
    }
}
