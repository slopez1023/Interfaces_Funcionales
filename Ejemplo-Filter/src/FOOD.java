import java.util.Arrays;
import java.util.List;

public class FOOD {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ice Cream","Macarons","Donuts");

        List<String> longNames = names.stream()
                .filter(n -> n.length() > 5)
                .toList();

        longNames.forEach(System.out::println);
    }
}
