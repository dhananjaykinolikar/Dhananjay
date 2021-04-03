package studentdatabase;

import java.util.Scanner;

public class Appstudentdatabase {

	public static void main(String[] args) {

		System.out.print("Enter numbe rof Student: ");
		;
		Scanner in = new Scanner(System.in);

		int nosofstudent = in.nextInt();
		Student[] students = new Student[nosofstudent];

		for (int i = 0; i < nosofstudent; i++) {

			Student std = new Student();
			System.out.println("The GradeYear of Student is :" + std.GradeYear());
			// std.GradeYear();
			System.out.println("The Student Unique ID :" + std.Uniqueid());
			std.Course();
			std.paytutionfee();
			System.out.println("The Student Unique ID :" + std.toString());
		}
		/*
		 * for(int i=0; i<=nosofstudent; i++) {
		 * 
		 * System.out.println("The Student Unique ID :"+students[i].toString());
		 * 
		 * }
		 */

	}

}
