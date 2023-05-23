import java.util.function.Supplier;

public class Cellphone {
    private String CellNumber;

    public Cellphone (String CellNumber){
        this.CellNumber = CellNumber;
    }

    public String getCellNumber() {
        return CellNumber;
    }

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone("3207452930");
        Supplier<String> cellphoneSupplier = cellphone ::getCellNumber;
        String number = cellphoneSupplier.get();
        System.out.println("Cell number: " + number);
    }
}
