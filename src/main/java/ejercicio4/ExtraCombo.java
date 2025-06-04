package ejercicio4;

public abstract class ExtraCombo implements Combo {
    private Combo combo;
    

    protected ExtraCombo(Combo combo) {
        this.combo = combo;
    }

    public String descripcion() {
        return this.combo.descripcion();
    }

    public double precio() {
        return this.combo.precio();
    }
}
