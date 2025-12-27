
package busqueda_arreglo;

import java.util.Scanner;

public class Busqueda_arreglo {

    public static void main(String[] args) {
        Scanner var=new Scanner(System.in); 
        int arreglo[]={5,2,7,5,1};
        System.out.println("Digite el numero que desea buscar");
        int dato=var.nextInt();
        boolean con=false;
        int i =0;
        
        while(i<5 && con==false){
            if (arreglo[i]==dato) {
                con=true;
            }
            i++;
        }
        if (con==false) {
            System.out.println("Tu digito no se encontro ");
        }else{
            System.out.println("Tu numero se encuentra en la posicion: "+(i-1));
        }
    }
}
