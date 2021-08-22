package java_Question;

import java.util.Scanner;

public class Number_of_Words_in_String {

	public static void main(String[] args) {

        System.out.println("Digits_in_Number Program");
		
		System.out.print("Enter the Number: ");
		Scanner sr = new Scanner(System.in);
		String s=sr.nextLine();
		
		int count=1;

		for(int i=0;i<s.length()-1;i++) {
			
			if((s.charAt(i)==' ')&&( s.charAt(i+1)!=' ')) {
			count++;
			
		
		}
		}
		System.out.println("The number of words in String is "+count);
	}

}
