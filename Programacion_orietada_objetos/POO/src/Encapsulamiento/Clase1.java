
package Encapsulamiento;

public class Clase1 {
    private final String nombre;
    private int edad;
    int numero;

    public Clase1(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }
    public void mostrar_Datos(){
        System.out.println("El nombre incambiable es: "+nombre);
        System.out.println("La edad modificable es: "+edad);
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
