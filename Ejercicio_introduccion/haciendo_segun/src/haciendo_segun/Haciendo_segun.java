
package haciendo_segun;

import java.util.Scanner;


public class Haciendo_segun {

    public static void main(String[] args) {
        Scanner variable=new Scanner (System.in);
        int sol,ofrenda ;
        System.out.println(" Ingresar una opcion del 1 al 4:");
        System.out.println("--------------------------------------");
        sol= variable.nextInt();
        switch(sol){
            case 1:
                System.out.println("Felicidades, seleccionaste la tableta");
                System.out.println("Ingresa tu monto a ofrecer");
                ofrenda=variable.nextInt() ;
                if(ofrenda >600){
                    System.out.println("Felicidades ganaste la tablet ");
                }
                else {
                    System.out.println("Losiento pero ofrecer poco");
                }
                break; 
            case 2: 
                System.out.println("Felicidades, seleccionaste la computadora");
                ofrenda=variable.nextInt() ;
                if(ofrenda >200){
                    System.out.println("Felicidades ganaste la tablet ");
                }
                else {
                    System.out.println("Losiento pero ofrecer poco");
                }
                
                break;
            case 3:
                System.out.println("Felicidades, seleccionaste el celular");
                ofrenda=variable.nextInt() ;
                if(ofrenda >900){
                    System.out.println("Felicidades ganaste la tablet ");
                }
                else {
                    System.out.println("Losiento pero ofrecer poco");
                }
                break;
            case 4:
                System.out.println("Felicidades, seleccionaste la consola");
                ofrenda=variable.nextInt() ;
                if(ofrenda >1400){
                    System.out.println("Felicidades ganaste la tablet ");
                }
                else {
                    System.out.println("Losiento pero ofrecer poco");
                }
                break;
            default:
                System.out.println("jsjsj que rata"); 
                break; 
        }
    }
    
}
