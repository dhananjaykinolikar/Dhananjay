package java_Question;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		int r=0,a, temp=0,b;
        System.out.println("Palindrome Program");
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		b=number;
		
		while(number>0) {
			
			a=number%10;
			number=number/10;
			temp=temp*10+a;
			
		}
		if(temp==b) {
			System.out.println("The number is Palindrome ");
			
		}
		else {
			System.out.println("The number is not  Palindrome ");
		}
			
		

	}

}
