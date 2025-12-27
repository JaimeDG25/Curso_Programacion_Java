
package promedio_menor_mayor;

import java.util.Scanner;

public class Promedio_menor_mayor {

    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las 10 notas:");
        int mayor = 0; int menor = 0; int suma = 0; int prom = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            int numero = scanner.nextInt();
            if(numero<=20){
            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            suma=suma+numero;
            prom=suma/i;
            }
            else{
                System.out.println("La nota no es valida");
                break;}}
        System.out.println("La nota mayor es: " + mayor);
        System.out.println("La nota menor es: " + menor);
        System.out.println("El promedio de las notas es de: "+prom);
    }
}