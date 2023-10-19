package shapes;

public class Cylinder extends Shape {
	private double radius;
	
	protected Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double volume() {
		return Math.PI * (radius*radius) * height; 
	}

	@Override
	public double baseArea() {
		return Math.PI * (radius*radius);
	}

}
