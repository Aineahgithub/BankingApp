package com.Tempo.Team.Training.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankManagementDataBase {
	private static List<Customer>customers = new ArrayList<Customer>();
	
	public BankManagementDataBase() {
		int numberOfCustomers =3;
		BuildCustomerbase(numberOfCustomers);
	}
	
	public BankManagementDataBase(int numberOfCustomers) {
	
		BuildCustomerbase(numberOfCustomers);
	}
	public static void  BuildCustomerbase(int numberOfCustomers) {
		for(int i= 0; i< numberOfCustomers; i++) {
			customers.add(CustomerFactory.getCustomer());
		}
		
	}

	public List<Customer> getCustomers() {
		return BankManagementDataBase.customers;
	}
	
		


	public void addCustomer(Customer customer) {
		BankManagementDataBase.customers.add(customer);
	}
 public String printMe() {
	 String mystring = "";
	 for (int i = 0; i< customers.size(); i++) {
		 mystring += " "+ (i +1)+ " "+ customers.get(i).toString();
	 }
	 return mystring ;
 }
 public void ResetAllcusomer() {
	 BankManagementDataBase.customers= new ArrayList<>();
 }
	

}
