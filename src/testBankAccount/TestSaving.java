package testBankAccount;

public class TestSaving extends TestAccount {
	
	private int safetydepositboxid;
	private int safetydepositboxkey;
	
	public TestSaving(String name, String sSN,String AccountType, double DepositAmt) {
		
		super(name,sSN,AccountType,DepositAmt);
		
		AccountNumber = "1"+AccountNumber;
		showinfo();
		//System.out.println("sav Account nos: "+AccountNumber);
	}
	
	@Override
	public void setRate() {
		
		Rate = BaseRate()*.15;
		
	}
	
	//
	public void SafetyDepositBox() {
		
		safetydepositboxid = (int) (Math.random()*Math.pow(10, 4));
		safetydepositboxkey = (int) (Math.random()*Math.pow(10, 3));
		
		System.out.println("\nSAVING ACCOUNT FEATURES:"
				+"\nSAFETYDEPOSITBOXID: "+safetydepositboxid
				+"\nSAFETYDEPOSITBOXKEY: "+safetydepositboxkey);
		
		
	}
	

}
