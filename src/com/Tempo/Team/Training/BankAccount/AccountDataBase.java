package com.Tempo.Team.Training.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountDataBase {
static List <Account>accounts = new ArrayList<Account>();

public AccountDataBase() throws Throwable {
	int numberOfAccounts = 10;
	BuildAccountbase(numberOfAccounts);
}

public AccountDataBase(int numberOfAccounts) throws Throwable {
	
	BuildAccountbase(numberOfAccounts);
}

public static void BuildAccountbase(int numberOfAccounts) throws Throwable {
	for (int i= 0; i<numberOfAccounts; i++) {
		accounts.add(AccountFactory.getAccount());
	}
	
}
public List<Account> getAccounts() {
	return AccountDataBase.accounts;
}

	


public void addAccount(Account account) {
	AccountDataBase.accounts.add(account);
}
public String printMe() {
	 String mystring = "";
	 for (int i = 0; i< accounts.size(); i++) {
		 mystring += " "+ (i +1)+ " "+ accounts.get(i).toString();
	 }
	 return mystring ;
}
public void ResetAllAccounts() {
	 AccountDataBase.accounts= new ArrayList<>();
}
}
