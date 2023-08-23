import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        System.out.println("Ingrese el radio del círculo:");
        double radioCirculo = scanner.nextDouble();
        figuras[0] = new Circulo("Circulo", radioCirculo);

        System.out.println("Ingrese la base del rectángulo:");
        double baseRectangulo = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double alturaRectangulo = scanner.nextDouble();
        figuras[1] = new Rectangulo("Rectangulo", baseRectangulo, alturaRectangulo);

        System.out.println("Ingrese la base del triángulo:");
        double baseTriangulo = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double alturaTriangulo = scanner.nextDouble();
        figuras[2] = new Triangulo("TRiangulo", baseTriangulo, alturaTriangulo);

        System.out.println("Tabla de Áreas:");
        System.out.println("----------------");
        System.out.printf("%-12s %-12s%n", "Figura", "Área");
        System.out.println("----------------");

        for (FiguraGeometrica figura : figuras) {
            double area = figura.calcularArea();
            System.out.printf("%-12s %-12.2f%n", figura.nombre, area);
        }

        System.out.println("----------------");

        scanner.close();
    }
}