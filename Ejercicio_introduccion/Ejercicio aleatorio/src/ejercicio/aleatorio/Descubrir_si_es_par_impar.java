
package ejercicio.aleatorio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Descubrir_si_es_par_impar {

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
       int numero;
       numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero//Digite 0 para salir"));
       while(numero!=0){
           if (numero%2==0) {
               JOptionPane.showMessageDialog(null, "El numero es par");  
           }else{
               JOptionPane.showMessageDialog(null, "El numero es impar");
           }
           numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero//Digite 0 para salir"));
       }
       JOptionPane.showMessageDialog(null, "Fin");  
    }
    
}
