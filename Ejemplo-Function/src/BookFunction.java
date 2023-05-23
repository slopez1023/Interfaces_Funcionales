import java.util.function.Function;

public class BookFunction {
    public static void main(String[] args) {
        Books books = new Books("Bible","Religious",50000.0);

        Function<Books, String> showprice = p -> "El valor de " + p.getName() + "----" + "es" + "----" + p.getPrice();
        System.out.println(showprice.apply(books));

    }
}
