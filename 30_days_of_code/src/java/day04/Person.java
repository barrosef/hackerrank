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

	/**
	 * Invalid age message
	 */
    static final String INVALID_AGE_MESSAGE = "Age is not valid, setting age to 0.";

	/**
	 * Message when age is < TEEN_AGE_INI
	 */
    static final String YOUNG_AGE_MESSAGE = "You are young.";

	/**
	 * Message when TEAN_AGE_INI <= age < TEEN_AGE_END
	 */
    static final String TEEN_AGE_MESSAGE = "You are a teenager.";

	/**
	 * Message when age > TEEN_AGE_END
	 */
    static final String OLD_AGE_MESSAGE = "You are old.";

	/**
	 * Message when constraint 1 <= t <= 4 fails
	 */
	static final String T_CONSTRAINT_ERROR_MSG = "Don't compliance with constraint 1 <= t <= 4";

	/**
	 * Message when constraint -5 <= age <= 30 fails
	 */
	static final String AGE_CONSTRAINT_ERROR_MSG = "Don't compliance with constraint -5 <= age <= 30";

	/**
	 * Used to compare with age if teen or young age
	 */
	static final int TEEN_AGE_INI = 13;

	/**
	 * Used to compare with age if young or old age
	 */
	static final int TEEN_AGE_END = 18;

	/**
	 * Implementing constraint 1 <= t <= 4
	 * 
	 * @param t given integer
	 * @return boolean if t is valid
	 */
	private static boolean isValidT(int t) {
		return isValid(t, 1, 4);
	}

	/**
	 * Implementing constraint -5 <= age <= 30
	 * 
	 * @param age age input line
	 * @return boolean if age is valid
	 */
	private static boolean isValidAge(int age) {
		return isValid(age, -5, 30);
	}

	/**
	 * Used by isValidT and isValidAge, this method compare a i <= value <= n
	 * 
	 * @param value value to compare
	 * @param i minor value to compare value >= i
	 * @param n major value to compare value <= value
	 * @return boolean i <= value <= n
	 */
	private static boolean isValid(int value, int i, int n) {
		return value >= i && value <= n;
	}

	private int age;	
  
	/**
	 * Class constructor
	 * 
	 * Checks if initialAge is valid or print INVALID_AGE_MESSAGE
	 * 
	 * @param initialAge to be valid age shoud be > -1
	 */
	public Person(int initialAge) {
		if(initialAge > -1)
			this.age = initialAge;
		else
			System.out.println(INVALID_AGE_MESSAGE);
	}

	/**
	 * Implementing of role age messsages
	 */
	public void amIOld() {
        if(age < TEEN_AGE_INI)
            System.out.println(YOUNG_AGE_MESSAGE);
        else if(age >= TEEN_AGE_INI && age < TEEN_AGE_END)
            System.out.println(TEEN_AGE_MESSAGE);
        else
            System.out.println(OLD_AGE_MESSAGE);
	}

	public void yearPasses() {
        age++;
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		if (isValidT(t)) {
			for (int i = 0; i < t; i++) {
				int age = sc.nextInt();
				if (isValidAge(age)) {
					Person p = new Person(age);
					p.amIOld();
					for (int j = 0; j < 3; j++) {
						p.yearPasses();
					}
					p.amIOld();
					System.out.println();
				} else {
					System.out.println(AGE_CONSTRAINT_ERROR_MSG);
				}
			}
		} else {
			System.out.println(T_CONSTRAINT_ERROR_MSG);
		}

		sc.close();
    }
}