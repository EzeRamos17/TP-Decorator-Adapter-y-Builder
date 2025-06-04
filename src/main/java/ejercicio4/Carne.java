package ejercicio4;

public class Carne extends ExtraCombo {
    private int costoAdicional = 150;

    public Carne(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + this.costoAdicional;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Carne";
    }
}
