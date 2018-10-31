package com.qa.accountapp;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.accountapp.*;

public class App 
{
	
	private App() {}
    public static void main( String[] args )
    {
    	
    	Service newService = new Service();
    	
       Account account1 = new Account("Lalita", "Chopra", 1234);
       Account account3 = new Account("John", "Day", 12444);
       Account account4 = new Account("Lilly", "Rose", 123435);
       Account account5 = new Account("Lalita", "Chopra", 1234);
       Account account6 = new Account("Lalita", "Chopra", 1234);
       
       newService.addAccount(account1);
       newService.addAccount(account3);
       newService.addAccount(account4);
       newService.addAccount(account5);
       newService.addAccount(account6);
       
      System.out.println( newService.getAllAccounts());
      System.out.println(newService.retrieveAccount(12444) );
    
       ObjectMapper mapper = new ObjectMapper();
       try {

          System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(newService.getAllAccounts()));
       } catch (Exception e) {
           e.printStackTrace();
       }
    
    }
}
