package com.Tempo.Team.Training.BankAccount;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private static List<Account>accounts= new ArrayList<>();
	private String Adress;
	
	static DecimalFormat my = new DecimalFormat("0.00");

	public Customer(String randomlastName, String randomAccounts, String randomfirstName) {
		
	}
	public static List<Account> BuildAccountbase(int numberOfAccounts) throws Throwable {
		for (int i= 0; i< numberOfAccounts;i++ ) {
			accounts.add(AccountFactory.getAccount());
		}
		return accounts;
		
	}
	
	@Override
	public String toString() {
		
		//String mystring = "firstName : " + "\t lastName\n" +
		String mystring = "";
				mystring += CustomerFactory.getRandomfirstName() +"\t\t ";
				mystring += CustomerFactory.getRandomlastName()  + "\t\t\t ";
				try {
					mystring +=  BuildAccountbase(1)+"\t \n";
				} catch (Throwable e) {
					
					e.printStackTrace();
				}
		return mystring;
	}
	
	
	public void ResetAllccounts(List<Account> accounts) {
		Customer.accounts = new ArrayList<Account>();
	}


}
