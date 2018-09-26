package hw2;
import java.util.*;
import java.time.LocalDate;
import java.lang.Integer; 

public class ATMSystem {
	public static Account acc;
	
	
	public static void verification(Account a)
	{
		acc = a;
		
	}
	public static boolean checkExpDate()
	{
		String expDate = acc.getExpDate();
		String[] split = expDate.split("/");
		int month = Integer.parseInt(split[0]);
		int year =  Integer.parseInt(split[1]);
		
		
		LocalDate c = LocalDate.now();
		int m = c.getMonthValue();
		int y = c.getYear();
		
		if (Integer.compare(year, y)==-1)
		{
			return false;
		}
		else if (Integer.compare(year, y) == 0)
		{
			if(Integer.compare(month, m)==-1)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkPassword(String password)
	{
		String pw = acc.getPassword();
		if (pw.compareTo(password)!=0)
		{
			return false;
		}
		return true;
	}
	
	public static boolean checkAmount(Integer amount)
	{
		int availMoney = BankSystem.getMoneyInBank();
		if(Integer.compare(amount, availMoney) == 1)//amount higher
		{
			return false;
		}
		BankSystem.withdraw(amount);
		
		return true;
	}
	
	
	

}
