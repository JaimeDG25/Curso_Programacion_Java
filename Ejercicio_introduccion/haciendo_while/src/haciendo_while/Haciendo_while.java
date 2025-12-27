
package haciendo_while;

import java.util.Scanner;
public class Haciendo_while {


    public static void main(String[] args) {
        int a,limite;
        Scanner variable= new Scanner (System.in);
        System.out.println("Vamos a contar como unas ratitas");
        a= variable.nextInt();
        System.out.println("Perfecto ahora pon un limite");
        limite=variable.nextInt();
        while(a <= limite) {
            System.out.println("Su numero es "+a);
            a= a+2;
        }
    }
    
}
