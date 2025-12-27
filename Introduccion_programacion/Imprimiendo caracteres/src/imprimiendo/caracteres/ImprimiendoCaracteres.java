
package imprimiendo.caracteres;
import java.util.Scanner;
public class ImprimiendoCaracteres {

    public static void main(String[] args) {
        System.out.println("Hola mundo ");
        System.out.println("Para poder imprimir algo solo"
                + "se coloca Sys + ctrl espacio");
        System.out.println(""); 
        
        Scanner zzz=new Scanner (System.in);
        String Nombre, Apellido;
        int edad;
        char letra;
        System.out.println("Ingrese su nombre");
        Nombre=zzz.nextLine();
        
        System.out.println("Ingrese su apellido");
        Apellido=zzz.nextLine();
        
        System.out.println("Ingrese su edad");
        edad=zzz.nextInt(); 
        
        System.out.println("Su nombre completo es: "+Nombre+" "+Apellido); 
        System.out.println("Su edad es: "+edad);
        
        System.out.println("Imprimer una letra");
        letra=zzz.next().charAt(1);
        System.out.println("su letra es "+letra);
    }
    
}
