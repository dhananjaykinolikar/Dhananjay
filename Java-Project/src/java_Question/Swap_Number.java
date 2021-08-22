package java_Question;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {

		System.out.println("Swapping two number");
		
		System.out.print(" Enter a: ");
		Scanner sr = new Scanner(System.in);
		int a=sr.nextInt();
		
		System.out.print(" Enter b: ");
		Scanner rs = new Scanner(System.in);
		int b=rs.nextInt();
		
		System.out.println("A before swap: "+a);
		System.out.println("B before swap: "+b+"\n");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A After swap: "+a);
		System.out.println("B After swap: "+b);
		
	}

}
