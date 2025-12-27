
package ejercicio_asterisco;

import java.util.Scanner;

public class Ejercicio_asterisco {
  
    
    public static void main(String[] args) {
        Scanner variable = new Scanner (System.in);
        int altura,n;
        System.out.println("Dame la altura de tu escalera gil");
        n=variable.nextInt();
        //altura=variable.nextInt();
        /*for(int n=1;n<=altura; n++) {
            for(int i=0;i<n; i++) {
            System.out.print("1");
            }
            System.out.println("a");
        }*/
        while (n>0){
            for(int i=1; i<=n;i=i+1 ) {
            System.out.print(i+"");
            }
            System.out.println(" ");
            n=n-1; 
        }
    }
    
}
