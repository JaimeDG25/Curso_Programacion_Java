
package edad;

import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas a encuestar: ");
        int n = scanner.nextInt();

        int sumaEdades = 0;
        int mayorEdad = 0;
        int primaria = 0;
        int secundaria = 0;
        int superior = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Persona " + i + ":");
            System.out.print("Grado de instrucción (1-Primaria, 2-Secundaria, 3-Superior): ");
            int gradoInstruccion = scanner.nextInt();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            sumaEdades += edad;

            if (edad > mayorEdad) {
                mayorEdad = edad;
            };
            switch (gradoInstruccion) {
                case 1:
                    primaria++;
                    break;
                case 2:
                    secundaria++;
                    break;
                case 3:
                    superior++;
                    break;
                default:
                    System.out.println("Grado de instrucción inválido");
                    break;
            }
        }

        double promedioEdades = (double) sumaEdades / n;
        double porcentajePrimaria = (double) primaria / n * 100;
        double porcentajeSecundaria = (double) secundaria / n * 100;
        double porcentajeSuperior = (double) superior / n * 100;

        System.out.println("\nResultados:");
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Mayor edad: " + mayorEdad);
        System.out.println("Porcentaje de personas con instrucción Primaria: " + porcentajePrimaria + "%");
        System.out.println("Porcentaje de personas con instrucción Secundaria: " + porcentajeSecundaria + "%");
        System.out.println("Porcentaje de personas con instrucción Superior: " + porcentajeSuperior + "%");

        scanner.close();
    }
}
    
