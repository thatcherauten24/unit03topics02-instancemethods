public class Circle {
    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius; 
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * radius * Math.PI;
        return circumference;
    }

    public boolean intersects(Circle other) {
        boolean intersection = false;

        if (this.center.distanceTo(other.center) == other.radius) {
            intersection = true;
        } else if (this.center.distanceTo(other.center) <= this.radius + other.radius) {
            intersection = true;
        }

        return intersection;
    }

    public boolean contains(Circle other) {
        boolean containment = false;

        if (this.radius < other.radius) {
            if (this.radius != other.radius) {
                if (this.center.distanceTo(other.center) + this.radius < other.radius) {
                    containment = true;
                }
            }
        } else if (this.radius > other.radius) {

            if (this.radius != other.radius) {
                if (this.center.distanceTo(other.center) + other.radius < this.radius) {
                    containment = true;
                }
            }
        }
        return containment;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(0, 2);
        Point2D p2 = new Point2D(0, 1);

        Circle c1 = new Circle(p1, 3);
        Circle c2 = new Circle(p2, 5);

        System.out.println(c1.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c1.intersects(c2));
        System.out.println(c1.contains(c2));

    }
}
