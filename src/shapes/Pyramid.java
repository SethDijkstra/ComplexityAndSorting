package shapes;

public class Pyramid extends Shape {
	private double edgeLength;
	public Pyramid(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	@Override
	public double volume() {
		return (1/3) * baseArea() * height;
	}

	@Override
	public double baseArea() {
		return edgeLength * edgeLength;
	}

}
