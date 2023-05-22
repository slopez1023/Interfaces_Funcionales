import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consu {
    public static void main(String[] args) {
        List<Comida> comida = new ArrayList<>();
        comida.add(new Comida("Burger",3.5f));
        comida.add(new Comida("Pizza",5.89f));

        Consumer<List<Comida>> consumer = (listaComida) -> {
            for(Comida comida1 : listaComida) {
                System.out.println(comida1.getNombre() + "----" + comida1.getPrecio());
            }
        };
        consumer.accept(comida);
    }
}
