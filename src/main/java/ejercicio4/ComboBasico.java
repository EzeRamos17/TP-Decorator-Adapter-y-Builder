package ejercicio4;

public class ComboBasico implements Combo {
    private double precio;
    private String descripcion;

    public ComboBasico(double precio, String descripcion) {
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
