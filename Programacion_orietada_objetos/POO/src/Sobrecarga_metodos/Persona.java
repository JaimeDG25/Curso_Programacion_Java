
package Sobrecarga_metodos;

public class Persona {
    String nombre;
    String apellido;
    int numero;
    
    public Persona (String nombre,String apellido,int numero){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numero=numero;
    }
    public void saludar(){
        System.out.printf("Estamos saludando a esta persona: %s ,%s%n",apellido,nombre);
    }
    public void saludar(int km){
        System.out.printf("Esta persona puede correr %s km por hora",km);
    }
}
