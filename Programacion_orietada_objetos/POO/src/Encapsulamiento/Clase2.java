
package Encapsulamiento;

public class Clase2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Clase1 op=new Clase1("Suiza",18,10000);
        op.setEdad(20);
        op.numero=578;
        op.mostrar_Datos();
        System.out.println("La edad del alumno es : "+op.getEdad());
        System.out.println("El numero random es : "+op.numero);
    }
    
}
