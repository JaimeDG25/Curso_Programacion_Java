
package Parametros_argumentos;

import java.util.Scanner;


public class Main {

    public static void main(String [] args){
        Scanner var=new Scanner (System.in);
        
        System.out.println("Hola como estas aqui usampos parametros y argumentos");
        System.out.println("Ingrese el primer numero ");
        int numero1= var.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int numero2= var.nextInt();
        
        //Llamando a mi java class Operacion y definiendo op
        Operacion op=new Operacion ();
        //Mostrando los metodos de mi op
        op.sumar(numero1,numero2);
        op.restar(numero1, numero2);
        op.multiplicar(numero1, numero2);
        op.dividir(numero1, numero2);
        //Mostando los resultado
        op.mostrar_resultados();
        
    }
}
