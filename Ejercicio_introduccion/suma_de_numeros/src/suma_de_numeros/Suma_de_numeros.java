/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_de_numeros;

import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class Suma_de_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        int i,num,suma;
        System.out.println("Ingrese un limite para la suma de los numeros");
        num=var.nextInt();
        suma=0;
        for(i=1;i<num;i++){
            suma=suma+i;      
        }
        System.out.println(""+suma);
    }
    
}
