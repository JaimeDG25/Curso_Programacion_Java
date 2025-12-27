
package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        //matriz con valores determinados
        int markuno[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i = 0; i < 3; i++) { // imprime las filas
            for (int j = 0; j < 4; j++) { //imprime las columnas
                System.out.print(markuno[i][j]);
            }
            System.out.println(" ");
        }
        //matriz con valores introducidos
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
