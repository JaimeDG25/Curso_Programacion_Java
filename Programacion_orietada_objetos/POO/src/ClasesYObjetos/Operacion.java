
package ClasesYObjetos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int resultado;
    
    //Metodo para pedir valor de numeros
    Scanner var=new Scanner(System.in);
    public void leernumeros(){
        //numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero"));
        //numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero"));
        System.out.println("Ingrese el primer numero");
        numero1=var.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=var.nextInt(); 
    }
    //Metodo para sumar los numeros
    public void sumar(){
        suma=numero1+numero2;
    }
    //Metodo para sumar los numeros
    public void restar(){
        resta=numero1-numero2;
    }
    //Metodo para sumar los numeros
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    //Metodo para sumar los numeros
    public void dividir(){
        division=numero1/numero2;
    }
    public void mostrar_resultados(){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
    }
    
}
