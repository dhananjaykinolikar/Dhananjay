package java_Question;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		int i;
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		int number=sr.nextInt();
		
		if(number==1) {
			System.out.println(" Number must be greater than 1");
		}
		
		for(i=2;i<number;i++) 
		{
		if(number%i==0)
		{
			System.out.println("Number is not Prime");
			break;
		}
		}
		if(number==i)
		{
			System.out.println("Number is Prime");
		}
	
		

}
}
