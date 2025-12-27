
package ejercicio_piero;

import java.util.Scanner;


public class Ejercicio_piero {


    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        String n1,n2,clave1,clave2;
        
        System.out.println("Crea tu nombre de usuario");
        n1=var.nextLine();
        
        System.out.println("Crea tu contraseña");
        clave1=var.nextLine();
        
        System.out.println("Ingresa tu nombre de usuario");
        n2=var.nextLine();
        
        if(n2.equals(n1)){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Usuario incorrecto");
            return; 
        } 
        
        System.out.println("Ingresa tu contraseña");
        clave2=var.nextLine();
        
        if(clave2.equals(clave1)){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Contra incorrecta");
          
        }
    }
}
