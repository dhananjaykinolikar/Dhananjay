package testBankAccount;

public class TestChecking extends TestAccount {
	
	//String  DebitCardNumber;
	int DebitCardNumber;
	int DebirCardPIN;
	
	public TestChecking(String name, String sSN,String AccountType, double DepositAmt) {
		
		
		super(name,sSN,AccountType,DepositAmt);
		AccountNumber ="2"+AccountNumber;
		showinfo();
		
		//System.out.println("ch Account nos: "+AccountNumber);
		
	}
	@Override
	public void setRate() {
		
		Rate = BaseRate()-.25;
		
		
	}
	
	//
	public void Debitcardinfo() {
		
		DebitCardNumber= (int) (Math.random()*Math.pow(10, 12));
		
	 DebirCardPIN= (int) (Math.random()*Math.pow(10, 4));
		
	 System.out.println("\nDEBIT CARD DETAILS: "
				+"\nDebitCardNumber: "+DebitCardNumber
				+"\nDebirCardPIN: "+DebirCardPIN
			
				
				
				);
	}

}
