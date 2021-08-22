package java_Question;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int num,first=0,second=1;
        System.out.println("Fibonacci Series Program");
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		
		for(int i=0;i<number;i++) {
			
			System.out.println("The Fibonacci series is: "+first);
			num=first+second;
			first=second;
			second=num;
			
		}

	}
}
