package testBankAccount;

public abstract class TestAccount implements TestiRate {
	
	protected String name;
	protected String sSN;
	public String AccountNumber;
	protected String AccountType;
	protected double DepositAmt;
	protected double Balance;
	protected double Rate;
	private static int index=10000;
	
	
	public TestAccount(String name, String sSN,String AccountType, double DepositAmt) {
		
		this.name = name;
		this.sSN = sSN;
		this.AccountType = AccountType;
		this.DepositAmt = DepositAmt;
		this.Balance = DepositAmt;
		this.Rate = Rate;
		
		index++;
		
		this.AccountNumber= AccountNumber();
		//System.out.println("Account nos: "+AccountNumber());
		setRate();
		
	}//Constructor
	
	//
	public abstract void setRate(); 
	
	
	//
	public void Deposit(double Credit) {
		
		Balance = Balance + Credit;
		System.out.println("\nAMOUNT CREDITED: "+Credit);
		System.out.println("BALANCE: "+Balance);
	
	}
	//
	public void Withdraw(double Debit) {
		
		Balance = Balance - Debit;
		System.out.println("\nAMOUNT DEBITED: "+Debit);
		System.out.println("BALANCE: "+Balance);
	
	}
	//
	public void TransferAmt(double TransferAmt, String WhereTo) {
		
		Balance = Balance - TransferAmt;
		System.out.println("\nAMOUNT TRANSFER: "+TransferAmt+"TO: "+WhereTo);
		System.out.println("BALANCE: "+Balance);
	
	}
	
	//
	public void CompoundInterest() {
		
		double compinterest = Balance*(Rate/100);
		Balance = Balance + compinterest;
		System.out.println("INTEREST AMOUNT: "+compinterest);
		System.out.println("BALANCE AMOUNT: "+Balance);
	}
	
	//
	public String AccountNumber() {
		
		String lasttwosSN = sSN.substring(sSN.length()-2, sSN.length());
		int randnumber =(int) (Math.random()*Math.pow(10, 3));
		int UniqueNumber = index;
		
		
		//System.out.println("The number is "+lasttwosSN+UniqueNumber+randnumber);
		
		 return lasttwosSN+UniqueNumber+randnumber;
	}

		
		
	
	
	
	//
	public void showinfo() {
		
		System.out.println("\nACCOUNT TYPE: "+AccountType
				+"\nCUSTOMER NAME: "+name
				+"\nACCOUNT sSN: "+sSN
				+"\nACCOUNT NUMBER: "+AccountNumber
				+"\nBALANCE AMOUNT: "+Balance
				+"\nINTEREST RATE: "+Rate
				
				);
	}

}//class
