
package Ejemplo2;

public class Main {

    public static void main(String[] args) {
        Acceso op=new Acceso();
        op.setNombre("Ramses");
        op.setEdad(18);
        op.setSueldo(900);
        System.out.println("Mi nombre es: "+op.getNombre());
        System.out.println("Mi edad es: "+op.getEdad());
        System.out.println("Mi sueldo es: "+op.getSueldo());
    }
    
}
