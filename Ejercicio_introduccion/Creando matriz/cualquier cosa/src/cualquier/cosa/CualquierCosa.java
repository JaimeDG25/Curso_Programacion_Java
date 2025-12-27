
package cualquier.cosa;

import java.util.Scanner;

public class CualquierCosa {

    public static void main(String[] args) {
     Scanner var=new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int fils=var.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int colums=var.nextInt();
        //Primero es la cantidad hortizontal y luego la vertical
        int matriz[][]=new int[fils][colums];
        for (int i = 0; i < fils; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print("Digite el numero en ["+i+"]["+j+"]: " );
                matriz [i][j]=var.nextInt();
            }
        }
        for (int i = 0; i < fils; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }     
     
    }  
}
