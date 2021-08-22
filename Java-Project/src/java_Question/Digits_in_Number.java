package java_Question;

import java.util.Scanner;

public class Digits_in_Number {

	public static void main(String[] args) {
		
		int a=0;
        System.out.println("Digits_in_Number Program");
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		if(number<0) {
			
			number=number*-1;
			
		}else if(number==0) {
			number=1;
		}
		while(number>0) {
			number=number/10;
			a++;
		}
		System.out.println("The digit in number is : "+a);

	}

}
