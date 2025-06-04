package ejercicio4;

public class Builder {
    private Combo combo;

    public Builder(Combo combo) {
        this.combo = combo;
    }

    public Builder ConCarne() {
        combo = new Carne(combo);
        return this;
    }

    public Builder ConPapas() {
        combo = new Papas(combo);
        return this;
    }

    public Builder ConQueso() {
        combo = new Queso(combo);
        return this;
    }

    public Builder ConTomate() {
        combo = new Tomate(combo);
        return this;
    }

    public Combo build() {
        return combo;
    }
}
