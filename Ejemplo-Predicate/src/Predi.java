import java.util.function.Predicate;

public class Predi {
    public static void main(String[] args) {
        Exam1 exam1 = new Exam1("Math", true);
        Exam1 exam2 = new Exam1("Physics",false);

        Predicate<Exam1> isDone  = Exam1::isDone;

        System.out.println("The math exam is done: " + isDone.test(exam1));
        System.out.println("The physics exam is done: " + isDone.test(exam2));

    }
}
