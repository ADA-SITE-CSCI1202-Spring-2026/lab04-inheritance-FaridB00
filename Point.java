public class Point {
    private double x;
    private double y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + 
                         Math.pow(this.y - other.y, 2));
    }
    
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + 
                         Math.pow(p1.y - p2.y, 2));
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Point other = (Point) obj;
        return Double.compare(other.x, x) == 0 && 
               Double.compare(other.y, y) == 0;
    }
}