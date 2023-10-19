package shapes;

public abstract class Prism extends Shape {
	protected double edgeLength;

	public Prism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	@Override
	public double volume() {
		return baseArea() * height;
	}	

}
class SquarePrism extends Prism{
	public SquarePrism(double height, double edgeLength) {
		super(height, edgeLength);
	}
	@Override
	public double baseArea() {
		return edgeLength * edgeLength;
	}
}
class TriangularPrism extends Prism {
    public TriangularPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double baseArea() {
        return (Math.sqrt(3) / 4) * edgeLength * edgeLength;
    }
}

class PentagonalPrism extends Prism {
    public PentagonalPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double baseArea() {
        return (5.0 / 4) * (edgeLength * edgeLength) / Math.tan(Math.PI / 5);
    }
}

class OctagonalPrism extends Prism {
    public OctagonalPrism(double height, double edgeLength) {
        super(height, edgeLength);
    }

    @Override
    public double baseArea() {
        return 2 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
    }
}