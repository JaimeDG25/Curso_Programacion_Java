
package Ejemplo1;

public class Instancia {
    
    //Metodo de isntancia
    public void instancia(){
        System.out.println("ESTE ES UN METODO DE INSTANCIA");
    }
    //Metodo estatico
    public static void  estatico(){
        System.out.println("ESTE ES UN METODO ESTATICO");
    }
    //Metodo valor con retorno 
    public int retornar(int a, int b){
        return a+b; 
    }
    //Metodo valor sin retorno
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}
