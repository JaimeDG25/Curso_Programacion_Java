
package ejercicio3_sumatoriapares;

import java.util.Scanner;

public class Ejercicio3_sumatoriapares {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        int numpar,sumapar;
        System.out.println("Ingrese el limite de los numeros pares");
        numpar=var.nextInt();
        sumapar=0;
        if(numpar%2==0) {
            for(int i=2;i<=numpar;i++){
                if(i%2==0){
                    sumapar=sumapar+i;
                }
            }
            System.out.println("La suma de los numeros pares hasta el "+numpar+" es: "+sumapar);
       }else{ 
            System.out.println("El numero ingresado no es par");
        }
    }    
}
