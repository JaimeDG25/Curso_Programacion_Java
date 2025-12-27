
package aloha1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Prueba1 op=new Prueba1();
        Scanner var=new Scanner (System.in);

        System.out.println("Ingrese su nombre mi estimado");
        String nombre=var.nextLine();
        
        System.out.println("Ingrese el limite del arreglo:");
        int a=op.var.nextInt();
        
        int[] arreglo = op.arreglo(a);
        op.mostrar(a, arreglo);
    }
    
}
