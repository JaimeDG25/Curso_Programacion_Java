
package condicional;

import java.util.Scanner;

public class for_condicional {

    public static void main(String[] args) {
        Scanner var=new Scanner (System.in);
        System.out.println("Hata que numero quieres contar??");
        int cont=var.nextInt();
        for (int i = 1; i <= cont; i++) {
            System.out.println(""+i);
        }
    }
    
}
