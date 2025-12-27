/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traer_5_pares;

import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class Traer_5_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner var= new Scanner (System.in);
        int num1,num2, i;
        System.out.println("Elije un limite para sacar los numeros pares");
        num1=var.nextInt();
        System.out.println("---------------------------------------");
        for ( i=1;i<=num1 ;i++){
            if(i%2==0){
                System.out.println(""+i);
            }
        }
        System.out.println("Elije un limite para sacar los numeros impares");
        num2=var.nextInt();
        System.out.println("---------------------------------------");
        for ( i=1;i<=num2 ;i++){
            if(i%2!=0){
                System.out.println(""+i);
            }
        }
    }
    
}
