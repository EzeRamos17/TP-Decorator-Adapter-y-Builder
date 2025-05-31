package decoratorEj;

public class ConPais implements Noticia {
    private final String pais;
    private Noticia noticia;

    public ConPais(Noticia noticia, String pais) {
        this.noticia = noticia;
        this.pais = pais;
    }

    @Override
    public void imprimir() {
        System.out.println(this.pais);
        this.noticia.imprimir();
    }
}
