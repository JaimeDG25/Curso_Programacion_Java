
package Ejemplo3;

public class Main {

    public static void main(String[] args) {
        Constructor op=new Constructor("Hermitaño",18,900);
        
        System.out.println("El nombre es: "+op.getNombre());
        System.out.println("Mi edad es: "+op.getEdad());
        System.out.println("Mi sueldo mensual es: "+op.getSueldo());
    }
    
}
