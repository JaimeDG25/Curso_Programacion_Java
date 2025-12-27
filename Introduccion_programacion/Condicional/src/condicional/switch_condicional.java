
package condicional;

import java.util.Scanner;
 

public class switch_condicional {


    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 4");
        int num1=var.nextInt();
        switch(num1){
            case 1 :System.out.println("Elgiste la primera opcion");
                break;
            case 2 :System.out.println("Elgiste la segunda opcion");
                break;
            case 3 :System.out.println("Elgiste la tercera opcion");
                break;
            case 4 :System.out.println("Elgiste la cuarta opcion");
                break;
            default:System.out.println("Esta opcion no existe");
        }
    }
    
}
