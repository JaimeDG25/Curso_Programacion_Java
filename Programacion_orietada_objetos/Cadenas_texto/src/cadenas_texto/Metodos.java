
package cadenas_texto;

public class Metodos {

    public static void main(String[] args) {
        
        //toString(): Convierte un objeto a una representación de cadena.
        Integer numero = 42;
        String numeroComoCadena = numero.toString();
        System.out.println(numeroComoCadena);
        
        //valueOf(): Obtiene la representación de cadena de un tipo primitivo u objeto
        int entero = 123;
        String enteroComoCadena = String.valueOf(entero);
        System.out.println(enteroComoCadena);
        
        //concat(): Para concatenar (unir) una cadena al final de otra.
        String cadena1 = "Hola";
        String cadena2 = " Mundo";
        String resultado = cadena1.concat(cadena2);
        System.out.println(resultado); 
        
        // toUpperCase() y toLowerCase(): 
        //Para convertir una cadena a mayúsculas o minúsculas, respectivamente.
        String minusculas = "hola";
        String mayusculas = minusculas.toUpperCase();
        System.out.println(mayusculas); // Imprime "HOLA"

        String mayusculas2 = "HOLA";
        String minusculas2 = mayusculas2.toLowerCase();
        System.out.println(minusculas2); 
        
        //strip(): Devuelve una cadena luego de remover los espacios iniciales y finales.
        String cadenaConEspacios = "  Hola Mundo  ";
        String sinEspacios = cadenaConEspacios.strip();
        System.out.println(sinEspacios); 
        
        //replace(): Devuelve una cadena luego de reemplazar una subcadena por otra.
        String original = "Hola Mundo";
        String reemplazada = original.replace("Mundo", "Amigo");
        System.out.println(reemplazada);
        
        //indexOf(): Devuelve el índice de la primera ocurrencia de una cadena.
        String frase1 = "Hola Mundo";
        int indice = frase1.indexOf("Mundo");
        System.out.println(indice); 
        
        // lastIndexOf(): Devuelve el índice de la última ocurrencia de una cadena.
        String frase2 = "Hola Mundo Mundo";
        int ultimoIndice = frase2.lastIndexOf("Mundo");
        System.out.println(ultimoIndice);

        //equals(): Devuelve un valor booleano indicando si la cadena es igual a otra.
        String cadena3 = "Hola";
        String cadena4 = "Hola";
        boolean sonIguales = cadena3.equals(cadena4);
        System.out.println(sonIguales);
        
        // compareTo(): Devuelve un valor entero positivo si la primera cadena es mayor a la segunda; 
        //negativo si es menor, y cero si son iguales.
        String cadena5 = "Manzana";
        String cadena6 = "Banana";
        int comparacion = cadena5.compareTo(cadena6);
        System.out.println(comparacion); 

        // charAt(): Devuelve el carácter que se encuentra en el índice proporcionado.
        String palabra = "Java";
        char primerCaracter = palabra.charAt(0);
        System.out.println(primerCaracter); 
        
        //substring(): Devuelve una subcadena ubicada en el rango proporcionado.
        String frase = "Programación en Java";
        String subcadena = frase.substring(13, 18);
        System.out.println(subcadena);
        
        //split(): Divide una cadena en partes tomando como base el delimitador proporcionado.
        String lista = "Manzana,Naranja,Uva";
        String[] frutas = lista.split(",");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
       
    }
    
}
