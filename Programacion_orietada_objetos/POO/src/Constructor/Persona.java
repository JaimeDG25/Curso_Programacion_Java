
package Constructor;


public class Persona {
    String nombre;
    int edad;
    
    public Persona(String nombres,int edad){
        //este no es con this
        nombre= nombres;
        // uno es con this
        this.edad= edad;
    }
    public void mostrardatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
