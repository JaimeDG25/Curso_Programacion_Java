
package aloha1;

import java.util.Scanner;

public class Prueba1 {

    Scanner var=new Scanner(System.in);
    
    public int[] arreglo(int a) {
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Ingrese el valor para el elemento " + (i + 1) + ": ");
            arr[i] = var.nextInt();
        }
        return arr;
    }

    public void mostrar(int a,int arr[]){
        int menor = arr[0];
        int mayor = arr[0];
        for (int i = 0; i < a; i++) {
            if (arr[i]<menor) {
                menor=arr[i];
            } 
            if (arr[i]>mayor) {
                mayor=arr[i];
            } 
        }
        System.out.println("El menor de los arrelgo es:"+menor);
        System.out.println("El menor de los arrelgo es:"+mayor);
        
    }
}
