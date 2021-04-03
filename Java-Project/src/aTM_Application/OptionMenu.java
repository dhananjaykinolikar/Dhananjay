package aTM_Application;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	/*  Validate customer number and pin number */
	
	public void getLogin() throws IOException {
		
		int x=1;
		
		do {
			try{
			
				data.put(12121212, 1234);
				data.put(98989898, 5678);
				
				System.out.println("Welcome to ATM Project");
				System.out.print("Enter Your Customer Nos.: ");
				setCustomerNumber(menuInput.nextInt());
				System.out.print("Enter Your Pin Nos.: ");
				setPinNumber(menuInput.nextInt());
				
			}catch (Exception e) {
			
			System.out.println("\n"+ "Invalid Charactor(s). Only Numbers."+"\n");
			x=2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				
				if(entry.getKey()== getCustomerNumber() && entry.getValue()== getPinNumber())
					getAccountType();
			}
			System.out.println("\n"+"Wrong Customer NUmber or Pin Number"+"\n");
			
		}while(x==1);
		
	}//getlogin
	
		/* Display Account Type Menu with Selection */
		
		public void getAccountType() {
			
			System.out.println("Select the Account you want to access: ");
			System.out.println("Type-1 Checking Account");
			System.out.println("Type-2 Saving Account");
			System.out.println("Type-3 Exit");
			System.out.print("Choice: ");
			
			selection = menuInput.nextInt();
			
			switch(selection) {
			
			case 1:
				
				getChecking();
				break;
				
			case 2:
				
				getSaving();
				break;
				
			case 3:
				System.out.println("Thankyou using ATM application, bye");
				break;
				
			default :
				System.out.println("/n"+ "Invalid Account Type"+ "/n");
				getAccountType();			
				
			}
		}//getAccountType
			
			/* Display CheckingAccount Menu */
			
			public void getChecking() {
				
				System.out.println("Checking Account: ");
				System.out.println("Type-1 View Balance");
				System.out.println("Type-2 Withdraw Amount");
				System.out.println("Type-3 Deposit Amount");
				System.out.println("Type-4 Exit");
				System.out.print("Choice: ");
				
				selection = menuInput.nextInt();
				
				switch(selection) {
				
				case 1:
					System.out.println("Checking Account Balance: "+moneyformat.format(checkingbalance));
					getAccountType();
					break;
					
				case 2:
					getCheckingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					
					getCheckingDepositInput();
				    getAccountType();
					break;
					
				case 4:
					
					System.out.println("Thankyou for Using ATM, bye");
					break;
					
				default:
					System.out.println("\n"+ "Invalid Account Type"+ "\n");
					getChecking();
					
				}
	
			}//getChecking
			
/* Display CheckingAccount Menu */
			
			public void getSaving() {
				
				System.out.println("Saving Account: ");
				System.out.println("Type-1 View Balance");
				System.out.println("Type-2 Withdraw Amount");
				System.out.println("Type-3 Deposit Amount");
				System.out.println("Type-4 Exit");
				System.out.print("Choice: ");
				
				selection = menuInput.nextInt();
				
				switch(selection) {
				
				case 1:
					System.out.println("Checking Account Balance: "+moneyformat.format(savingbalance));
					//getAccountType();
					getSaving();
					break;
					
				case 2:
					getSavingWithdrawInput();
					//getAccountType();
					getSaving();
					break;
					
				case 3:
					
					getSavingDepositInput();
					//getAccountType();
					getSaving();
					break;
					
				case 4:
					
					System.out.println("Thankyou for Using ATM, bye");
					break;
					
				default:
					System.out.println("/n"+ "Invalid Account Type"+ "/n");
					getSaving();
					
				}
					
			}//getChecking
			
		
		int selection;
		
	

}
