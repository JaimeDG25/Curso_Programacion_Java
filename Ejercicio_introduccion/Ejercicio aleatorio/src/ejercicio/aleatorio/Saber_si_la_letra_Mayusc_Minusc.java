
package ejercicio.aleatorio;

import java.util.Scanner;


public class Saber_si_la_letra_Mayusc_Minusc {


    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("Ingresar un aletra");
        char letra=var.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.println("La letra es mayuscula");
        }else{
            System.out.println("La leta es minuscula");
        }
    }
    
}
