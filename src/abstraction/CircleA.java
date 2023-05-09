package abstraction;

public class CircleA  extends ShapeA{

	@Override
	public void draw() {
		System.out.println("i can draw a circle");
	}
	// TODO Auto-generated method stub
	public void getArea() {
		double r=5;
		double area=r*r;
		System.out.println(area);
 	}
	public void getPerimeter() {
		double r=5;
		double Perimeter=2*3.14*r;
		System.out.println(Perimeter);
 	}
	

}
