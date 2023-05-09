package abstraction;

public class WBill implements WaterBill{
	private int billno;
	private int nooflitre;
	private int costperlitre;
	public WBill()
	{
		
	}
	public WBill(int billno,int nooflitre,int costperlitre)
	{
		super();
		this.billno=billno;
		this.nooflitre=nooflitre;
		this.costperlitre=costperlitre;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getNooflitre() {
		return nooflitre;
	}
	public void setNooflitre(int nooflitre) {
		this.nooflitre = nooflitre;
	}
	public int getCostperlitre() {
		return costperlitre;
	}
	public void setCostperlitre(int costperlitre) {
		this.costperlitre = costperlitre;
	}
	public double calbill() {
		// TODO Auto-generated method stub
		return  nooflitre*costperlitre;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The WBill is="+calbill());
	}
	@Override
	public String toString() {
		return "WBill [billno=" + billno + ", nooflitre=" + nooflitre + ", costperlitre=" + costperlitre + "]";
	}
	
	

}
