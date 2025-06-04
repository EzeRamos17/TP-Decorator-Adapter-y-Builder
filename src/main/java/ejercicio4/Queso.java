package ejercicio4;

public class Queso extends ExtraCombo {
    private int costoAdicional = 75;

    public Queso(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + this.costoAdicional;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Queso";
    }
}
