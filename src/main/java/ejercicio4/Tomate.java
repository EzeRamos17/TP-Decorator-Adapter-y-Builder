package ejercicio4;

public class Tomate extends ExtraCombo {

    private int costoAdicional = 100;

    public Tomate(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + this.costoAdicional;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Tomate";
    }
}
