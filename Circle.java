public class Circle {
    private Point center;
    private double radius;
    
    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }
    
    public Circle(Point center, double radius) {
        this.center = new Point(center);
        this.radius = radius;
    }
    
    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }
    
    public Circle(Circle other) {
        this.center = new Point(other.center);
        this.radius = other.radius;
    }
    
    public Point getCenter() {
        return new Point(center);
    }
    
    public void setCenter(Point center) {
        this.center = new Point(center);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    
    public boolean contains(Point point) {
        return center.distance(point) <= radius;
    }
    
    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ", radius=" + radius + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0 && 
               center.equals(other.center);
    }
}