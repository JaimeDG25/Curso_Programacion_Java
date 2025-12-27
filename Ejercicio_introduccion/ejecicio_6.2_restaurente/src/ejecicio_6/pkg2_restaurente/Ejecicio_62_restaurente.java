
package ejecicio_6.pkg2_restaurente;

import java.util.Scanner;

public class Ejecicio_62_restaurente {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        double acum=0;
        double descuento=0;
        double total=0;
        System.out.println("Ingrese el numero de consumos en el restaurante");
        int num=var.nextInt();
        for(int i=1; i<=num;i++) {
            System.out.println("Ingrese el precio a pagar por el consumo "+i);
            double precio=var.nextDouble();
            acum=acum+precio;
            total=acum;
            if(acum>=70) {
                descuento=acum*0.05 ;
                total= acum-descuento;
            }   
        }
        System.out.println("Su descuento es de "+descuento);
        System.out.println("El monto a pagar es "+total);
    }   
}
