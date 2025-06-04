package ejercicio4;

public class ComboEspecial implements Combo {
    private double precio;
    private String descripcion;

    public ComboEspecial(double precio, String descripcion) {
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
