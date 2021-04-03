package emailApplication;

public class EmailApp {

	public static void main(String[] args) {
		
		Email eml1= new Email("Johan","Philip");
		//System.out.println(eml1);
		//System.out.println(eml1.setDepartment());
		
		//eml1.SetAlternateEmail("dhananjay.kinolikar@msn.com");
		//System.out.println("Alternate email is :"+eml1.getAlternateEmail());
		//System.out.println("mailboxcapacity is :"+eml1.getmailboxcapacity());
		System.out.println(eml1.showinfo());
	}

}
