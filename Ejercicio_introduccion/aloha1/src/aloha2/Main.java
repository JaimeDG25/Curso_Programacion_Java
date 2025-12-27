
package aloha2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        Ejemplo2 op=new Ejemplo2();
        JOptionPane.showMessageDialog(null,"Hola como estas");
        System.out.print("El primer numero sera: ");
        int n1= var.nextInt();
        System.out.print("El segundo numero sera: ");
        int n2= var.nextInt();
             
        System.out.println("El Area es:"+op.Area(n1, n2));
        System.out.println("El Perimetro es: "+op.Perimetro(n1, n2));
   }
    
}
