import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
public class EjBiConsum {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Real Madrid", "Milan", "Bayern");
        List<String> list1 = Arrays.asList("14 champions","7 champions","6 champions");

        List<String> result = new ArrayList<>();

        BiConsumer<String, String> biConsumer = (t1,t2) -> result.add(t1 + "--" + t2);
        for (int i=0; i<list.size(); i++){
            biConsumer.accept(list.get(i), list1.get(i));
        }
        System.out.println(result);
}
}
