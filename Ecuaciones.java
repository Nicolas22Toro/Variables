import java.util.Scanner;

public class Ecuaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        double x, z, y;

        while (true) {
            System.out.println("\n===== PROGRAMA ECUACIONES =====");
            System.out.println("1. Ecuacion 1");
            System.out.println("2. Ecuacion 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.print("Ingrese el valor de x: ");
                x = sc.nextDouble();

                System.out.print("Ingrese el valor de z: ");
                z = sc.nextDouble();

                // Ecuacion 1
                y = (3 * x) /
                    (1 + ( (3 * x) / (3 * Math.pow(z, 2) + 2) )
                    / (1 / ( (1 / (1 + z)) + 3 * Math.pow(x, 2) + 2 * z + 3 )));

                System.out.println("Resultado de la Ecuacion 1: " + y);

            } else if (opcion == 2) {

                System.out.print("Ingrese el valor de x: ");
                x = sc.nextDouble();

                System.out.print("Ingrese el valor de z: ");
                z = sc.nextDouble();

                // Ecuacion 2
                y = 2
                    + ((Math.pow(x, 2) + 3 * z + 2) / (1 + 2 * z))
                    + (2 / ((1 + 3 * Math.pow(x, 3) + 3 * z + 2)
                    / (1 / (1 + 3 * x) + ((3 * x + 1) / (2 * z + (3.0 / (1 + 5)))))));

                System.out.println("Resultado de la Ecuacion 2: " + y);

            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opcion no valida.");
            }
        }

        sc.close();
    }
}