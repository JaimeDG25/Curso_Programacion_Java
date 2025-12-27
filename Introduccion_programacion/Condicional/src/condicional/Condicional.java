
package condicional;

import java.util.Scanner;

public class Condicional {


    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int num1=var.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2=var.nextInt();
        if (num1>num2) {
            System.out.println("El numero mayor es "+num1);    
        }else{
            System.out.println("El numero mayor es "+num2);
        }
    }
    
}
