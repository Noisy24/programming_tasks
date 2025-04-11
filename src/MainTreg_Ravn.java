import java.util.Random;

public class MainTreg_Ravn {
    public static void main(String[] args) {
        Random r = new Random();
        Treg_Ravn[] tregs = new Treg_Ravn[r.nextInt(10, 31)];
        for (int i = 0; i < tregs.length; i++) {
            tregs[i] = new Treg_Ravn(r.nextInt(1, 11), r.nextInt(1, 11), r.nextInt(1, 11));
        }

        System.out.println("Общая площадь - " + sumOfArea(tregs));

        System.out.println("Минимальная и максимальная сумма периметров - " + sum_minmax(tregs));

        for (int i = 0; i < tregs.length; i++) {
            System.out.println("Треугольник " + "№" + i + "; Высота: " + tregs[i].getHeight() +
                    ", основание: " + tregs[i].getOsnovanie() + ", боковая сторона: " + tregs[i].getBok_storona());
            printArea_Treg_Ravn(tregs[i]);
            printPerimetr_Treg_Ravn(tregs[i]);
            System.out.println();
        }
    }

    // Нахождение суммы минимального и максимального периметра
    public static double sum_minmax(Treg_Ravn[] tregs) {
        double min = 1000;
        double max = 0;
        for (Treg_Ravn treg : tregs) {
            if (min > treg.getPerimetr()) {
                min = treg.getPerimetr();
            }
            if (max < treg.getPerimetr()) {
                max = treg.getPerimetr();
            }
        }
        return min + max;
    }

    public static double sumOfArea(Treg_Ravn[] tregs) {
        double sum = 0;
        for (Treg_Ravn treg : tregs) {
            sum += treg.getArea();
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
}
