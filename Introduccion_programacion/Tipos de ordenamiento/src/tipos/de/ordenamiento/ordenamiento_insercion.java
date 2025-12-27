
package tipos.de.ordenamiento;
import java.util.Random;
import java.util.Scanner;
public class ordenamiento_insercion {
    public static void main(String[] args) {
        Random aleatorio=new Random();
        Scanner var=new Scanner(System.in);
        long startTime = System.nanoTime();
        // Lógica del algoritmo aquí
        System.out.println("Ordenamiento de tipo insercion");
        System.out.print("Ingrese el tamaño del arreglo: ");
        int largo=1000;
        System.out.println(largo);
        int arr[]=new int[largo] ;
        int pos, aux;
        for (int i = 0; i < largo; i++) {
            arr[i]=aleatorio.nextInt(1000);
        }   
        for (int i = 0; i < largo; i++) {
            pos=i;
            aux=arr[i];
            while(pos>0 && arr[pos-1]>aux){
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=aux;
        }
        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i < largo; i++) {
            System.out.print(" "+arr[i]+"-");
        }
        System.out.println("");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        // Convertir nanosegundos a milisegundos
        long totalTimeInMillis = totalTime / 1000000;
        System.out.println("Tiempo de ejecución: " + totalTimeInMillis + " milisegundos");
    }  
}
