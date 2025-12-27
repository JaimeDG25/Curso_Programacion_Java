
package condicional;

import java.util.Scanner;

public class while_condicional {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        System.out.println("Ingrese un primero numero ");
        int primer=var.nextInt();
        System.out.println("Ingrese el numero limitante ");
        int segundo=var.nextInt();
        while(primer<=segundo) {
            System.out.println(""+primer);
            primer++; 
        }
    }
    
}
