
package cadenas_texto;

public class Cadenas_texto {

    public static void main(String[] args) {
        String texto1="Hola, mi nombre es ";
        String texto2="Goku ";
        String texto3="Tu tio ";
        String texto4="El mandarin ";
        
        String resultado1=texto1+texto2;
        System.out.println(resultado1);
        
        System.out.println("---------------");
        String resultado2=texto3+texto4;
        System.out.println(resultado2);
        
        System.out.println("---------------");
        //Hallar la longitud del texto 
        String texto5 = "Hola, mundo!";
        int longitud = texto5.length();
        System.out.println(longitud);
        
        System.out.println("---------------");
        // primerCaracter tendrá el valor 'H'
        String texto6 = "Hola";
        char primerCaracter = texto6.charAt(1); 
        System.out.println(primerCaracter);
        
        System.out.println("---------------");
        String texto7 = "Hola, mundo!";
        // subcadena1 tendrá el valor "mundo!"
        String subcadena1 = texto7.substring(5); 
        System.out.println(subcadena1);
        // subcadena2 tendrá el valor "Hola"
        String subcadena2 = texto7.substring(0, 4); 
        System.out.println(subcadena2);
        
        System.out.println("---------------");
        // resultado tendrá el valor "Hola, Mundo"
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String resultado3 = cadena1.concat(", ").concat(cadena2); 
        System.out.println(resultado3); 
        
        System.out.println("---------------");
        String texto8 = "Hola";
        String texto9 = "hola";
        // sonIguales será false
        boolean sonIguales = texto8.equals(texto9); 
        // sonIgualesIgnorandoMayusculas será true
        boolean sonIgualesIgnorandoMayusculas = texto8.equalsIgnoreCase(texto9); 
        System.out.println(sonIguales);
        System.out.println(sonIgualesIgnorandoMayusculas);
        
        System.out.println("---------------");
        String texto10 = "Hola, hola, mundo!";
        // primeraAparicion será 5
        int primeraAparicion = texto10.indexOf("hola"); 
        // ultimaAparicion será 12
        int ultimaAparicion = texto10.lastIndexOf("hola"); 
        System.out.println(primeraAparicion);
        System.out.println(ultimaAparicion);
         
        System.out.println("---------------");
        String texto11 = "Hola, mundo!";
        // nuevoTexto tendrá el valor "H0la, mund0!"
        String nuevoTexto = texto11.replace('o', '@'); 
        // otroTexto tendrá el valor "Hola, universo!"
        String otroTexto = texto11.replace("mundo", "universo"); 
        System.out.println(nuevoTexto);
        System.out.println(otroTexto);


    }
    
}
