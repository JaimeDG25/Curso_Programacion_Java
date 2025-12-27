
package ejercicio.radom;

import java.util.Random;
import java.util.Scanner;

public class EjercicioRadom {

    public static void main(String[] args) {
        
        Random rand=new Random();
        int aleatorio=rand.nextInt(5)+1;
        Scanner var=new Scanner(System.in);
        
        System.out.println("Adivina el numero que estoy pensando entre 1 y 5 , digite 0 para salir");
        int num=var.nextInt();
        
        while(num!= aleatorio){
            if(num==0){ 
                System.out.println("El numero era "+aleatorio);
                break;
            }
            System.out.println("Humano estupdo te equivocaste en que numero estoy pensado (entre 1 y 5) dijita 0 para salir");
            num=var.nextInt();

            //aleatorio=rand.nextInt(5)+1;
        }
        if(num!=0){
            System.out.println("Adivinaste bien");;
        }                 
    }   
}
