package hw2;

/**
 * 
 * Java 8.0 API. 
 * @author: Suneuy Kim
 */

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AtmTester
{
        public static void main(String [] args) throws FileNotFoundException
        {
        	
        	
        	
        		BankSystem.loadAccounts();
                Scanner sc = new Scanner(System.in);
                
                
                
                authorizationDialog(sc);
                
                

                
         }
        
        public static void authorizationDialog(Scanner sc)
        { System.out.print("Please select an ATM [1] [2] [3] [4]");
        	while (sc.hasNextLine())
                {
                        String input = sc.nextLine();
                        
         
                    	
                        if (input.equals("1")||input.equals("2"))//bankA
                        {
                        	   System.out.println("Please enter card number:");
                        	   String cardNumberInput = sc.nextLine();
                        	if (BankSystem.checkBankA(cardNumberInput).equals(null))
                        	{
                        		System.out.println("This bank does not have this card account.");
                        		authorizationDialog(sc);
                        	}
                        	else
                        	{
                        		Account a = BankSystem.checkBankB(cardNumberInput);
                        		ATMSystem.verification(a);
                        		if(ATMSystem.checkExpDate()==false)
                        			{
                        				System.out.println("The card is expired. Please use another card.");
                        				authorizationDialog(sc);
                        			}
                        		System.out.println("Please enter password [4 digit pincode]");
                        		input = sc.nextLine();
                        		if(ATMSystem.checkPassword(input)==false)
                        			{
                        				System.out.println("The password is wrong.");
                        				authorizationDialog(sc);
                        			}
                        	}
                        	
                        }
                        else if (input.equals("3") || input.equals("4")) //bankB
                        {
                        	  System.out.println("Please enter card number:");
                       	   String cardNumberInput = sc.nextLine();
                       	if (BankSystem.checkBankB(cardNumberInput).equals(null))
                       	{
                       		System.out.println("This bank does not have this card account.");
                       		authorizationDialog(sc);
                       	}
                       	else
                       	{
                       		Account a = BankSystem.checkBankB(cardNumberInput);
                       		ATMSystem.verification(a);
                       		if(ATMSystem.checkExpDate()==false)
                       			{
                       				System.out.println("The card is expired. Please use another card.");
                       				authorizationDialog(sc);
                       			}
                       		System.out.println("Please enter password [4 digit pincode]");
                       		input = sc.nextLine();
                       		if(ATMSystem.checkPassword(input)==false)
                       			{
                       				System.out.println("The password is wrong.");
                       				authorizationDialog(sc);
                       			}
                       	}
                        }
                        else
                        {
                        	System.out.println("There is no ATM with that name.");
                        	authorizationDialog(sc);
                        }
                        transactionDialog(sc);
                }
        	//transactionDialog(sc);
        }
        
        public static void transactionDialog(Scanner sc)
        {
        	while(sc.hasNextLine())
        	{
        		System.out.println("Please enter amount to withdrawal:");
        		String input = sc.nextLine();
        		int withdrawal = Integer.parseInt(input);
        		if (ATMSystem.checkAmount(withdrawal)==false)
        		{
        			System.out.println("The requested amount is more than ATM's maximum withdrawal amount.");
        			transactionDialog(sc);
        		}
        		System.out.println("Withdrawal request accepted. The machine will now return your card and your requested amount of "+ input);
        	}
        }
        
}
       
        
        


