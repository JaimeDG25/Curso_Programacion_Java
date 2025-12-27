
package estructura_datos_semana04;

import java.util.ArrayList;
import java.util.List;

public class dos {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> prueba=new ArrayList<>();
        prueba.add(10);
        prueba.add(20);
        prueba.add(-34);
        prueba.add(1);
        prueba.add(16);
        int i=0;
        System.out.println("El tamaño es de: "+prueba.size());
        while(i<prueba.size()){
            System.out.println(""+prueba.get(i));
            i++;
        }
        prueba.sort(null);
        System.out.println("El ordenamiento es de: "+prueba);
    }
    
}
