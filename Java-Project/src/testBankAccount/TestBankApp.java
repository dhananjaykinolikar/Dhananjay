package testBankAccount;

import java.util.LinkedList;
import java.util.List;

import bankaccountapp.Saving;

public class TestBankApp {

	public static void main(String[] args) {
		
		//TestSaving sav1 = new TestSaving("Smith Carter","233920189","Savings",2000);
		//sav1.CompoundInterest();
		//sav1.SafetyDepositBox();
		//TestChecking check1 = new TestChecking("Will Roger","123410189","Checking",3000);
		//check1.CompoundInterest();
		//check1.Debitcardinfo();
		
		//sav1.Deposit(2000);
		//sav1.Withdraw(1000);
		//sav1.TransferAmt(500, "Kotak Account");
		
		
		List<TestAccount> accountnum = new LinkedList<TestAccount>();

		String file = "F:\\Selenium\\Selenium 28-03-2020\\Mars Projects\\Java-Project\\File\\NewBankAccounts.csv";

		List<String[]> newaccountholder = utilities.CSV.read(file);

		for (String[] accountholder : newaccountholder) {

			String name = accountholder[0];
			String sSN = accountholder[1];
			String AccountType = accountholder[2];
			double DepositAmt = Double.parseDouble(accountholder[3]);

			if (AccountType.equals("Savings")) {
				//System.out.println("Create Saving Account");
				accountnum.add(new TestSaving(name, sSN, AccountType,DepositAmt));
			} else if (AccountType.equals("Checking")) {
				//System.out.println("\nCreate Checking Account");
				accountnum.add(new TestChecking(name, sSN, AccountType,DepositAmt));
			} else {

				System.out.println("error");
			}
		}
		
		for (TestAccount Account:accountnum) {
			
			System.out.println("\n******************");
			Account.showinfo();
			
		}

	}//main
	

}//class


