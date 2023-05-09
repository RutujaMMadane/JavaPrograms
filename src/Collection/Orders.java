package Collection;

public class Orders {
	private int orderid;
	private int noofproducts;
	private int nooforders;
	public Orders()
	{
		
	}
	public Orders(int orderid, int noofproducts, int nooforders) {
		super();
		this.orderid = orderid;
		this.noofproducts = noofproducts;
		this.nooforders = nooforders;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	public void setNoofproducts(int noofproducts) {
		this.noofproducts = noofproducts;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", noofproducts=" + noofproducts + ", nooforders=" + nooforders + "]";
	}
	
}
