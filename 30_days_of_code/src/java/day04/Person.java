package day04;

import java.util.Scanner;

/**
 * <strong>HackerHank</strong> challenge <strong>day 04: Class vs. Instance</strong>, solved using <strong>java 8</strong> programming language
 * 
 * <strong>Challenge</strong>
 * Given int value print: <strong>'Weird when'</strong>
 * - value is odd;
 * - value is even and in the inclusive between 6 and 20.
 * Print <strong>'Not Weird'</strong>
 * - value is even and in the inclusive between 2 and 5
 * - value is greater than 20 
 * 
 * @author Ed Barros / barrosef@gmail.com 
 */
public class Person {

    static final String INVALID_AGE_MESSAGE = "Age is not valid, setting age to 0.";
    static final String YOUNG_AGE_MESSAGE = "You are young.";
    static final String TEEN_AGE_MESSAGE = "You are a teenager.";
    static final String OLD_AGE_MESSAGE = "You are old.";

    private int age;	
  
	public Person(int initialAge) {

		if(initialAge > -1)
            this.age = initialAge;
        else
            System.out.println(INVALID_AGE_MESSAGE);
	}

	public void amIOld() {
        if(age < 13)
            System.out.println(YOUNG_AGE_MESSAGE);
        else if(age >= 13 && age < 18)
            System.out.println(TEEN_AGE_MESSAGE);
        else
            System.out.println(OLD_AGE_MESSAGE);
	}

	public void yearPasses() {
        age++;
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}