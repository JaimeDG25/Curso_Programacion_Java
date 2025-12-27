
package estructura_datos_semana04;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class uno {

    public static void main(String[] args) {
        // TODO code application logic here
        int []numeros=new int[5];
        String []palabras=new String[5];
        int []copia=new  int [numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento en el indice: "+i));
        }
        for (int i:numeros) {
            System.out.println("Elementos sin ordenar: "+i);
        }
        System.out.println("---------------------------------------");
        Arrays.sort(numeros);
        for (int i :numeros) {
            System.out.println("Elementos ordenados"+i);
        }
        System.out.println("----------------------------------------");
        Arrays.fill( palabras,"Welcome 12");
        for (String i:palabras) {
            System.out.println("Elementos: "+i);
        }
    }
    
}
