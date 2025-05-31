package builderEj;

import decoratorEj.*;

import java.time.LocalDate;

public class NoticiaBuilder {
    private Noticia noticia;

    public NoticiaBuilder(String noticia) {
        this.noticia = new DefaultNoticia(noticia);
    }

    public NoticiaBuilder ConFecha(LocalDate fecha) {
        this.noticia = new ConFecha(this.noticia, fecha);
        return this;
    }

    public NoticiaBuilder ConPais(String pais) {
        this.noticia = new ConPais(this.noticia, pais);
        return this;
    }

    public NoticiaBuilder ConEmoji(String emoji) {
        this.noticia = new ConEmoji(this.noticia, emoji);
        return this;
    }

    public Noticia build() {
        return this.noticia;
    }

}
