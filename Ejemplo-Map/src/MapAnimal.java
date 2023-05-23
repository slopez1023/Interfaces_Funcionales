import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MapAnimal {
    public static void main(String[] args) {
        List<Animal> people = Arrays.asList(new Animal("Mouse","Rodent"));
        List<String> names = people.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);

    }
}
