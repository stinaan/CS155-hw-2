package hw2;


public class Account {
public String bankID;
public String expirationDate;
public String password;
public String moneyAmount;


public Account(String bankNum, String expDate, String pw, String amount)
{
	this.bankID = bankNum;
	this.expirationDate = expDate;
	this.password = pw;
	this.moneyAmount = amount;
	
}

public String getBankID()
{
	return bankID;
}

public  String getPassword()
{
	return password;
}

public  String getExpDate()
{
	return expirationDate;
}

public  String getAmount()
{
	return moneyAmount;
}






}
