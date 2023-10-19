package shapes;


public abstract class Shape implements Comparable<Shape> {
    
    // Attribute to be inherited by subclasses
    protected double height;
    
    //Constructor
    protected Shape(double height) {
        this.height = height;
    }
    
   
    public abstract double volume();
    public abstract double baseArea();
    
 
    public double getHeight() {
        return height;
    }
    
    
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
    
    // Method to compare by base area
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
    
    // Method to compare volume
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



