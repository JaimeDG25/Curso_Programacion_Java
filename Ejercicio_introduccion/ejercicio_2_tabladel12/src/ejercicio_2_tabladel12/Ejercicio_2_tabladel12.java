
package ejercicio_2_tabladel12;

import java.util.Scanner;


public class Ejercicio_2_tabladel12 {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        int num,multi;
        System.out.println("Ingresa un numero para evaluar la tabla del 12");
        num=var.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println("La tabla del "+ num +" es: ");
        for(int i=1;i<=12 ;i++) {
            multi=num*i;
            System.out.println(num+" x "+i+" = "+multi); 
        }
    }
    
}
