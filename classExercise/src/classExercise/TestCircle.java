package classExercise;

public class TestCircle {
	public static void Main(String[]args) {
		//parantez içi boþ olduðunda 1 alýyor.
		Circle circle1=new Circle();
		System.out.println("The area of the circle of radius "+ circle1.radius+" is "+circle1.getArea());
        Circle circle2=new Circle(25);
        System.out.println("The area of the circle of radius "+ circle2.radius+" is "+circle2.getArea());
		Circle circle3=new Circle(125);
		System.out.println("The area of the circle of radius "+ circle3.radius+" is "+circle3.getArea());
			
		
	}
	

}
class Circle{
	double radius;
	Circle(){
		radius=1;
		
	}
	Circle (double newRadius) {
		radius=newRadius;
		
	}
	public double getArea() {
		return radius*radius*Math.PI;
		
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;

    }
	public void setRadius(double newRadius) {
		radius=newRadius;
	}
}
