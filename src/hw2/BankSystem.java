package hw2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class BankSystem {
	public static ArrayList<Account> bankAList = new ArrayList<Account>();
	public static ArrayList<Account> bankBList = new ArrayList<Account>();
	
	public BankSystem()
	{
		
	}
	
	public static void loadAccounts() throws FileNotFoundException
	{
		File file = new File("aCustomerCardList.txt");
		System.out.println(file.getAbsolutePath());
		Scanner fin = new Scanner(file);
		while(fin.hasNext())
		{
			String line = fin.nextLine();
			if(line.equals("A"))
			{
				Account acc = new Account(fin.nextLine(),fin.nextLine(),fin.nextLine());
				bankAList.add(acc);
			}
			else if(line.equals("B"))
			{
				Account acc = new Account(fin.nextLine(),fin.nextLine(),fin.nextLine());
				bankBList.add(acc);
			}
		}
		fin.close();
	}
	
	
	public static Account loadBankA(String cardNum)
	{
		while (!bankAList.isEmpty())
		{
			for(int i = 0; i<bankAList.size(); i++)
			{
				String id = bankAList.get(i).getBankID();
				if (cardNum.equals(id))
				{
					return bankAList.get(i);
				}
			}
			
		}
		return null;
	}






}



