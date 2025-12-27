package tipos.de.ordenamiento;
import java.util.Random;
import java.util.Scanner;
public class ordenamiento_seleccion {

    public static void main(String[] args) {
        Random aleatorio=new Random(); 
        Scanner var=new Scanner(System.in);
        long startTime = System.nanoTime();
        // Lógica del algoritmo aquí
        System.out.println("Ordenamietno de tipo seleccion: ");
        // Ingresamos el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int largo=1000;
        System.out.println(largo);
        int arr[]=new int[largo] ;
        int pos, aux;
        // Ingresamos los datos que va a tener nuestro arreglo
        for (int i = 0; i < largo; i++) {
            arr[i]=aleatorio.nextInt(1000);} 
        
        //Proceso del metodo de Ordenamiento de seleccion
        for (int i = 0; i < largo; i++) {
            pos=i;
            for (int j = i+1; j < largo; j++) {
                if (arr[j]<arr[pos]) {
                    pos=j;} }
            aux= arr[i];
            arr[i]=arr[pos]; 
            arr[pos]=aux;}
        //Mostramos en consola el arreglo ordenado
        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i < largo; i++) {
            System.out.print(" "+arr[i]+"-");}
        System.out.println("");
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        // Convertir nanosegundos a milisegundos
        long totalTimeInMillis = totalTime / 1000000;
        System.out.println("Tiempo de ejecución: " + totalTimeInMillis + " milisegundos");
    } }
