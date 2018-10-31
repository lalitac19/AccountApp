package com.qa.AccountApp;

import org.junit.Assert;
import org.junit.Test;

import com.qa.accountapp.Service;



public class ServiceTest {

	
	@Test
	public void searchAccountTest() {
		Service service = new Service();
		int actual = service.getOccurencesOfFirstNameInAccountMap("john");
		Assert.assertEquals(2, actual);
	}
	
}
