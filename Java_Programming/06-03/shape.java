class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
public class shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println(c.getRadius());
        System.out.println(c.calculatePerimeter());
        System.out.println(c.calculateArea());
    }
}
