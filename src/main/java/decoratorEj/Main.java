package decoratorEj;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        var np = new ConPais(new DefaultNoticia("todo bien"), "Argentina");
//        np.imprimir();
//
//        var nf = new ConFecha(new DefaultNoticia("todo bien"), LocalDate.now());
//        nf.imprimir();
//
//        var npf = new ConFecha(
//                new ConPais(
//                        new DefaultNoticia("todo bien"), "Argentina"),
//                LocalDate.now());
//        npf.imprimir();

        var npfe = new ConFecha(new ConPais(new ConEmoji(new DefaultNoticia("todo bien"), ":)"), "Argentina"), LocalDate.now());
        npfe.imprimir();
    }
}
