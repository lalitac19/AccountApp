package com.qa.AccountApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Service {
	HashMap <Integer, Account> accounts = new HashMap <Integer, Account>();
	
	public void addAccount(Account newAccount) {
		accounts.put(newAccount.getAccountNumber(), newAccount); 
	}
	
	
	public Account retrieveAccount(int accountNo) {
		
		return accounts.get(accountNo);
	}
	
	public void printAccounts() {
		Set set = accounts.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
		
	}
	
	
}
