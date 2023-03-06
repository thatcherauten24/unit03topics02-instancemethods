public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double newX) {
        x = newX;
    }
    
    public void setY(double newY) {
        y = newY;
    }

    public double distanceTo(Point2D other) {
        double distance = 0.0;

        distance = Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));

        return distance;
    }

    public String toString() {
        String result = "";
        result += "(";
        result += x;
        result += ", ";
        result += y;
        result += ")";

        return result;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(0, 2);
        Point2D p2 = new Point2D(0, 0);

        System.out.println(p1);
        System.out.println(p1.distanceTo(p2));
    }
}
