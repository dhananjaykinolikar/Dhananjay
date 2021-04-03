package emailApplication;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultpasswordlength= 8;
	private String  department;
	private String email;
	private String companysuffix= "aeycompany.com";
	private int mailbixcapacity=50;
	private String alternateEmail;
	
	public Email(String firstName, String lastName)
	{
		this.firstName= firstName;
		this.lastName= lastName;
		
		System.out.println("The Name of New Joining is "+firstName+", "+lastName);
		this.department = setDepartment();
		//System.out.println("Department is :"+this.department);
		
		this.password = randpassword(defaultpasswordlength);
		System.out.println("Your password is :"+this.password);
		
		//
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companysuffix;
		//System.out.println("The email ID is \n"+email);
		
	}
	
	//Adding department
	
	private String setDepartment()
	{
		System.out.println("The Comapny Departments are :\n 1 Sales \n 2 Development \n 3 Accounting \n 0 None");
		System.out.println("Enter the Department Code :");
		Scanner in = new Scanner(System.in);
		
		int DepChoice =in.nextInt();
		
		if(DepChoice==1) { return "Sales";}
		else if(DepChoice==2) { return "Development";}
		else if(DepChoice==3) { return "Accounting";}
		else {return "";}
		
		
	}
	
	private String randpassword(int length){
	
		String passwordSet ="ABCDEFGHJIKLMNOPQRSTUVWXYZ0123456789!@#$%";
		
		char[] password =new char[length];
		
		for (int i=0;i<length;i++){
		
			int rand = (int) (Math.random()*passwordSet.length());
			
			
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
			
	}
	
	//Set ethods
	
	public void Setmailboxcapacity(int capacity) {this.mailbixcapacity = capacity;}

	public void SetAlternateEmail(String altEmail) {this.alternateEmail = altEmail;}

	public void changepassword(String password) {this.password =password;}

	//Get methods
	
	public int getmailboxcapacity() {return mailbixcapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getpassword() { return password;}
	
	//info show
	
	public String showinfo() {
		
		return "\n New Employee Name :"+firstName+"."+lastName+
			   "\n Department :"+department+
			   "\n Email id :"+email+
			   "\n mailbox capacity is "+mailbixcapacity+"mb";
				
		
	}

}
