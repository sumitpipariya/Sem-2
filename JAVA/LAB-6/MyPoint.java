import java.lang.Math;

public class MyPoint {
    // Data fields
    private double x;
    private double y;

    // Constructors
    // No-arg constructor
    public MyPoint() {
        this(0, 0);
    }

    // Constructor with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate distance to another MyPoint
    public double distance(MyPoint anotherPoint) {
        double dx = this.x - anotherPoint.getX();
        double dy = this.y - anotherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Method to calculate distance to specified coordinates
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Example of usage
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
        System.out.println("Distance between point1 and (0, 0): " + point1.distance(0, 0));
    }
}
