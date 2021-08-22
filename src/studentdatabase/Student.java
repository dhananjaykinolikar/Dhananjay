package studentdatabase;

import java.util.Scanner;

public class Student {
	 
			private String firstName;
			private String lastName;
			private int StudentYear;
			private int id=1000;
			private String Unique_ID;
			private String Courses="";
			private int tutionfee;
			private int TutionBalance;
			private int costofcourse=600;
			
			
			public Student() {
				
				//Name of Student
				System.out.println("Enter the Name of Student:");
				Scanner in = new Scanner(System.in);
				System.out.print("Enter FirstName :");
				this.firstName = in.nextLine();
				System.out.print("Enter LastName :");
				this.lastName =in.nextLine();
				System.out.println("the Name of Student is :"+firstName+"."+lastName);
				
				//Grade Year
			   //System.out.println("The GradeYear of Student is :"+GradeYear());
				
				//Uniqueid
				//System.out.println("The Student Unique ID :"+Uniqueid());

				//Course()
				//Course();
				
				//Tution fee paid
				//paytutionfee();
				
				//ToString
				System.out.println(toString());
			}
			//GradeYear
			public String GradeYear() {
				
				System.out.println("GradeYear of Students: "+"\n 1 FirstYear"+"\n 2 SecondYear"+"\n 3 ThirdYear"+"\n 4 ForthYear");
				System.out.print("Enter GradeYear of Students: ");
				Scanner in = new Scanner(System.in);
				StudentYear =in.nextInt();
				
				if(StudentYear==1)      {return  "FirstYear";}
				else if(StudentYear==2) {return  "SecondYear";}
				else if(StudentYear==3) {return  "ThirdYear";}
				else if(StudentYear==4) {return  "ForthYear";}
				else {return "";}
			
			}
			
			//Unique Id
			public String Uniqueid() {
				id++;
				String Unique_ID = "0"+StudentYear+id;
				return Unique_ID;
			}
			//Enroll for Course
			public void Course() {
				
				do {
				System.out.print("Enter the Course (Q to quit)");
				Scanner in = new Scanner(System.in);
				String Course = in.nextLine();
				if(!Course.equals("Q")) {
					
					Courses=Courses+"\n"+Course;
				
					TutionBalance = TutionBalance + costofcourse;
					
				}
				else {
					break;
				}
				
				} while(1!=0);
				
				//System.out.println("Entrolled Course "+Courses);
				//System.out.println("TutionBalance $"+TutionBalance);
				
			}
			//pay Tution fee
			public void paytutionfee() {
				System.out.print("Enter the Tutuion fee paid ");
				Scanner in = new Scanner(System.in);
				tutionfee= in.nextInt();
				
				TutionBalance=TutionBalance - tutionfee;
				//System.out.println("TutionBalance $"+TutionBalance);
				
			}
			
			//info
			public String toString() {
				return "\nThe Name of New Student"+"\n"+firstName+"."+lastName+
						"\nThe Unique ID is: "+Uniqueid()+
						"\nThe Courseid: "+Courses+
						"\nAmount paid: $"+tutionfee+
						"\nBalance Amount: $"+TutionBalance;
				
			}

}
