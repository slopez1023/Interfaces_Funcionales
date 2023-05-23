import java.util.function.BiFunction;

public class BiFunctionSubject {
    public static void main(String[] args) {
        Student student = new Student("Maria","11°");
        Subject subject = new Subject("Philosophy","Karen");

        BiFunction<Student, Subject, String> showqualification = (s,t) -> {
            s.setGrade("Alto rendimiento");
            return t.getName() + "----" + "es una materia en la que tiene un" + "----" + s.getGrade() + "----" + s.getStudentName();
        };
        System.out.println(showqualification.apply(student,subject));
    }
}
