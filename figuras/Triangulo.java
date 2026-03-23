package figuras;

import java.awt.Color;

/**
 * Clase que representa un triángulo en el plano cartesiano.
 * Extiende la clase abstracta Figura y proporciona implementaciones
 * concretas para el cálculo del perímetro y área de un triángulo.
 * El área se calcula utilizando la fórmula de Herón.
 * 
 * @author Javier Torres
 * @version 03-2026
 * @since 20-03-2026
 */
public class Triangulo extends Figura {
    /** Longitud del primer lado del triángulo */
    private double lado1;
    
    /** Longitud del segundo lado del triángulo */
    private double lado2;
    
    /** Longitud del tercer lado del triángulo */
    private double lado3;

    /**
     * Constructor de la clase Triangulo.
     * Inicializa un triángulo con su centro, color y las longitudes de sus tres lados.
     * 
     * @param x Coordenada X del centro del triángulo
     * @param y Coordenada Y del centro del triángulo
     * @param color Color del triángulo
     * @param lado1 Longitud del primer lado
     * @param lado2 Longitud del segundo lado
     * @param lado3 Longitud del tercer lado
     */
    public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Obtiene la longitud del primer lado del triángulo.
     * 
     * @return Longitud del lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Obtiene la longitud del segundo lado del triángulo.
     * 
     * @return Longitud del lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Obtiene la longitud del tercer lado del triángulo.
     * 
     * @return Longitud del lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Establece la longitud del primer lado del triángulo.
     * 
     * @param lado1 Nueva longitud para el primer lado
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Establece la longitud del segundo lado del triángulo.
     * 
     * @param lado2 Nueva longitud para el segundo lado
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Establece la longitud del tercer lado del triángulo.
     * 
     * @param lado3 Nueva longitud para el tercer lado
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro del triángulo.
     * El perímetro es la suma de las longitudes de sus tres lados.
     * 
     * @return Perímetro del triángulo
     */
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área del triángulo utilizando la fórmula de Herón.
     * Fórmula: Área = √(s·(s-a)·(s-b)·(s-c))
     * donde s es el semiperímetro y a, b, c son las longitudes de los lados.
     * 
     * @return Área del triángulo
     */
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}