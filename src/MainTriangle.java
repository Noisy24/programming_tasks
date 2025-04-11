public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setColor("yellow");
        triangle.setFilled(true);

        System.out.println(triangle);
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}
