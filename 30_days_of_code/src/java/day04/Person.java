package day04;

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
    private int age;	
  
	public Person(int initialAge) {

		if(initialAge > -1)
            this.age = initialAge;
        else
            System.out.println("Age is not valid, setting age to 0.");
	}

	public void amIOld() {
        if(age < 13)
            System.out.println("You are young.");
        else if(age >= 13 && age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
	}

	public void yearPasses() {
        age++;
	}	
}