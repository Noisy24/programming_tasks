import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("111", 7));
//        Circle c1 = new Circle();
//        System.out.println(c1.getRadius());
//        c1.setRadius(5);
//        System.out.println(c1.getRadius());
//        c1.setRadius(-5);
//        System.out.println(c1.getRadius());
//        Circle c2 = new Circle(7, "blue", true);
//        System.out.println(c2.getRadius());
//        System.out.println(c2.getArea());
//        System.out.println("Количество созданных обьектов " +
//                Circle.getNumberOfObjects());
//        System.out.println(c2.getDataCreated());


//        TestCircle[] circles = new TestCircle[10];
//        for (int i = 0; i < circles.length; i++) {
//            circles[i] = new TestCircle(Math.random() * 10);
//            System.out.println(circles[i].getArea());
//        }
//        System.out.println("Общая площадь - " + sumOfArea(circles));

        int n = 10;

        Random r = new Random();
        Treg_Ravn[] tregs = new Treg_Ravn[r.nextInt(10, 31)];
        for (int i = 0; i < tregs.length; i++) {
            tregs[i] = new Treg_Ravn(r.nextInt(1, 11), r.nextInt(1, 11), r.nextInt(1, 11));
        }


        System.out.println("Общая площадь - " + sumOfArea(tregs));

        for (int i = 0; i < tregs.length; i++) {
            System.out.println("Треугольник " + "№" + i + "; Высота: " + tregs[i].getHeight() +
                    ", основание: " + tregs[i].getOsnovanie() + ", боковая сторона: " + tregs[i].getBok_storona());
            printArea_Treg_Ravn(tregs[i]);
            printPerimetr_Treg_Ravn(tregs[i]);
            System.out.println();
        }
    }

    public static double sumOfArea(Treg_Ravn[] tregs) {
        double sum = 0;
        for (int i = 0; i < tregs.length; i++) {
            sum += tregs[i].getArea();
        }
        return sum;
    }

    public static void printPerimetr_Treg_Ravn(Treg_Ravn t) {
        System.out.println("Периметр треугольника равен: " +
                t.getPerimetr());
    }


    public static void printArea_Treg_Ravn(Treg_Ravn t) {
        System.out.println("Площадь треугольника с высотой " +
                t.getHeight() + " = " + t.getArea());
    }

//
//
//        Treg_Ravn[] tregs = new Treg_Ravn[][10];
//        for (int i = 0; i < tregs.length; i++) {
//            tregs[i] = new Treg_Ravn(Math.random() * 10);
//            System.out.println(circles[i].getArea());
//        }
//        System.out.println("Общая площадь - " + sumOfArea(circles));
//    }
//
//
//    public static void printCircle(TestCircle c) {
//        System.out.println("Площадь круга с радиусом " +
//                c.getRadius() + " = " + c.getArea());
//    }




//        TestCircle circle = new TestCircle(5);
//        Date date = circle.getDataCreate;
//        System.out.println(circle.getDataCreate);
//        date.setTime(10000);
//        System.out.println(circle.getDataCreate);

    }

