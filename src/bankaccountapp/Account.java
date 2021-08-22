package bankaccountapp;

public abstract class  Account implements  IRate {
	
	private String Name;
	private String sSN;
	private double Balance;
	private static int index =10000;
	
	protected String AccountNumber;
	protected double rate;
	
	
	public Account(String name,String sSN, double Balance) {
		
		this.Name=name;
		this.sSN=sSN;
		this.Balance=Balance;
		
		
	index++;
	this.AccountNumber = setAccountNumber();
	
	setRate();
	
	}//
	
	//List of common method. Transaction
	public void deposit(double amount) {
		Balance= Balance + amount;
		System.out.println("\nAMOUNT CREDITED: "+amount);
		printbalance();
	}
	
	public void withdraw(double amount) {
		Balance= Balance - amount;
		System.out.println("\nAMOUNT DEBITED: "+amount);
		printbalance();
	}
	
	public void transfer(double amount, String towhere) {
		Balance= Balance - amount;
		System.out.println("\n"+amount+" AMOUNT TRANSFERED TO: "+towhere);
		printbalance();
	}
	
	public void printbalance() {
		System.out.println("TOTAL BALANCE: "+Balance);
	}
	
	
	
	
	public abstract void setRate();
		
	public void compundinterest(){
	
		double accuredinterest = Balance* (rate/100);
		Balance = Balance + accuredinterest;
		
		System.out.println("\nCOMPOUND INTEREST: "+accuredinterest);
		System.out.println("BALANCE AFTER INTEREST: "+Balance);
		
	}
	private String setAccountNumber() {
	
		String  lasttwosSN = sSN.substring(sSN.length()-2, sSN.length());
		int UniqueNumber = index;
		int randnumber = (int) (Math.random()*Math.pow(10,3));
		
		return lasttwosSN+index+randnumber;
	}
	
	public void showinfo() {
		System.out.println("NAME: "+Name
				+ "\nSECURITY NUMBER: "+sSN
				+"\nACCOUNT NUMBER: "+AccountNumber
				+ "\nBALANCE:"+Balance
				+"\nRATE: "+rate+"%"
				
				);
	
	}
}
