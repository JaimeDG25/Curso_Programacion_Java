
package list_learn;

import java.util.ArrayList;
import java.util.List;

public class List_learn {


    public static void main(String[] args) {
    // Declarar una lista de nombres
        List<String> listado = new ArrayList<>();

        // Agregar elementos a la lista
        listado.add("Alice");
        listado.add("Bob");
        listado.add("Charlie");
        listado.add("David");
        listado.add("Sujeto 1");
        listado.add("Sujeto 2");
        listado.add("Sujeto 3");
        listado.add("Sujeto 4");

        // Acceder a un elemento por índice
        String segundoNombre = listado.get(1);
        System.out.println("Segundo nombre: " + segundoNombre);

        // Modificar un elemento
        listado.set(2, "Eve");
        System.out.println("Lista después de cambiar el tercer nombre: " + listado);

        // Eliminar un elemento
        listado.remove(0);
        System.out.println("Lista después de eliminar el primer nombre: " + listado);

        // Obtener el tamaño de la lista
        int tamaño = listado.size();
        System.out.println("Tamaño de la lista: " + tamaño);

        // Iterar a través de la lista e imprimir los nombres
        System.out.println("Nombres en la lista:");
        for (String nombre : listado) {
            System.out.println(nombre);
        }
    }
    
}
