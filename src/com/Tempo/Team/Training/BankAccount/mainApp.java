package com.Tempo.Team.Training.BankAccount;

public class mainApp {
	
	public static void main(String[] args) throws Throwable {
		BankManagementDataBase ab= new BankManagementDataBase();
		System.out.println(ab.printMe());
		ab.ResetAllcusomer();
		System.out.println(ab.printMe());
        AccountDataBase we= new AccountDataBase(200);
        System.out.println(" Accountnr \t\t\tbalance  \tbalance +deposit" 
        +" "+" Withdraw" +"\t Firstname" + "\t Lastname");
       System.out.println( we.printMe());
       we.ResetAllAccounts();
       System.out.println( we.printMe());
	}

}
