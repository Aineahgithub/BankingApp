package com.Tempo.Team.Training.BankAccount;

import java.text.DecimalFormat;

public class Account {
	
	private int id;
	private double balance ;
	private Customer customer;
	static DecimalFormat mk = new DecimalFormat("0.00");
	public String getAccountnr() {
		return AccountFactory.getRandomAccountnr();
	}


	public Account(double balance, String Accountnr, String string, double d) {}
	
	
	public Account(int id, double balance, Customer customer) {
	
		this.id = id;
		this.balance =AccountFactory.getRandomBalance();
		this.customer = customer;
		
	}
	public String getWithdraw() throws Throwable {
		return AccountFactory.getRandomWithdraw();
	}


	


	public double getDeposit() {
		return AccountFactory.getRandomDeposit();
	}


	

	
	  public String toString () { String mystring = "" +
	  AccountFactory.getRandomAccountnr() + "\t" +
	  mk.format(AccountFactory.getRandomBalance()) +" €" + "\t  "+
	  mk.format(AccountFactory.getRandomDeposit()) +" €"+ "\t " ;
	 try {
	 mystring+= AccountFactory.getRandomWithdraws();
	 }
		
		 catch (Throwable e) {
			
			e.printStackTrace();
			System.err.println("error"+e);
		}
	 mystring += " €"+ "\t" +
	  CustomerFactory.getRandomfirstName() + "\t \t"+
	  CustomerFactory.getRandomlastName()+"\n" ; return mystring; }
	 
	
	 

}
