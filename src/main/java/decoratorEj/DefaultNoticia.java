package decoratorEj;

public class DefaultNoticia implements Noticia {
    private String textoNoticia;

    public DefaultNoticia(String textoNoticia) {
        this.textoNoticia = textoNoticia;
    }

    @Override
    public void imprimir() {
        System.out.println("[ " + textoNoticia + " ]");
        
    }
}
