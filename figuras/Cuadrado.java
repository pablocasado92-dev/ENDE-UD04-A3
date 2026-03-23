package figuras;

import java.awt.Color;

/**
 * Clase que representa un cuadrado, hereda de Rectángulo
 * @version 03-2026
 * @author Javier Torres
 * @since 20-03-2026
 */
public class Cuadrado extends Rectangulo {
    /**
     * Constructor para el cuadrado que inicializa sus coordenadas x e y, su color y la longitud de los lados.
     * @param x Coordenada x del centro del cuadrado.
     * @param y Coordenada y del centro del cuadrado.
     * @param color Color del cuadrado.
     * @param lado Longitud de los lados del cuadrado.
     */
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}