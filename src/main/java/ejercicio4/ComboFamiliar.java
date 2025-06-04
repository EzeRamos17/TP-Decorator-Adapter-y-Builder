package ejercicio4;

public class ComboFamiliar implements Combo {
    private double precio;
    private String descripcion;

    public ComboFamiliar(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }
}
