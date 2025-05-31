package decoratorEj;

public class ConEmoji implements Noticia {
    private Noticia noticia;
    private String emoji;

    public ConEmoji(Noticia noticia, String emoji) {
        this.noticia = noticia;
        this.emoji = emoji;
    }

    @Override
    public void imprimir() {
        this.noticia.imprimir();
        System.out.println(this.emoji);
    }
}
