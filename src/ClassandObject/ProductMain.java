package ClassandObject;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.id=11;
		p.name="Book";
		p.noofproducts=5;
		p.costperproduct=100;
		System.out.println(p);
		System.out.println("===========================");
		
		Product p1=new Product();
		p1.id=12;
		p1.name="Pen";
		p1.noofproducts=3;
		p1.costperproduct=200;
		System.out.println(p1);
		System.out.println("===========================");

		Product p2=new Product();
		p2.id=13;
		p2.name="NoteBook";
		p2.noofproducts=6;
		p2.costperproduct=300;
		System.out.println(p2);

	}

}
