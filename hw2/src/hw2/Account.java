package hw2;


public class Account {
public static String bankID;
public static String expirationDate;
public static String password;
public static String moneyAmount;


public Account(String bankNum, String expDate, String pw, String amount)
{
	this.bankID = bankNum;
	expirationDate = expDate;
	password = pw;
	moneyAmount = amount;
	
}

public String getBankID()
{
	return bankID;
}

public static String getPassword()
{
	return password;
}

public static String getExpDate()
{
	return expirationDate;
}

public static String getAmount()
{
	return moneyAmount;
}






}
