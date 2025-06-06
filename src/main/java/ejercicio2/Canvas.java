package ejercicio2;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        AdapterGraphics2D adapter = new AdapterGraphics2D((Graphics2D) g);

        for (Figura figura : figuras) {
            figura.dibujar(adapter);
        }
    }
}
