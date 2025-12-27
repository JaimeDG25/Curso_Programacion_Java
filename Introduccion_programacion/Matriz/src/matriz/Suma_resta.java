
package matriz;

import java.util.Scanner;

public class Suma_resta {

    public static void main(String[] args) {
        //SUMA DE MATRICEZ
        Scanner var=new Scanner (System.in);
        
        System.out.println("Ingresa el numero de filas");
        int nfil=var.nextInt();
        System.out.println("Ingresa el numero de columnas");
        int ncol=var.nextInt();
        
        System.out.println("La primera matriz");
        int mark3[][]=new int [nfil][ncol];
        
        for (int i = 0; i < nfil; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print("Ingrese matriz en: ["+i+"] ["+j+"]: ");
                mark3[i][j]=var.nextInt();
            }
        }
        System.out.println("La segunda matriz");
        int mark4[][]=new int [nfil][ncol]; 
        
        for (int i = 0; i < nfil; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print("Ingrese matriz en: ["+i+"] ["+j+"]: ");
                mark4[i][j]=var.nextInt();
            }
        }
        System.out.println("La suma de estas es");
        int mark5[][]=new int [nfil][ncol];
        for (int i = 0; i < nfil; i++) {
            for (int j = 0; j < ncol; j++) { 
                mark5[i][j]=mark3[i][j]+mark4[i][j];
            }
        }
        
        for (int i = 0; i <nfil; i++) {
            for (int j = 0; j <ncol; j++) {
                System.out.print(mark5[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
