package ejercicio4;

public class Papas extends ExtraCombo {

    private int costoAdicional = 100;

    public Papas(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + costoAdicional;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Papas";
    }
}
