
package tipos.de.ordenamiento;

import java.util.Scanner;

public class TiposDeOrdenamiento {

    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("Ordenamietno de tipo seleccion: ");
        System.out.print("Ingrese el tamaño del arreglo: ");
        int largo=var.nextInt();
        int arr[]=new int[largo] ;
        int pos, aux;
        for (int i = 0; i < largo; i++) {
            System.out.print("Ingresa el digito ["+(i+1)+"]: ");
            arr[i]=var.nextInt();
        } 
        
        for (int i = 0; i < largo; i++) {
            pos=i;
            for (int j = i+1; j < largo; j++) {
                if (arr[j]<arr[pos]) {
                    pos=j;
                }
            }
            aux= arr[i];
            arr[i]=arr[pos];
            arr[pos]=aux;
        }
        for (int i = 0; i < largo; i++) {
            System.out.print(" "+arr[i]+"-");
        }
    }
    
}
