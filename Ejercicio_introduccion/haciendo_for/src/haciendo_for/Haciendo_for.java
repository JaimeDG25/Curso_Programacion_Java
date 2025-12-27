
package haciendo_for;

import java.util.Scanner;

public class Haciendo_for {

    
    public static void main(String[] args) {
        Scanner variable=new Scanner (System.in);
        int j;
        System.out.println(" Ingresa el limite de repeticiones");
        j=variable.nextInt();
        
        for (int i=1 ;i<=j; i=i+1){
            System.out.println("i="+i);
        }
        
    }
    
}
