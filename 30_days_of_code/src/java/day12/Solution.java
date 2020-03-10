package day12;

import java.util.Scanner;

class Person {
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person {
	
	static char O = 'O';
	static char E = 'E';
	static char A = 'A';
	static char P = 'P';
	static char D = 'D';
	static char T = 'T';
	
	private int[] scores;
	
	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.scores = scores;
	}
	
	public char calculate() {
		double a = average();
		if(80 <= a && a < 90) {
			return E;
		}
		if(70 <= a && a < 80) {
			return A;
		}
		if(55 <= a && a < 70) {
			return P;
		}
		if(40 <= a && a < 55) {
			return D;
		}
		if(a < 40) {
			return T;
		}
		return O;
	}
	
	private int sumScores() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	private double average() {
		int sum = sumScores();
		return sum / scores.length;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

