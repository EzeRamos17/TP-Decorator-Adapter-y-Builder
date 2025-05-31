package builderEj;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var npf = new NoticiaBuilder("todo bien")
                .ConPais("Argentina")
                .ConFecha(LocalDate.now())
                .build();
        npf.imprimir();
    }
}
