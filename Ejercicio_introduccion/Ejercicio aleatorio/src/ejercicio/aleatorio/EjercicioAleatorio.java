
package ejercicio.aleatorio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioAleatorio {
    
    public static void main(String[] args) {
       Scanner var = new Scanner(System.in);
       int numero,contador=0,random;
       random=(int)(Math.random()*100);
        do {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            if (random>numero) {
                System.out.println("Digite un numero mayor");             
            }else{
                System.out.println("Digite un numero menor");
            }
            contador++; 
        } while (random!=numero||contador<4);
        if (random==numero) {
            System.out.println("Adivinaste el numero en "+contador+" intentos");
        }else{
        System.out.println("Buena suerte a la proxima");
        }
    } 
}
