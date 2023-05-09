package Inheritence;

public class Bank {
	int accno;
	String customername;
	public Bank()
	{
		
	}
	public Bank(int accno, String customername)
	{
		super();
		this.accno=accno;
		this.customername=customername;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String toString() {
		return "Bank [getAccno()=" + getAccno() + ", getCustomername()=" + getCustomername() + "]";
	}
	

}

