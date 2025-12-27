
package Ejemplo1;


public class Main {

    public static void main(String[] args) {
        
        //Creando un objeto para llamar a mi metodo instancia
        Instancia op=new Instancia();
        op.instancia();
        System.out.println("=============================================");
        
        //No necestia ser llamado por un objeto
        Instancia.estatico();
        System.out.println("=============================================");
        
        //Valor con retorno
        Instancia ret=new Instancia ();
        int resultado=ret.retornar(4, 5);
        System.out.println("Aqui tenes tu resultado: ["+resultado+"]");
        System.out.println("=============================================");
        
        //Valor sin retorno 
        Instancia sinret=new Instancia();
        sinret.mensaje("Jalo de mi base");
        System.out.println("=============================================");
        
    }
    
}
