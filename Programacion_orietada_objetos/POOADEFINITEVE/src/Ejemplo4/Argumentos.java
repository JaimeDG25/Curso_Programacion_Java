
package Ejemplo4;

public class Argumentos {
    //Le pasamos argumentos para luego llamarlos en otro lugar aun mas lejos 
    // donde no quepa el infinito de todos los numeros imaginarios 
    public int Suma(int n1, int n2){
        return n1+n2;
    }
    public int Resta(int n1, int n2){
        return n1-n2;
    }
    public int Multiplicacion(int n1, int n2){
        return n1*n2;
    }
    public float Division(int n1, int n2){
        return n1/n2;
    }
}
