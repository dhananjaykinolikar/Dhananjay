package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
//		Saving savi1 = new Saving("Sam.Smith","123456789",1500);
//		Checking check1= new Checking("William.Roger","223456789",2500);
//		
//		savi1.showinfo();
//		savi1.compundinterest();
//		savi1.deposit(5000);
//		savi1.withdraw(500);
//		savi1.transfer(2000, "Kotak account");
//		
//		System.out.println("**************");
//		check1.showinfo();
//		
		List<Account> acc = new LinkedList<Account>();

		String file = "F:\\Selenium\\Selenium 28-03-2020\\Mars Projects\\Java-Project\\File\\NewBankAccounts.csv";

		List<String[]> newaccountholder = utilities.CSV.read(file);

		for (String[] accountholder : newaccountholder) {

			String name = accountholder[0];
			String Accountnumber = accountholder[1];
			String AccountType = accountholder[2];
			double Deposit = Double.parseDouble(accountholder[3]);

			if (AccountType.equals("Savings")) {
				acc.add(new Saving(name, Accountnumber, Deposit));
				// System.out.println("Create Savings Account");
				// System.out.println(name+","+Accountnumber+","+AccountType+","+Deposit);
			} else if (AccountType.equals("Checking")) {
				acc.add(new Checking(name, Accountnumber, Deposit));
				// System.out.println("Create Checking Account");
				// System.out.println(name+","+Accountnumber+","+AccountType+","+Deposit);
			} else {
				System.out.println("Error");
			}

		}
		// acc.get(0).showinfo();

		for (Account accounts : acc) {
			System.out.println("\n******************");
			accounts.showinfo();
		}
		

	}

}
