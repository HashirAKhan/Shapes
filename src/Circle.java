public class Circle extends Shape{
	private double radius;
	
	public Circle(double rad, String circleName) {
		super(circleName);
		radius = rad;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
