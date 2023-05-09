package Inheritence;

public class HDFCPune extends Hdfc{
	public HDFCPune()
	{
		
	}
	public HDFCPune(int accno,String customername,int amount)
	{
		super(accno,customername,amount);
	}
	public String deposit()
	{
		int dp=amount+3000;
		return "The Deposit()="+deposit()+"]";
	}

}
