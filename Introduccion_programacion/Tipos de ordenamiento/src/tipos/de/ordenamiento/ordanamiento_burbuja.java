
package tipos.de.ordenamiento;
import java.util.Random;
import java.util.Scanner;
public class ordanamiento_burbuja {
    public static void main(String[] args) {   
        Random aleatorio=new Random();
        Scanner var=new Scanner(System.in); 
        long startTime = System.nanoTime();
        // Lógica del algoritmo aquí 
        System.out.println("Ordenamiento tipo burbuja");
        System.out.print("Ingrese la cantidad de numeros: ");
        int cant=1000;
        System.out.println(cant);
        int num[]=new int [cant];
        int aux;
        for (int i = 0; i < cant; i++) {
            num[i]=aleatorio.nextInt(1000);
        }
        //Proceso del metodo 
        for (int i = 0; i < cant-1; i++) {
            for (int j = 0; j < cant-1; j++) {
                if (num[j]>num[j+1]) {
                  aux=num[j];
                  num[j]=num[j+1];
                  num[j+1]=aux;  
                }
            }
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("/"+num[i]+" ");
        }
        System.out.println("");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        // Convertir nanosegundos a milisegundos
        long totalTimeInMillis = totalTime / 1000000;
        System.out.println("Tiempo de ejecución: " + totalTimeInMillis + " milisegundos");
    }  
}
