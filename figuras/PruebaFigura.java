package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {
    private static final String AREA = "El área es ";
    private static final String PERÍMETRO = "El perímetro es ";
    private static int opcion;

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

    private static Cuadrado procesarCuadrado(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
        return c;
    }

    private static Rectangulo procesarRectangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        return r;
    }

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