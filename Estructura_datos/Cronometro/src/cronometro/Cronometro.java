
package cronometro;

public class Cronometro {

    public static void main(String[] args) {
        // TODO code application logic here
        long starTime= System.nanoTime();
        //LA LOGICA DEL ALGORITMO VA EN ESTE ESPACIO
        int a=134;
        int b=12414;
        int c=a+b;
        System.out.println("La respuesta es de "+c);
        //HASTA AQUI QUE TERMINE TU CODIGO MI KING
        long endTime= System.nanoTime();
        long totalTime= endTime-starTime;
        //CONVERTIR DE NANO A MILI SEGUNDOS
        long totalTimemilis= totalTime/1000000;
        System.out.println("Tiempo de ejecucion "+totalTimemilis+" milisegundos");
    }
    
}
