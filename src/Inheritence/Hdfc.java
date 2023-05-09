package Inheritence;

public class Hdfc extends Bank
{

	int amount;
	public Hdfc()
	{
		
	}
	public Hdfc(int accno, String Customername, int amount)
	{
		super(accno, Customername);
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Hdfc [amount=" + amount + "]";
	}
	
	
	
	
}
