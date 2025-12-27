
package estructura_datos_semana04;

import java.util.ArrayList;
import java.util.List;

public class Estructura_datos_semana04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un ArrayList para almacenar los postres y sus ingredientes         
       ArrayList<ArrayList<String>> listaPostres = new ArrayList<>();          
       
       // Añadir postres y sus ingredientes         
       listaPostres.add(new ArrayList<>(List.of("Pastel de chocolate", "Harina", "Azúcar", "Cacao", "Huevos", "Leche", "Mantequilla")));
       listaPostres.add(new ArrayList<>(List.of("Helado de vainilla", "Leche", "Crema", "Azúcar", "Yemas de huevo", "Vainilla")));         
       listaPostres.add(new ArrayList<>(List.of("Tarta de manzana", "Manzanas", "Harina", "Azúcar", "Mantequilla", "Huevos", "Canela"))); 
       
       // Añadir más postres y sus ingredientes         
       listaPostres.add(new ArrayList<>(List.of("Galletas de chispas de chocolate", "Harina", "Azúcar", "Mantequilla", "Huevo", "Chispas de chocolate")));   
       listaPostres.add(new ArrayList<>(List.of("Flan de caramelo", "Leche", "Huevos", "Azúcar", "Vainilla", "Caramelo líquido")));         
      
       // Cambiar un ingrediente en un postre         
       int indicePostre = 0; // Índice del postre que quieres modificar (0 para el primer postre)         
       int indiceIngrediente = 2; // Índice del ingrediente que quieres cambiar (3 para el cuarto ingrediente)  
       
       String nuevoIngrediente = "Azucar blanca"; // Nuevo ingrediente     
       
       // Modificar el ingrediente en el ArrayList del postre específico       
       listaPostres.get(indicePostre).set(indiceIngrediente, nuevoIngrediente);         
       // Imprimir la lista de postres actualizada con sus ingredientes        
       for (ArrayList<String> postre : listaPostres) {             
           System.out.println("Postre: " + postre.get(0));             
           System.out.println("Ingredientes:");             
           for (int i = 1; i < postre.size(); i++) {                
               System.out.println("- " + postre.get(i));             }            
           System.out.println();         }     
        
    }
}
