package figuras;

/**
 * Clase que representa un punto en un plano cartesiano bidimensional.
 * Un punto se define por sus coordenadas X e Y.
 * Proporciona métodos para acceder y modificar las coordenadas,
 * calcular distancias, obtener puntos simétricos y comparar puntos.
 * 
 * @version 03-2026
 * @author Javier Torres
 * @since 20-03-2026 
 */
public class Punto {
    /** Coordenada X del punto */
    private double x;
    
    /** Coordenada Y del punto */
    private double y;

    /**
     * Constructor por defecto.
     * Inicializa el punto en el origen de coordenadas (0, 0).
     */
    public Punto() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor que inicializa el punto con coordenadas específicas.
     * 
     * @param x Coordenada X del punto
     * @param y Coordenada Y del punto
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor de copia.
     * Crea un nuevo punto a partir de otro punto existente.
     * 
     * @param p Punto a copiar
     */
    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    /**
     * Obtiene la coordenada X del punto.
     * 
     * @return Coordenada X del punto
     */
    public double getX() {
        return x;
    }

    /**
     * Obtiene la coordenada Y del punto.
     * 
     * @return Coordenada Y del punto
     */
    public double getY() {
        return y;
    }

    /**
     * Establece la coordenada X del punto.
     * 
     * @param x Nueva coordenada X del punto
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Establece la coordenada Y del punto.
     * 
     * @param y Nueva coordenada Y del punto
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcula la distancia euclidiana entre este punto y otro punto.
     * 
     * @param p El punto con el que se calcula la distancia
     * @return Distancia entre este punto y el punto p
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    /**
     * Calcula el punto simétrico respecto al eje Y.
     * El punto simétrico se obtiene invirtiendo el signo de la coordenada X.
     * 
     * @return Nuevo punto simétrico respecto al eje Y
     */
    public Punto simetrico() {
        Punto nuevoP = new Punto(this.x * -1, this.y);
        return nuevoP;
    }

    /**
     * Compara este punto con otro punto para determinar si son iguales.
     * Dos puntos son iguales si tienen las mismas coordenadas X e Y.
     * 
     * @param p Punto con el que se va a comparar
     * @return true si los puntos tienen las mismas coordenadas, false en caso contrario
     */
    public boolean compara(Punto p) {
        if (p.x == x && p.y == y)
            return true;
        else
            return false;
    }

    /**
     * Devuelve una representación en cadena del punto.
     * El formato es "(x,y)" donde x e y son las coordenadas.
     * 
     * @return Cadena que representa el punto en formato "(x,y)"
     */
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}