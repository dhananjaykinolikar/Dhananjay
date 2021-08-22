package java_Question;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {

		System.out.println("Factorial Program");
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		int fact=1;
		
		for(int i=1; i<=number;i++) {
			
			fact=fact*i;
			
			System.out.println("num "+fact);
		
			
		}
		System.out.println("The factorial is"+fact);

	}

}
