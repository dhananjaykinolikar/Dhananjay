package javaBankApplication;

import java.util.Scanner;

public class JavaBankApplication {

	public static void main(String[] args) {
		
		
		Account acc =new Account("Harnoor Singh",123456789);
		acc.showinfo();

	}
}
	
	class Account {
	

	public int amount;
	public double Balance;
	public double PreviousDepositAmount;
	public String CustomerName;
	public int  CustomerID;

	public  Account(String CustomerName, int CustomerID) {

		this.CustomerName = CustomerName;
		this.CustomerID = CustomerID;

	}// constructor

	public void deposit(int amount) {

		if (amount != 0) {

			Balance = Balance + amount;

			PreviousDepositAmount = amount;

		}

	}

	public void witndraw(int amount) {

		if (amount != 0) {

			Balance = Balance - amount;

			PreviousDepositAmount = -amount;

		}

	}

	public void PreviewTransaction() {

		if (PreviousDepositAmount > 0) {

			System.out.println("PREVIOUS TRANSACTION IS DEPOSIT Rs " + PreviousDepositAmount);

		} else if (PreviousDepositAmount < 0) {

			System.out.println("\nPREVIOUS TRANSACTION IS WITHDRAW Rs " + Math.abs(PreviousDepositAmount));
		}

	}

	public void showinfo() {
		
			char option ='\0';
		
			Scanner in =new Scanner(System.in);
			
			
			
		System.out.println("Welocme Customer: "+CustomerName
				+"Customer Account Number"+CustomerID
				);
		
		System.out.println("\nSELECT THE BELOW OPTION"
				+"\nA: CHECK BALANCE"
				+"\nB DEPOSIT AMOUNT"
				+"\nC WITHDRAW AMOUNT"
				+"\nD PREVIEW BAANCE"
				+"\nE EXIT");
		
		do {
			
			System.out.println("\n****************");
			System.out.print("Enter Option: ");
			option = in.next().charAt(0);
			System.out.println("****************");
			System.out.println("\n");
			
			switch(option){
				
				case 'A':
				System.out.println("****************"+"\nBALANCE is: "+Balance+"\n****************");
				break;
				
				case 'B':
				System.out.println("\n****************");	
				System.out.print("ENTER AMOUNT TO DEPOSIT: Rs ");	
				 amount = in.nextInt();
				deposit(amount);
				System.out.println("\n****************"+"\nBALANCE AFTER DEPOSIT: Rs "+Balance+"\n****************");
				break;
				
				case 'C':
					System.out.println("\n****************");	
					System.out.print("ENTER AMOUNT TO WITHDRAW: Rs ");	
					amount = in.nextInt();
					witndraw(amount);
					System.out.println("\n****************"+"\nBALANCE AFTER WITHDRAW: Rs "+Balance+"\n****************");
					break;
					
				case 'D':
					System.out.println("****************");	
					PreviewTransaction();
					break;
				
				case 'E':
					System.out.print("EXIT");	
					
					break;
					
				default:
					System.out.println("INVALID OPTION! PLEASE SELECT CORRECT OPTION");
					break;
	
			}
			
		}while(option != 'E');
			System.out.println("\nTHANKYOU! FOR USING APPLICATION");
		
	}

	private boolean lowercase(char c) {
		// TODO Auto-generated method stub
		return false;
	}
	
}//class
