package abstraction;

public class RectangleA extends ShapeA{
	@Override
	public void draw() {
		System.out.println("i can draw a Rectangle");
	}
	// TODO Auto-generated method stub
	public void getArea() {
		int l=2,b=5;
		double area=l*b;
		System.out.println(area);
 	}
	public void getPerimeter() {
		double l=5,b=2;
		double Perimeter=2*(l+b);
		System.out.println(Perimeter);
 	}

}
