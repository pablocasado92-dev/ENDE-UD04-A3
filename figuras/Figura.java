package figuras;

import java.awt.Color;

/**
 * Clase abstracta que representa una figura geométrica básica.
 * Proporciona la estructura base para todas las figuras con centro y color,
 * así como métodos para calcular perímetro, área y comparar figuras.
 * 
 * @version 03-2026
 * @author Javier Torres
 * @since 20-03-2026 
 */
public abstract class Figura {
    /** Centro geométrico de la figura */
    private Punto centro;
    
    /** Color de la figura */
    private Color color;

    /**
     * Constructor de la clase Figura.
     * Inicializa una nueva figura con su centro y color.
     * 
     * @param x Coordenada X del centro de la figura
     * @param y Coordenada Y del centro de la figura
     * @param color Color de la figura (no puede ser null)
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    /**
     * Obtiene la coordenada X del centro de la figura.
     * 
     * @return Coordenada X del centro
     */
    public double getXCentro() {
        return centro.getX();
    }

    /**
     * Obtiene la coordenada Y del centro de la figura.
     * 
     * @return Coordenada Y del centro
     */
    public double getYCentro() {
        return centro.getY();
    }

    /**
     * Obtiene el color de la figura.
     * 
     * @return Color de la figura
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece la coordenada X del centro de la figura.
     * 
     * @param x Nueva coordenada X del centro
     */
    public void setXCentro(double x) {
        centro.setX(x);
    }

    /**
     * Establece la coordenada Y del centro de la figura.
     * 
     * @param y Nueva coordenada Y del centro
     */
    public void setYCentro(double y) {
        centro.setY(y);
    }

    /**
     * Establece el color de la figura.
     * 
     * @param color Nuevo color de la figura
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Calcula el perímetro de la figura.
     * Método abstracto que debe ser implementado por las clases hijas.
     * 
     * @return Perímetro de la figura
     */
    public abstract double perimetro();

    /**
     * Calcula el área de la figura.
     * Método abstracto que debe ser implementado por las clases hijas.
     * 
     * @return Área de la figura
     */
    public abstract double area();

    /**
     * Compara esta figura con otra figura basándose en sus áreas.
     * 
     * @param otraFigura La figura con la que se va a comparar
     * @return 1 si esta figura tiene mayor área que otraFigura,
     *         -1 si esta figura tiene menor área que otraFigura,
     *         0 si ambas figuras tienen la misma área
     */
    public int esMayorQue(Figura otraFigura) {
        int codigo;
        if (this.area() > otraFigura.area())
            codigo = 1;
        else if (this.area() < otraFigura.area())
            codigo = -1;
        else
            codigo = 0;
        return codigo;
    }
}