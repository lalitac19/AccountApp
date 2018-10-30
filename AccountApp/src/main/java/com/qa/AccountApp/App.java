package com.qa.AccountApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Service newService = new Service();
    	
       Account account1 = new Account("Lalita", "Chopra", 1234);
       Account account3 = new Account("John", "Day", 12444);
       Account account4 = new Account("Lilly", "Rose", 123435);
       
       newService.addAccount(account1);
       newService.addAccount(account3);
       newService.addAccount(account4);
       
      // newService.printAccounts();
       System.out.println(newService.retrieveAccount(12444) );
    }
}
