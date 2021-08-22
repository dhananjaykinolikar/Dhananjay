package java_Question;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int rev=0;
		System.out.println("Reverse Number Program");
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		System.out.println("The  number before reverse is: "+number);
		
		while(number>0)
		{
			int r=number%10;
			System.out.println("1 The  number after reverse is: "+r);
				rev=rev*10+r;
				System.out.println("2 The  number after reverse is: "+rev);
				number=number/10;
				System.out.println("3 The  number after reverse is: "+number);
			
		}
		System.out.println("The  number after reverse is: "+rev);

	}

}
