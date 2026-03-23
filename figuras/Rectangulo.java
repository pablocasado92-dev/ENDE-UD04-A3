package figuras;

import java.awt.Color;

/**
 * Clase que representa un rectángulo. Hereda de Figura y añade propiedades base y altura,
 *  así como métodos para calcular el perímetro y el área.
 * @version 03-2026
 * @author Javier Torres
 * @since 20-03-2026 
*/
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    /**
     * Constructor que inicializa las coordenadas x e y, el color del rectángulo, así como su base y altura.
     * @param x Coordenada x del centro del rectángulo.
     * @param y Coordenada y del centro del rectángulo.
     * @param color Color del rectángulo.
     * @param base Base del rectángulo.
     * @param altura Altura del rectángulo.
     */
    public Rectangulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la base del rectángulo.
     * @return La base del rectángulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Obtiene la altura del rectángulo.
     * @return La altura del rectángulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la base del rectángulo.
     * @param base Nueva base del rectángulo.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Establece la altura del rectángulo.
     * @param altura Nueva altura del rectángulo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * @return El perímetro del rectángulo.
     */
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

    /**
     * Calcula el área del rectángulo.
     * @return El área del rectángulo.
     */
    public double area() {
        return base * altura;
    }
}