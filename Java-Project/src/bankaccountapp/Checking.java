package bankaccountapp;

public class Checking extends Account {

	String  DebitCardNumber;
	//int DebitCardNumber;
	int DebirCardPIN;
	int password;
	
	

	
	public Checking(String name,String sSN, double Balance) {
		
		super(name,sSN,Balance);
		AccountNumber = "2"+AccountNumber;
		

	}
	@Override
	public  void setRate() {
		rate = getBaseRate()*.15;
	
		
	}
	private String randpassword(int length) {

		String passwordSet = "0123456789";

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {

			int rand = (int) (Math.random() * passwordSet.length());

			password[i] = passwordSet.charAt(rand);
		}

		return new String(password);

	}
	
	private void DebitCardInfo() {
	
		//DebitCardNumber =(int) (Math.random()*Math.pow(10, 12));
		DebirCardPIN =(int) (Math.random()*Math.pow(10, 4));
		
		System.out.println(
				"\nDEBIT CARD DETAILS"
			  + "\nDEBITCARD_NUMBER: "+randpassword(12)
				+"\nDEBITCARD_PIN: "+DebirCardPIN
			
				);

	}
	
	public void showinfo() {
		System.out.println("ACCOUNT TYPE: CHECKING");
		super.showinfo();
		DebitCardInfo();
	}

}
