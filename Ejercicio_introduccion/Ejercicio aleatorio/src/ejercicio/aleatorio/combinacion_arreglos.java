
package ejercicio.aleatorio;

import java.util.Scanner;

public class combinacion_arreglos {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        
        System.out.println("Ingrese los numeros del primer arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite el numero: ");
            a[i]=var.nextInt();
        }
        System.out.println("Ingrese los numeros del segundo arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite el numero: ");
            b[i]=var.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+a[i]);
            System.out.print(" "+b[i]);
        }
    }
    
}
