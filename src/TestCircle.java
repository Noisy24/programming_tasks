import java.util.Date;


public class TestCircle {

    private double radius;
    private static int numberOfObjects = 9;
    private Date dateCreate;

    TestCircle() {
        this.radius = 1;
        this.numberOfObjects++;
    }


    TestCircle(double radius) {
        setRadius(radius);
        dateCreate = new Date();
        numberOfObjects++;
    }

    public Date getDateCreate() {
        return dateCreate;
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

    void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
            System.out.println("нет такого радиуса");
        }
        else {
            this.radius = radius;
        }
    }
}
