package shapes;


public abstract class Shape implements Comparable<Shape> {
    
    // Protected attributes to be inherited by subclasses
    protected double height;
    
    // Constructor
    protected Shape(double height) {
        this.height = height;
    }
    
    // Abstract methods for volume and baseArea which must be implemented by subclasses
    public abstract double volume();
    public abstract double baseArea();
    
    // Getters
    public double getHeight() {
        return height;
    }
    
    // Implementation of compareTo() method from Comparable interface to compare by height
    @Override
    public int compareTo(Shape otherShape) {
        if (this.height > otherShape.height) {
            return 1;
        } else if (this.height < otherShape.height) {
            return -1;
        } else {
            return 0;
        }
    }
    
    // Helper method to compare by base area
    public int compareByBaseArea(Shape otherShape) {
        double thisBaseArea = this.baseArea();
        double otherBaseArea = otherShape.baseArea();
        
        if (thisBaseArea > otherBaseArea) {
            return 1;
        } else if (thisBaseArea < otherBaseArea) {
            return -1;
        } else {
            return 0;
        }
    }
    
    // Helper method to compare by volume
    public int compareByVolume(Shape otherShape) {
        double thisVolume = this.volume();
        double otherVolume = otherShape.volume();
        
        if (thisVolume > otherVolume) {
            return 1;
        } else if (thisVolume < otherVolume) {
            return -1;
        } else {
            return 0;
        }
    }
}



