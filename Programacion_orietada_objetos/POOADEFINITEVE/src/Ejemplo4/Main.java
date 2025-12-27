
package Ejemplo4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Argumentos op=new Argumentos();
        Scanner var=new Scanner(System.in);
                
        System.out.println("El primer numero sera: ");
        int n1=var.nextInt();
        System.out.println("El primer numero sera:");
        int n2=var.nextInt();
        
        int sumar=op.Suma(n1, n2);
        int restar=op.Resta(n1, n2);
        int multiplicar=op.Multiplicacion(n1, n2);
        float dividir=op.Division(n1, n2);
        System.out.println("El resultado es:"+sumar);
        System.out.println("El resultado es:"+restar);
        System.out.println("El resultado es:"+multiplicar);
        System.out.println("El resultado es:"+dividir);
    }
    
}
