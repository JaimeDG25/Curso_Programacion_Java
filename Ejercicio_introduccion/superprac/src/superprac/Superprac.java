
package superprac;

//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Superprac {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int nota1, nota2, nota3;
    
    System.out.println("Ingrese la primera nota: ");
    nota1 = sc.nextInt();
    
    
    if(nota1 < 1 || nota1 > 20) {
      System.out.println("La nota ingresada está fuera del rango permitido.");
      return;
    }
    
    System.out.println("Ingrese la segunda nota: ");
    nota2 = sc.nextInt();
    
    if(nota2 < 1 || nota2 > 20) {
      System.out.println("La nota ingresada está fuera del rango permitido.");
      return;
    }
    
    System.out.println("Ingrese la tercera nota: ");
    nota3 = sc.nextInt();
    
    if(nota3 < 1 || nota3 > 20) {
      System.out.println("La nota ingresada está fuera del rango permitido.");
      return;
    }
    
    System.out.println("Todas las notas están dentro del rango permitido.");
  }
}
        
    
    

