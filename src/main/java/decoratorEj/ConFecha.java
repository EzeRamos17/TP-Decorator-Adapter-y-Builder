package decoratorEj;

import java.time.LocalDate;

public class ConFecha implements Noticia {
    private Noticia noticia;
    private LocalDate fecha;

    public ConFecha(Noticia noticia, LocalDate fecha) {
        this.noticia = noticia;
        this.fecha = fecha;
    }

    @Override
    public void imprimir() {
        System.out.println(this.fecha);
        this.noticia.imprimir();
    }
}
