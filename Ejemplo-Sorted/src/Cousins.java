import java.util.Arrays;
import java.util.List;

public class Cousins {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(11, 13, 37, 23, 47, 7, 67, 89);

            List<Integer> sortedNumbers = numbers.stream()
                    .filter(n -> n > 30)
                    .sorted()
                    .toList();
            System.out.println(sortedNumbers);
        }
    }

