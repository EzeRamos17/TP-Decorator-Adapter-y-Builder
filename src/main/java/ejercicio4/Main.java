package ejercicio4;

public class Main {
    public static void main(String[] args) {
        var combo = new Papas(new Queso(new Tomate(new ComboBasico(400, "Basico"))));
        System.out.println(combo.descripcion());
        System.out.println(combo.precio());

        var combo2 = new Carne(new Queso(new ComboFamiliar(800, "Familiar")));
        System.out.println(combo2.descripcion());
        System.out.println(combo2.precio());

        var builder = new Builder(new ComboFamiliar(800, "Familiar"));
        var combo3 = builder.build();
        System.out.println(combo3.descripcion());
        System.out.println(combo3.precio());

        var builder2 = new Builder(new ComboBasico(400, "Basico"));
        var combo4 = builder2
                .ConCarne()
                .ConPapas()
                .ConQueso()
                .ConTomate()
                .build();
        System.out.println(combo4.descripcion());
        System.out.println(combo4.precio());
    }
}
