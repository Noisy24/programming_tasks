public class MainTurtle {
    public static void main(String[] args) {
        Turtle turtle = new Turtle("Паша", 1989);
        System.out.println("Паше на данный момент - " + (int) turtle.getAge() + " лет.");
        System.out.println(turtle.sayTurtle());
    }
}
