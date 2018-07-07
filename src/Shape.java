public abstract class Shape {
	private String name;
	
	public Shape(String shapeName) {
		name = shapeName;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
