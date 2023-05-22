public class Comida {
    private String Nombre;
    private float Precio;

    public Comida (String Nombre, float Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getPrecio() {
        return Precio;
    }
}
