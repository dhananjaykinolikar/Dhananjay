package aTM_Application;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	
	Scanner Input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");
	
	/* Set The Customer Number */
	
	public int setCustomerNumber(int CustomerNumber) {
		
		this.CustomerNumber = CustomerNumber;
		
		return CustomerNumber;
	}
	
	public int getCustomerNumber() {

		return CustomerNumber;
	}
	
	
	/* set the Pin Number */
	
	public int setPinNumber(int PinNumber) {

		this.PinNumber = PinNumber;
		
		return PinNumber;
	}
	
	public int getPinNumber() {
			
		return PinNumber;
	}
	
	
	public double getCheckingBalance() {
	
		return checkingbalance;
		
	}
	
	public double getSavingBalance() {
		
		return savingbalance;
		
	}
	
	/* Calculate checking account  withdrawal */
	
	public double calcCheckingWithdraw(double amount) {
		
		checkingbalance =  (checkingbalance-amount);
		
		return checkingbalance;
	}
	
	/* Calculate Saving account  withdrawal */
	
	public double calcSavingWithdraw(double amount) {
		
		savingbalance =  (savingbalance-amount);
		
		return savingbalance;
	}
	
	/* Calculate checking account  withdrawal */
	
	public double calccheckingDeposit(double amount) {
		
		checkingbalance =  (checkingbalance+amount);
		
		return checkingbalance;
	}
	
	/* Calculate Saving account  withdrawal */
	
	public double calcsavingDeposit(double amount) {
		
		savingbalance =  (savingbalance + amount);
		
		return savingbalance;
	}
	
	
	public void getCheckingWithdrawInput() {
	
		System.out.println(" Checking Account balance"+ moneyformat.format(checkingbalance));
		
		System.out.print("Amount you want to withdraw from checkingAccount: ");
		
		double amount = Input.nextInt();
		
		if((checkingbalance - amount)>=0) {
			
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Balance Amount: "+ moneyformat.format(checkingbalance));
			
		} else {
			System.out.println("Balance cannot be negative: "+"\n");
			
		}
		
	}//
	
	public void getSavingWithdrawInput() {
		
		System.out.println(" Saving Account balance"+ moneyformat.format(savingbalance));
		
		System.out.print("Amount you want to withdraw from savingAccount: ");
		
		double amount = Input.nextInt();
		
		if((savingbalance - amount)>=0) {
			
			calcSavingWithdraw(amount);
			System.out.println("New Saving Balance Amount: "+ savingbalance+ "\n");
			
		} else {
			System.out.println("Balance cannot be negative: "+"\n");
			
		}
		
	}//
	
	public void getCheckingDepositInput() {
		
		System.out.println(" Checking Account balance"+ moneyformat.format(checkingbalance));
		
		System.out.print("Amount you want to Deposit from checkingAccount: ");
		
		double amount = Input.nextInt();
		
		if((checkingbalance + amount)>=0) {
			
			calccheckingDeposit(amount);
			System.out.println("New Checking Balance Amount: "+ moneyformat.format(checkingbalance));
			
		} else {
			System.out.println("Balance cannot be negative: "+"\n");
			
		}
		
	}//
	
	public void getSavingDepositInput() {
		
		System.out.println(" Saving Account balance"+ moneyformat.format(savingbalance));
		
		System.out.print("Amount you want to Deposit from savingAccount: ");
		
		double amount = Input.nextInt();
		
		if((checkingbalance + amount)>=0) {
			
			calcsavingDeposit(amount);
			System.out.println("New Saving Balance Amount: "+ moneyformat.format(savingbalance));
			
		} else {
			System.out.println("Balance cannot be negative: "+"\n");
			
		}
		
	}//
	
	private int CustomerNumber;
	private int PinNumber;
	
	protected double checkingbalance=0;
	protected double savingbalance=0;
	
	
	
	
}//Account
