package hw2;


public class Account {
public static String bankID;
public static String expirationDate;
public static String password;


public Account(String bankNum, String expDate, String pw)
{
	this.bankID = bankNum;
	this.expirationDate = expDate;
	this.password = pw;
}

public  String getBankID()
{
	return this.bankID;
}

public  String getPassword()
{
	return this.password;
}

public  String expirationDate()
{
	return this.expirationDate;
}






}
