
package ejercicio_1_mayor;

import java.util.Scanner;

public class Ejercicio_1_mayor {

    public static void main(String[] args) {
        Scanner var=new Scanner(System.in) ;
        int num=0;
        int mayor=0;
        int menor=0;
        
        System.out.println("");
        for(int i=1 ; i<=3 ; i++) {
            System.out.println("Ingrese la nota:"+i);
            num=var.nextInt();
            if(i==1){
                mayor=num;
                menor=num;
            }else{
                if(num > mayor){
                    mayor=num;
                }
                if(num<menor){
                    menor=num;
                }
            }
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
    }
    
}
