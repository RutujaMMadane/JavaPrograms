package ExceptionHandling;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(11,"chair",23.0f);
		Product p2=new Product(121,"chair",223.0f);
		Product p3=new Product(131,"chair",413.0f);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		calculateWeight(p1);
		

	}
	public static void calculateWeight(Product p)
	{
		if(p.getProductweight()<200)
		{
			try
			{
				
				throw new Exception("product weight low");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
