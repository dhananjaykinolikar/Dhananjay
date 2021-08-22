package java_Question;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		
		if(number==0) {
			
			System.out.println("Please enter the Number other than 0: ");
			number=sr.nextInt();
		}
		if(number%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is not odd");
		}

	}

}
