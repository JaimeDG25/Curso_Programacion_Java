
package asteriscos_1;

import java.util.Scanner;

public class Asteriscos_1 {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        System.out.print("Ingresa el numero limitante: ");
        int lim=var.nextInt();
        
        for (int i = 1; i <= lim; i++) {
            
            for (int j = 1; j <=lim-i; j++) {
                System.out.print(" "); }
            
            for (int k = 1; k <=i; k++) {
             System.out.print(" "+i);   }
            System.out.println(" ");
        }
         for (int i = lim-1; i >=1; i--) {
            
            for (int j = lim-i; j >=i; j--) {
                System.out.print(" "); }
            
            for (int k =i; k >=1; k--) {
             System.out.print(" "+i);   }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        for (int i = lim; i >= 1; i--) {
            for (int j =i; j>=1; j--) {
                System.out.print(" "+i); 
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        for (int i = 1; i <= lim; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+i); 
            }
            System.out.println(" ");
        }
        
        
        
        
        
        /*for (int k = 0; k < lim; k++) {
            System.out.print(" *");    
        }
        System.out.println("");
        
        for (int i = 0; i < lim-2; i++) {
            System.out.print(" *");
            for (int j = 0; j < lim-2; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        
        for (int k = 0; k < lim; k++) {
            System.out.print(" *");    
        }
        System.out.println(" ");*/
        
        
    }
    
}
