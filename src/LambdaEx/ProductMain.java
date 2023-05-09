package LambdaEx;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p=new Product(13,"ABC",32);
		Product p1=new Product(14,"PQR",62);
		Product p2=new Product(15,"XYZ",38);
		
		ArrayList<Product>list=new ArrayList<Product>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		
		list.forEach((n)->System.out.println(n));


	}

}
