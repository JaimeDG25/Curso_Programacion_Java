
package ClasesYObjetos;

public class Objeto {
    //Atributos
    String objeto;
    int precio;
    String uso;
    
    //Metodos
    public static void main(String [] args){
        Objeto op=new Objeto();
        op.objeto= "Laptop";
        op.precio= 1500;
        op.uso="Navegar por internet";
        
        System.out.println("El nombre del objeto es: "+op.objeto);
        System.out.println("El precio del objeto es: "+op.precio);
        System.out.println("El uso del objeto es: "+op.uso);
    }
    
}
