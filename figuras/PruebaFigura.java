package figuras;

import java.util.Scanner;
import java.awt.Color;

/**
 * Clase principal para probar las diferentes figuras geométricas.
 * Permite al usuario crear triángulos, rectángulos y cuadrados,
 * introduciendo sus dimensiones y calculando su perímetro y área.
 * 
 * @version 03-2026
 * @author Javier Torres
 * @since 20-03-2026 
 */
public class PruebaFigura {
    /** Constante para el mensaje del área */
    private static final String AREA = "El área es ";
    
    /** Constante para el mensaje del perímetro */
    private static final String PERÍMETRO = "El perímetro es ";
    
    /** Almacena la opción seleccionada por el usuario en el menú */
    private static int opcion;

    /**
     * Método principal que ejecuta el programa.
     * Muestra un menú interactivo y permite al usuario crear diferentes
     * figuras geométricas hasta que seleccione la opción de salir.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        do {
            opcion = mostrarMenú();
            if (opcion != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();
                switch (opcion) {
                    case 1:
                        Triangulo t = procesarTriangulo(teclado, x, y);
                        System.out.println(PERÍMETRO + t.perimetro());
                        System.out.println(AREA + t.area());
                        break;
                    case 2:
                        Rectangulo r = procesarRectangulo(teclado, x, y);
                        System.out.println(PERÍMETRO + r.perimetro());
                        System.out.println(AREA + r.area());
                        break;
                    case 3:
                        Cuadrado c = procesarCuadrado(teclado, x, y);
                        System.out.println(PERÍMETRO + c.perimetro());
                        System.out.println(AREA + c.area());
                        break;
                }
            }
        } while (opcion != 4);
        teclado.close();
    }

    /**
     * Procesa la creación de un cuadrado solicitando sus dimensiones al usuario.
     * 
     * @param teclado Objeto Scanner para lectura de datos desde el teclado
     * @param x Coordenada X del centro del cuadrado
     * @param y Coordenada Y del centro del cuadrado
     * @return Cuadrado creado con los datos proporcionados por el usuario
     */
    private static Cuadrado procesarCuadrado(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
        return c;
    }

    /**
     * Procesa la creación de un rectángulo solicitando sus dimensiones al usuario.
     * 
     * @param teclado Objeto Scanner para lectura de datos desde el teclado
     * @param x Coordenada X del centro del rectángulo
     * @param y Coordenada Y del centro del rectángulo
     * @return Rectángulo creado con los datos proporcionados por el usuario
     */
    private static Rectangulo procesarRectangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        return r;
    }

    /**
     * Procesa la creación de un triángulo solicitando sus dimensiones al usuario.
     * Se solicitan los tres lados del triángulo.
     * 
     * @param teclado Objeto Scanner para lectura de datos desde el teclado
     * @param x Coordenada X del centro del triángulo
     * @param y Coordenada Y del centro del triángulo
     * @return Triángulo creado con los datos proporcionados por el usuario
     */
    private static Triangulo procesarTriangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado 1 del triángulo: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Introduzca el lado 2 del triángulo: ");
        double lado2 = teclado.nextDouble();
        System.out.print("Introduzca el lado 3 del triángulo: ");
        double lado3 = teclado.nextDouble();
        Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
        return t;
    }

    /**
     * Muestra el menú principal y solicita al usuario que seleccione una opción.
     * Valida que la opción esté entre 1 y 4.
     * 
     * @return Opción seleccionada por el usuario (1-4)
     */
    public static int mostrarMenú() {
        int opcion;
        System.out.println("1) Triángulo");
        System.out.println("2) Rectángulo");
        System.out.println("3) Cuadrado");
        System.out.println("4) Salir");
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduzca una opción (1-4): ");
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > 4)
                System.out.println("Debe introducir un número entre 1 y 4");
        } while (opcion < 1 || opcion > 4);
        teclado.close();
        return opcion;
    }
}