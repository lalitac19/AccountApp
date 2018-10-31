package com.qa.accountapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int accountNumber;
	
	@Column(length = 30)
	private String firstName;
	@Column(length = 30)
	private String lastName;




public Account(String fName, String lName, int accNum) {
	this.setFirstName(fName);
	this.setLastName(lName);
	this.setAccountNumber(accNum);
}


public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

@Override
public String toString() {
	return "Account Number: " + this.getAccountNumber() + " " +
			"First Name: " + this.getFirstName() + " " + 
			"Last Name: " + this.getLastName();
}


}
