package Practice;

import java.util.Scanner;

public class Student_board_exam_result {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter English marks out of 100 : ");
		
		int English =scan.nextInt();
		
		System.out.println("Enter Maths marks out of 100 : ");
		
		int Maths =scan.nextInt();
		
		System.out.println("Enter Physics marks out of 100 : ");
		
		int Physics =scan.nextInt();
		
		System.out.println("Enter Chemistry marks out of 100 : ");
		
		int Chemistry =scan.nextInt();
		
		System.out.println("Enter Computerscience marks out of 100 : ");
		
		int Computerscience =scan.nextInt();
		
		float Total= English+Maths+Physics+Chemistry+Computerscience;
		
		System.out.println("The Total marks out of 500 is :"+Total);
		float Percentage = (Total/500)*100;
		
		System.out.println("The Percentage is "+Percentage);
	}

}
