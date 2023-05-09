package DefaultConstructor;

public class Product {
	private int productid;
	private  String productname;
    private  int nooforders;
    static int idgen=1001;
    public Product()
    {
    	productid=idgen++;
    }
    public Product(String productname,int nooforders)
    {
    	this();  //default constructor
    	this.productname=productname;
    	this.nooforders=nooforders;
    }
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}
	public static int getIdgen() {
		return idgen;
	}
	public static void setIdgen(int idgen) {
		Product.idgen = idgen;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", nooforders=" + nooforders + "]";
	}
    
    

}
