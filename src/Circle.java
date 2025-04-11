import java.util.Date;

public class Circle extends GeometricObject{
    public double radius;
    public static int numberOfObjects = 0;

    Circle() {
        radius = 1;
        numberOfObjects++;
    }

    Circle(double radius ,String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
        setColor(color);
        setFilled(filled);
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimetr() {
        return 2 * radius * Math.PI;
    }
    double getRadius() {
        return radius;
    }
    public Date getDataCreated() {
        return super.getDateCreated();
    }
    void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
            System.out.println("нет такого радиуса");
        }
        else {
            this.radius = radius;
        }
    }

    public String toString() {
        return "Круг создан " + getDateCreated() + " и радиус равен " + radius;
    }
}
