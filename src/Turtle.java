import java.util.Calendar;

public class Turtle {
    public String name;
    public double year_of_birth;


    public Turtle(String name, double year_of_birth) {
        this.name = name;
        this.year_of_birth = year_of_birth;
    }

    double getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - year_of_birth;
    }

    public String sayTurtle() {
        return "Черепаха " + name + " говорит: я очень медленная!";
    }
}
