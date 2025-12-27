
package Retorno_valores;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner var=new Scanner (System.in);
        
        System.out.println("Hola como estas aqui usamos retorno de valores");
        
        System.out.println("Ingrese el primer numero ");
        int numero1= var.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int numero2= var.nextInt();
        
        //Llamando a mi java class Operacion y definiendo op
        Operacion op=new Operacion ();
        //Mostrando los metodos de mi op
        int suma = op.sumar(numero1,numero2);
        int resta= op.restar(numero1, numero2);
        int multiplicacion= op.multiplicar(numero1, numero2);
        int division= op.dividir(numero1,numero2);
        //Mostando los resultado
        op.mostrar_resultados(suma,resta,multiplicacion,division);
        
    }
}
