package com.qa.AccountApp;

public class Account {
private String firstName;
private String lastName;
private int accountNumber;

public Account() {
	
}

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
