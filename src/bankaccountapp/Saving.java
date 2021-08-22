package bankaccountapp;

public class Saving extends Account {
	
	private int safetydepositboxid;
	private int safetydepositboxkey;
	
	public Saving(String name,String sSN, double Balance) {
		
		
		super(name,sSN,Balance);
		AccountNumber = "1"+AccountNumber;
		


	}
	@Override
	public  void setRate() {
		
		rate = getBaseRate()-.25;
	}
	
	public void showinfo()	{
		System.out.println("ACCOUNT TYPE: SAVING");
		super.showinfo();
		safetydepositboxID();
		
	}
	

	public void safetydepositboxID() {
		
		safetydepositboxid = (int)(Math.random()*Math.pow(10,3));
		safetydepositboxkey = (int)(Math.random()*Math.pow(10,4));
		System.out.println(
				"\nSAVING ACCOUNT FEATURE"+
				 "\nSAFETYDEPOSITBOXID: "+safetydepositboxid
				+"\nSAFETYDEPOSITBOXKEY: "+safetydepositboxkey
				
				);
	}
}
