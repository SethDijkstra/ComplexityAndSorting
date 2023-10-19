package shapes;

public class Cone extends Shape {
	private double radius;

	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double volume() {
		return (1/3) * Math.PI * (radius*radius) * height;
	}

	@Override
	public double baseArea() {
		return Math.PI * (radius*radius);
	}

}
