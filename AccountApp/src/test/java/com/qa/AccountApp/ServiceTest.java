package com.qa.AccountApp;

import org.junit.Assert;
import org.junit.Test;

import com.qa.accountapp.Account;
import com.qa.accountapp.Service;



public class ServiceTest {
	
	
	@Test
	public void searchAccountTest() {
		Service newService = new Service();
		
		Account account = new Account("Lalita", "Chopra", 1234);
		newService.addAccount(account);
	
		int actual = newService.getOccurencesOfFirstNameInAccountMap("Lalita");
		System.out.println(actual);
		Assert.assertEquals(1, actual);
	}
	
}
