package circle;

public class Circle {
	private double radius;
	 
	Circle(double radius){
		this.radius=radius;
	}
	Circle(){
		
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea(double radius) {
		this.radius=radius;
		return radius*radius*Math.PI; 
	}
	public double getPerimeter(double radius) {
		this.radius=radius;
		return 2*radius*Math.PI;
	}

}
