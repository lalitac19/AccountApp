package com.qa.accountapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Service {
	HashMap <Integer, Account> accounts = new HashMap <>();

	
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
	
	public HashMap<Integer, Account> getAllAccounts(){
		return accounts; 
	}


	public int getOccurencesOfFirstNameInAccountMap(String firstName) {
		/*without streams
		 * int count =0;
		for (Account account : accounts.values()) {
			if (account.getFirstName().equals(firstName)){
				count +=1;
			}
		}
		return count;*/
		
		//with streams
		return (int) accounts.values().stream().filter(a -> a.getFirstName().equals(firstName)) .count();
	}
	
	
	
	
}
